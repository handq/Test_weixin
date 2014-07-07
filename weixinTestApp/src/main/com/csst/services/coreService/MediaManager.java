package com.csst.services.coreService;

import java.io.File;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;

import com.csst.popular.api.MediaAPI;
import com.csst.popular.api.MenuAPI;
import com.csst.popular.api.MediaAPI.MediaType;
import com.csst.popular.bean.BaseResult;
import com.csst.popular.bean.Media;
import com.csst.services.common.WeixinUtil;
import com.csst.services.pojo.AccessToken;
import com.csst.services.pojo.Button;
import com.csst.services.pojo.CommonButton;
import com.csst.services.pojo.ComplexButton;
import com.csst.services.pojo.Menu;
import com.csst.services.pojo.ViewButton;
import com.csst.services.util.Weather;

public class MediaManager {
	private static Logger log = LoggerFactory.getLogger(MediaManager.class);  
	  
    public static void main(String[] args) throws Exception {  
        // 第三方用户唯一凭证  
        String appId = "wx872de518202f19d9";  
        // 第三方用户唯一凭证密钥  
        String appSecret = "82f0e3528d1e287af9444cd1068250ac";  
        // 调用接口获取access_token  
        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);  
       //附件上传
        MediaAPI media = new MediaAPI();
        if (null != at) {  
            Media med  = media.mediaUpload(at.getToken(), MediaType.image, new File("F:/documents/001.jpg"));
            //int result = WeixinUtil.uploadMedia(getMedia(), "image", at.getToken());
            System.out.println(med.getErrcode()+"/n"+med.getErrmsg()+"/n"+med.getMedia_id());
        }
        
        //附件下载
        if(null !=at){
        	String mediaId = "hbeMeIL9r9ug-Z6vmyK-JFZxislTA0jm_thXOmHc6jQZ9tKMmKwNsrdw875A7vD5";
        	ResponseEntity<ByteArrayResource> rpse = media.mediaGet(at.getToken(), mediaId);
        	System.out.println(rpse.getHeaders());
        }
    	
    }  
  
      
    public static File getMedia() {  
    	File file = new File("F:/documents/001.jpg");
        return file;  
    }  
    
    
}
