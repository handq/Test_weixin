package com.csst.services.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.csst.popular.bean.xmlmessage.XMLNewsMessage.Article;
import com.csst.services.common.CoverChineseUtil;

import net.sf.json.JSONObject;

/**
 * 得到未来6天的天气(含今天)
 * @author Chewl
 *
 */
public class Weather { 
    String Ctiyid; 
    URLConnection connectionData; 
    StringBuilder sb; 
    BufferedReader br;// 读取data数据流 
    JSONObject jsonData; 
    JSONObject info; 
     
    
    public String getWeather(String Cityid)throws IOException ,NullPointerException{
    	// 解析本机ip地址 
    	 
        this.Ctiyid = Cityid; 
        // 连接中央气象台的API 
        URL url = new URL("http://m.weather.com.cn/data/" + Ctiyid + ".html"); 
        connectionData = url.openConnection(); 
        connectionData.setConnectTimeout(1000); 
        try { 
            br = new BufferedReader(new InputStreamReader( 
                    connectionData.getInputStream(), "UTF-8")); 
            sb = new StringBuilder(); 
            String line = null; 
            while ((line = br.readLine()) != null) 
                sb.append(line); 
        } catch (SocketTimeoutException e) { 
            System.out.println("连接超时"); 
        } catch (FileNotFoundException e) { 
            System.out.println("加载文件出错"); 
        } 
            String datas = sb.toString();   
            
           jsonData = JSONObject.fromObject(datas); 
          //  System.out.println(jsonData.toString());  
           info = jsonData.getJSONObject("weatherinfo"); 
        
        //得到1到6天的天气情况
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        for(int i=1;i<=6;i++){
        	//得到未来6天的日期
        	Calendar cal = Calendar.getInstance();
        	cal.add(Calendar.DAY_OF_YEAR, i-1);
        	Date date = cal.getTime();
        	SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日");
        	
        	Map<String,Object> map = new HashMap<String, Object>();
        	map.put("city", info.getString("city").toString());//城市
        	map.put("date_y", sf.format(date));//日期
        	map.put("week", getWeek(cal.get(Calendar.DAY_OF_WEEK)));//星期
        	map.put("fchh", info.getString("fchh").toString());//发布时间
        	map.put("weather", info.getString("weather"+i).toString());//天气
        	map.put("temp", info.getString("temp"+i).toString());//温度
        	map.put("wind", info.getString("wind"+i).toString());//风况
        	map.put("fl", info.getString("fl"+i).toString());//风速
        	map.put("index", info.getString("index").toString());// 今天的穿衣指数 
        	map.put("index_uv", info.getString("index_uv").toString());// 紫外指数 
        	map.put("index_tr", info.getString("index_tr").toString());// 旅游指数 
        	map.put("index_co", info.getString("index_co").toString());// 舒适指数 
        	map.put("index_cl", info.getString("index_cl").toString());// 晨练指数 
        	map.put("index_xc", info.getString("index_xc").toString());//洗车指数 
        	map.put("index_d", info.getString("index_d").toString());//天气详细穿衣指数 
        	list.add(map);
        }
        String strreg = "";
        //控制台打印出天气
       for(int j=0;j<list.size();j++){
    	   Map<String,Object> wMap = list.get(j);
    	   strreg +=wMap.get("city")+"\t"+wMap.get("date_y")+"\t"+wMap.get("week")+"\t"+wMap.get("weather")+"\t"+wMap.get("temp")+"\t"+wMap.get("index_uv");
    	   System.out.println(wMap.get("city")+"\t"+wMap.get("date_y")+"\t"+wMap.get("week")+"\t"
    			   +wMap.get("weather")+"\t"+wMap.get("temp")+"\t"+wMap.get("index_uv"));
       }
    	return strreg;
    }
   
    private String getWeek(int iw){
    	String weekStr = "";
    	switch (iw) {
		case 1:weekStr = "星期天";break;
		case 2:weekStr = "星期一";break;
		case 3:weekStr = "星期二";break;
		case 4:weekStr = "星期三";break;
		case 5:weekStr = "星期四";break;
		case 6:weekStr = "星期五";break;
		case 7:weekStr = "星期六";break;
		default:
			break;
		}
    	return weekStr;
    }
    
    @SuppressWarnings("rawtypes")
    public List<Article> getBaiduWeather(String city){
    	List<Article> articls = new ArrayList<Article>();
		List listdate=new ArrayList();  //用来存放日期
	    List listdayurl=new ArrayList();  //用来存放白天图片路径信息dayPictureUrl 
	    List listnighturl=new ArrayList();  //用来存放晚上图片路径信息nightPictureUrl 
	    List listweather=new ArrayList();//weather
	    List listwind=new ArrayList();//wind
	    List listtem=new ArrayList();//temperature
    	//天气预报API接口
    	try { 
    		String apiurl = "http://api.map.baidu.com/telematics/v2/weather?location="+java.net.URLEncoder.encode(city,"UTF-8")+"&output=xml&ak=3adbd0f292ac2b6aebbbe1cde8020f45";
    		URL url = new URL(apiurl); 
            connectionData = url.openConnection(); 
            connectionData.setConnectTimeout(1000); 
            try { 
                br = new BufferedReader(new InputStreamReader( 
                        connectionData.getInputStream(), "UTF-8")); 
                sb = new StringBuilder(); 
                String line = null; 
                while ((line = br.readLine()) != null) 
                    sb.append(line); 
            } catch (SocketTimeoutException e) { 
                System.out.println("连接超时"); 
            } catch (FileNotFoundException e) { 
                System.out.println("加载文件出错"); 
            } 
                String xmldatas = sb.toString();
    		 //String xmldatas = GetXmlCode(apiurl); 
             Document doc = DocumentHelper.parseText(xmldatas);
             Element rootElt = doc.getRootElement(); // 获取根节点    
             Iterator iter = rootElt.elementIterator("results"); // 获取根节点下的子节点results
             String status=rootElt.elementText("status"); //获取状态，如果等于success,表示有数据
             String currentCity=rootElt.elementText("currentCity"); //获取状态，如果等于success,表示有数据
             if(status.equalsIgnoreCase("success")){
            	 while (iter.hasNext()) {
            		 Element recordEle = (Element) iter.next();
            		 Iterator iters = recordEle.elementIterator("result");
            		 while(iters.hasNext()){
            			 Element itemEle = (Element) iters.next(); 
            			 //取出时间date
            			 List date = itemEle.elements("date");
            			 Element eledate=(Element)date.get(0);
            			 listdate.add(eledate.getText());
            			 //取出白天图片地址dayPictureUrl
            			 List dayUrl = itemEle.elements("dayPictureUrl");
            			 Element eledayurl=(Element)dayUrl.get(0);
            			 listdayurl.add(eledayurl.getText());
            			 //取出晚上图片地址nightPictureUrl
            			 List nightUrl = itemEle.elements("nightPictureUrl");
            			 Element elenighturl=(Element)nightUrl.get(0);
            			 listnighturl.add(elenighturl.getText());
            			 //取出天气情况weather
            			 List weather = itemEle.elements("weather");
            			 Element eleweather=(Element)weather.get(0);
            			 listweather.add(eleweather.getText());
            			 //取出风力wind
            			 List wind = itemEle.elements("wind");
            			 Element elewind = (Element)wind.get(0);
            			 listwind.add(elewind.getText());
            			 //取出温度temperature
            			 List temp = itemEle.elements("temperature");
            			 Element eleTemp = (Element)temp.get(0);
            			 listtem.add(eleTemp.getText());
            		 }
            		 
            	 }
             }
              
             if(listdate!=null){
            	 String strPinYin = CoverChineseUtil.trans2PinYin(currentCity); 
            	 for(int i = 0;i<listdate.size();i++){
                	 Article article = new Article();
                	 article.setTitle(listdate.get(i)+"\n"+listweather.get(i)+" "+listwind.get(i)+" "+"温度:"+listtem.get(i));
                	 article.setDescription("");
                	 article.setPicurl(listdayurl.get(i).toString());
                	 article.setUrl("http://www.weather.com.cn/textFC/"+strPinYin+".shtml");
                	 articls.add(article);
                 } 
             }
         } catch (Exception e) {
			e.printStackTrace();
		} 
    	if(articls.size()>0){
    		articls.get(0).setTitle(articls.get(0).getTitle()+" ["+city+"]");
    	}
    	return articls;
    }
    
    
    /**
     * //xml解析
     * @param requestUrl
     * @return返回获取的xml字符串
     * @throws UnsupportedEncodingException
     */
    public String GetXmlCode(String requestUrl) throws UnsupportedEncodingException{
        StringBuffer buffer = null;  
       try{
        // 建立连接  
       System.out.println(requestUrl);
        URL url = new URL(requestUrl);
        HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();  
        httpUrlConn.setDoInput(true);  
        httpUrlConn.setRequestMethod("GET");  
        // 获取输入流  
        InputStream inputStream = httpUrlConn.getInputStream();  
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
        // 读取返回结果  
        buffer = new StringBuffer();  
        String str = null;  
        while ((str = bufferedReader.readLine()) != null) {  
          buffer.append(str);  
        }
        
        // 释放资源  
        bufferedReader.close();  
        inputStreamReader.close();  
        inputStream.close();  
        httpUrlConn.disconnect();  
        } catch (Exception e) {  
        e.printStackTrace();  
        }  
        return buffer.toString();  //返回获取的xml字符串
    }
     
    /**
     * 
     * @param requestUrl
     * @return  返回json字符串
     * @throws Exception
     */
    public  String getJsonData(String requestUrl) throws Exception{
    	 URL url = new URL(requestUrl); 
         connectionData = url.openConnection(); 
         connectionData.setConnectTimeout(1000); 
         try { 
             br = new BufferedReader(new InputStreamReader( 
                     connectionData.getInputStream(), "UTF-8")); 
             sb = new StringBuilder(); 
             String line = null; 
             while ((line = br.readLine()) != null) 
                 sb.append(line); 
         } catch (SocketTimeoutException e) { 
             System.out.println("连接超时"); 
         } catch (FileNotFoundException e) { 
             System.out.println("加载文件出错"); 
         } 
             String datas = sb.toString(); 
             return datas;
    }
    /**
	 * 把中文转成Unicode码
	 * @param str
	 * @return
	 */
	public String chinaToUnicode(String str){
		String result="";
		for (int i = 0; i < str.length(); i++){
            int chr1 = (char) str.charAt(i);
            if(chr1>=19968&&chr1<=171941){//汉字范围 \u4e00-\u9fa5 (中文)
                result+="\\u" + Integer.toHexString(chr1);
            }else{
            	result+=str.charAt(i);
            }
        }
		return result;
	}
    
    public static void main(String[] args) {
    	Weather w = new Weather();
    	w.getBaiduWeather("北京");
    	//article.setUrl("http://api.map.baidu.com/marker?location=39.916979519873,116.41004950566&title="+java.net.URLEncoder.encode("我的位置","UTF-8")+"&content="+java.net.URLEncoder.encode("百度大厦","UTF-8")+"&output=html");
	}
} 
