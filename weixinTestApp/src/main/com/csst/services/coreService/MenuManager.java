package com.csst.services.coreService;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;

import com.csst.popular.api.MediaAPI;
import com.csst.popular.api.MenuAPI;
import com.csst.popular.bean.BaseResult;
import com.csst.services.common.WeixinUtil;
import com.csst.services.pojo.AccessToken;
import com.csst.services.pojo.Button;
import com.csst.services.pojo.CommonButton;
import com.csst.services.pojo.ComplexButton;
import com.csst.services.pojo.Menu;
import com.csst.services.pojo.ViewButton;

public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);  
	  
    public static void main(String[] args) {  
        // 第三方用户唯一凭证  
        String appId = "wx872de518202f19d9";  
        // 第三方用户唯一凭证密钥  
        String appSecret = "82f0e3528d1e287af9444cd1068250ac";  
        // 调用接口获取access_token  
        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);  
       //菜单创建
     /*  if (null != at) {  
            // 调用接口创建菜单  
            int result = WeixinUtil.createMenu(getMenu(), at.getToken());  
            // 判断菜单创建结果  
            if (0 == result)  
                log.info("菜单创建成功！");  
            else  
                log.info("菜单创建失败，错误码：" + result);  
        }*/
        MenuAPI menuAPI = new MenuAPI();
       /* MediaAPI meadi = new MediaAPI();
        ResponseEntity<ByteArrayResource> ddd = meadi.mediaGet(at.getToken(), "oQ_GaO173gJ7PWttjQR0KKWlswYL00NXMHsY1I2muCwMptu-VWt68c9pyT-dbrAJ");
        System.out.println(ddd.getStatusCode());*/
          
        String jsonMenu = JSONObject.fromObject(getMenu()).toString();
          BaseResult br =  menuAPI.menuCreate(at.getToken(), jsonMenu);
        if("ok".equals(br.getErrmsg())){
        	 log.info("菜单创建成功！");  
        }else{
        	log.info("菜单创建失败，错误码：" + br.getErrcode());  
        }
        System.out.println("-----------------------");
        //menuAPI.menuCreate(at.getToken(),);
    	
    }  
  
    /** 
     * 组装菜单数据 
     *  
     * @return 
     */  
    public static Menu getMenu() {  
    	/*CommonButton btn11 = new CommonButton();  
        btn11.setName("天气预报");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        CommonButton btn12 = new CommonButton();  
        btn12.setName("公交查询");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        CommonButton btn13 = new CommonButton();  
        btn13.setName("周边搜索");  
        btn13.setType("click");  
        btn13.setKey("13");  
  
        CommonButton btn14 = new CommonButton();  
        btn14.setName("历史上的今天");  
        btn14.setType("click");  
        btn14.setKey("14");  
          
        CommonButton btn15 = new CommonButton();  
        btn15.setName("电影排行榜");  
        btn15.setType("click");  
        btn15.setKey("32");  
  
        CommonButton btn21 = new CommonButton();  
        btn21.setName("歌曲点播");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        CommonButton btn22 = new CommonButton();  
        btn22.setName("经典游戏");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        CommonButton btn23 = new CommonButton();  
        btn23.setName("美女电台");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        CommonButton btn24 = new CommonButton();  
        btn24.setName("人脸识别");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        CommonButton btn25 = new CommonButton();  
        btn25.setName("聊天唠嗑");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
        CommonButton btn31 = new CommonButton();  
        btn31.setName("Q友圈");  
        btn31.setType("click");  
        btn31.setKey("31");  
  
        CommonButton btn33 = new CommonButton();  
        btn33.setName("幽默笑话");  
        btn33.setType("click");  
        btn33.setKey("33");  
          
        CommonButton btn34 = new CommonButton();  
        btn34.setName("用户反馈");  
        btn34.setType("click");  
        btn34.setKey("34");  
          
        CommonButton btn35 = new CommonButton();  
        btn35.setName("关于我们");  
        btn35.setType("click");  
        btn35.setKey("35");  
          
        ViewButton btn32 = new ViewButton();  
        btn32.setName("使用帮助");  
        btn32.setType("view");  
        btn32.setUrl("http://liufeng.gotoip2.com/xiaoqrobot/help.jsp");*/ 
    	
    	CommonButton btn01 = new CommonButton();  
    	btn01.setName("餐饮预订");  
    	btn01.setType("click");  
    	btn01.setKey("01");  
    	
    	CommonButton btn02 = new CommonButton();  
    	btn02.setName("在线预约");  
    	btn02.setType("click");  
    	btn02.setKey("02");  
    	
    	CommonButton btn03 = new CommonButton();  
    	btn03.setName("酒店简介");  
    	btn03.setType("click");  
    	btn03.setKey("03");  
    	
    	CommonButton btn04 = new CommonButton();  
    	btn04.setName("延龙印象");  
    	btn04.setType("click");  
    	btn04.setKey("04");  
    	
    	CommonButton btn05 = new CommonButton();  
    	btn05.setName("联系方式");  
    	btn05.setType("click");  
    	btn05.setKey("05");  
    	
    	ViewButton btn32 = new ViewButton();  
        btn32.setName("微官网");  
        btn32.setType("view");  
        btn32.setUrl("http://hdq.nat123.net/bootstrapDemo/index.html");
        
       /* ComplexButton mainBtn1 = new ComplexButton();  
        mainBtn1.setName("微官网");  */
        //mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13, btn14, btn15 });  
  
        ComplexButton mainBtn2 = new ComplexButton();  
        mainBtn2.setName("酒店预订");  
        mainBtn2.setSub_button(new Button[] { btn01, btn02});  
  
        ComplexButton mainBtn3 = new ComplexButton();  
        mainBtn3.setName("延龙印象");  
        mainBtn3.setSub_button(new Button[] { btn03, btn04, btn05});  
  
        /** 
         * 这是公众号xiaoqrobot目前的菜单结构，每个一级菜单都有二级菜单项<br> 
         *  
         * 在某个一级菜单下没有二级菜单的情况，menu该如何定义呢？<br> 
         * 比如，第三个一级菜单项不是“更多体验”，而直接是“幽默笑话”，那么menu应该这样定义：<br> 
         * menu.setButton(new Button[] { mainBtn1, mainBtn2, btn33 }); 
         */
        Menu menu = new Menu();  
        menu.setButton(new Button[] { btn32, mainBtn2, mainBtn3 });  
        return menu;  
    }  
    
    
}
