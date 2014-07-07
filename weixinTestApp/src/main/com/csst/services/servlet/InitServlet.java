package com.csst.services.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.csst.services.Thread.TokenThread;
import com.csst.services.common.WeixinUtil;

/**
 * 初始化access_token
 */
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
    private static Logger log = LoggerFactory.getLogger(WeixinUtil.class);  
  
    public void init() throws ServletException {  
        // 获取web.xml中配置的参数  
        TokenThread.appid = getInitParameter("appid");  
        TokenThread.appsecret = getInitParameter("appsecret");  
  
        log.info("weixin api appid:{}", TokenThread.appid);  
        log.info("weixin api appsecret:{}", TokenThread.appsecret);  
  
        // 未配置appid、appsecret时给出提示  
        if ("".equals(TokenThread.appid) || "".equals(TokenThread.appsecret)) {  
            log.error("appid and appsecret configuration error, please check carefully.");  
        } else {  
            // 启动定时获取access_token的线程  
            new Thread(new TokenThread()).start();  
        }  
    }  
}
