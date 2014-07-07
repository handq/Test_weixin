package com.csst.services.coreService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import com.csst.popular.api.MenuAPI;
import com.csst.popular.bean.BaseResult;
import com.csst.popular.bean.xmlmessage.XMLImageMessage;
import com.csst.popular.bean.xmlmessage.XMLNewsMessage;
import com.csst.popular.bean.xmlmessage.XMLNewsMessage.Article;
import com.csst.popular.bean.xmlmessage.XMLTextMessage;
import com.csst.services.Thread.TokenThread;
import com.csst.services.common.MessageUtil;	
import com.csst.services.util.Bus;
import com.csst.services.util.Common;
import com.csst.services.util.Location;
import com.csst.services.util.Weather;


/** 
 * 核心服务类 
 *  
*
 * @date 2013-05-20 
 */  
public class CoreService {  
    /** 
     * 处理微信发来的请求 
     *  
     * @param request 
     * @return 
     * @throws Exception  
     */  
    public static String processRequest(HttpServletRequest request) throws Exception {  
        String respMessage = null;  
            // 默认返回的文本消息内容   
            String respContent = "目前正在测试中，暂时不能使用~";  
            // xml请求解析  
            Map<String, String> requestMap = MessageUtil.parseXml(request);  
            // 发送方帐号（open_id）  
            String fromUserName = requestMap.get("FromUserName");  
            // 公众帐号  
            String toUserName = requestMap.get("ToUserName");  
            // 消息类型  
            String msgType = requestMap.get("MsgType");  
            //消息内容
           String msgContent = requestMap.get("Content");
           //自定义菜单推送的key
           String EventKey = requestMap.get("EventKey");
            /*// 回复文本消息  
            TextMessage textMessage = new TextMessage();  
            textMessage.setToUserName(fromUserName);  
            textMessage.setFromUserName(toUserName);   
            textMessage.setCreateTime(new Date().getTime());  
            textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);  
            textMessage.setFuncFlag(0);
            //主要是为了服务于主菜单。当选择数字1-8时，在map里存入数字和服务的键值对，然后再往下收到的消息就去这里取值，一次获得现在的服务类别。
            //当输入？，清空map，输入不符合的消息就提示输入错误。
            System.out.println(EventKey+"=="+msgType);*/
            // 文本消息  
            if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {  
            	if("1".equalsIgnoreCase(msgContent)){
            		 respContent = "您选择了天气预报，回复天气+城市名称，获得天气情况，例如回复：天气北京";
            	}else if("2".equalsIgnoreCase(msgContent)){
            		respContent = "您选择了位置服务，请点击右下角的'+',打开快捷菜单，点击发送位置。";
            	}else if("3".equalsIgnoreCase(msgContent)){
            		respContent = "<a href='http://hdq.nat123.net/user/main.jsp'>测试页面</a>";
            	}else if("4".equalsIgnoreCase(msgContent)){
            		respContent = "您选择了公交查询，回复公交+城市名+','+公交线路，例如：公交北京58";
            	}else if("5".equalsIgnoreCase(msgContent)){
            		respContent = "只要发送您的一段语音，我就可以识别出您说的是什么，神奇吧，快来发送语音消息试试看吧~";
            	}else if("6".equalsIgnoreCase(msgContent)){
            		respContent = "<a href='http://hdq.nat123.net/bootstrapDemo/theme.html'>官网</a>";
            	}else if("7".equalsIgnoreCase(msgContent)){
            		respContent = "<a href='http://hdq.nat123.net/user/main.html'>餐饮预订</a>";
            	}else if("8".equalsIgnoreCase(msgContent)){
            		respContent = "<a href='http://hdq.nat123.net/user/main.html'>在线预约</a>";
            	}else if("？".equalsIgnoreCase(msgContent) || "?".equalsIgnoreCase(msgContent)){
            		respContent =""+ getMainMenu();
            	}else if("@".equalsIgnoreCase(msgContent)){
                    Common com = new Common();
                    XMLNewsMessage xmlnewMessage = new XMLNewsMessage(fromUserName, toUserName, com.getWelcomPage());
                    return xmlnewMessage.toXML();
            	}else if(msgContent.contains("天气")){
            		//String city = msgContent.trim().replaceAll("\\s*", "").substring(2);
            		String city = msgContent.replace("天气", "").trim();
            		Weather weather = new Weather();
            		List<Article> arclist = weather.getBaiduWeather(city);
            		if(arclist.size()>0){
                        XMLNewsMessage xmlnewMessage = new XMLNewsMessage(fromUserName, toUserName, arclist);
                        return xmlnewMessage.toXML();
            		}else{
            			 respContent = "无法查询到您选择的天气信息，请选择其他名称查询！";  
            		}
            	}else if(msgContent.contains("公交")){
            		String cityStr = msgContent.trim().replaceAll("\\s*", "").substring(2,4);
            		String busStr = msgContent.trim().replaceAll("\\s*", "").substring(4);
            		Bus bus = new Bus();
            		respContent = bus.getAibangBus(cityStr,busStr);
            		if(respContent!=null){
            			}else{
            			 respContent = "无法查询到您选择的公交线路，请选择其他线路查询！";  
            		}
            	}
             } // 图片消息  
           else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {  
        	   String mediaId = requestMap.get("MediaId");
        	   XMLImageMessage xmlImgMes = new XMLImageMessage(fromUserName, toUserName, mediaId);
        	   return xmlImgMes.toXML();
            }  
            // 地理位置消息  
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {  
            	String location_x = requestMap.get("Location_X");
            	String location_y = requestMap.get("Location_Y");
            	String scale = requestMap.get("Scale");
            	String label = requestMap.get("Label");
            	Location location = new Location();
                 XMLNewsMessage xmlnewMessage = new XMLNewsMessage(fromUserName, toUserName, location.getLocation(location_x, location_y, scale, label));
                 return xmlnewMessage.toXML();
            }  
            // 链接消息  
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {  
                respContent = "您发送的是链接消息！";  
            }  
            // 音频消息  
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {  
            	 String recognition = requestMap.get("Recognition");
            	 String mediaID = requestMap.get("MediaID");
            	 String format = requestMap.get("Format");
                respContent = "您的语音识别结果是："+recognition; 
            }  
            // 事件推送  
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {  
                // 事件类型  
                String eventType = requestMap.get("Event"); 
                // 订阅  
                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {  
                	 Common com = new Common();
                     XMLNewsMessage xmlnewMessage = new XMLNewsMessage(fromUserName,toUserName , com.getWelcomPage());
                     return xmlnewMessage.toXML();
                }  
                // 取消订阅  
                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {  
                    // TODO 取消订阅后用户再收不到公众号发送的消息，因此不需要回复消息  
                }  
                // 自定义菜单点击事件  
                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {  
                    // TODO 自定义菜单权没有开放，暂不处理该类消息  
                	if(EventKey.equalsIgnoreCase("1")){
                    	respContent = "您选择了天气预报，回复天气+城市名称，获得天气情况，例如回复：天气北京";
                    }
                    else if("1".equalsIgnoreCase(EventKey)){
                		respContent = "您选择了天气预报，回复天气+城市名称，获得天气情况，例如回复：天气北京";
                	}else if("2".equalsIgnoreCase(EventKey)){
                		respContent = "您选择了位置服务，请点击右下角的'+',打开快捷菜单，点击发送位置。";
                	}else if("3".equalsIgnoreCase(EventKey)){
                		respContent = "<a href='http://hdq.nat123.net/user/main.jsp'>测试页面</a>";
                	}else if("4".equalsIgnoreCase(EventKey)){
                		respContent = "您选择了公交查询，回复公交+城市名+','+公交线路，例如：公交北京58";
                	}else if("5".equalsIgnoreCase(EventKey)){
                		respContent = "只要发送您的一段语音，我就可以识别出您说的是什么，神奇吧，快来发送语音消息试试看吧~";
                	}
                }
            }  
  
        XMLTextMessage textMes = new XMLTextMessage(fromUserName, toUserName, respContent);
        return textMes.toXML(); 
    }  
    
    /**
     * 得到主菜单
     * @return
     */
    public static String getMainMenu() {  
        StringBuffer buffer = new StringBuffer();  
        buffer.append("\ue402您好，我是小哆啦，很高兴为您服务。").append("\n");
        buffer.append("请回复数字选择项目：").append("\n");  
        buffer.append("1  天气预报 \ue04a").append("\n");  
        buffer.append("2  位置服务 \ue209").append("\n");  
        buffer.append("3  我的知乎").append("\n");  
        buffer.append("4  公交查询 \ue159").append("\n");  
        buffer.append("5  语音识别").append("\n");  
        buffer.append("6  微官网").append("\n");  
        buffer.append("7  餐饮预订").append("\n");  
        buffer.append("8  在线预约 \ue428").append("\n");  
        buffer.append("9  酒店简介").append("\n");  
        buffer.append("10  酒店印象").append("\n");  
        buffer.append("11  联系方式").append("\n");  
        buffer.append("回复“?”显示此帮助菜单，回复“@”进入欢迎页面。");  
        return buffer.toString();  
    } 
    
    public static void main(String[] args) {
    	/*CoreService core = new CoreService();
    	HttpServletRequest request = null;
    	core.processRequest(request);*/
    	
	}
}  
