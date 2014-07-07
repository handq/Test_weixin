package com.csst.services.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.csst.popular.api.MenuAPI;
import com.csst.popular.bean.BaseResult;
import com.csst.services.Thread.TokenThread;
import com.csst.services.common.SignUtil;
import com.csst.services.common.WeixinUtil;
import com.csst.services.coreService.CoreService;
import com.csst.services.coreService.MenuManager;
import com.csst.services.pojo.AccessToken;


public class CoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);
    public CoreServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // 微信加密签名  
        String signature = request.getParameter("signature");  
        // 时间戳  
        String timestamp = request.getParameter("timestamp");  
        // 随机数  
        String nonce = request.getParameter("nonce");  
        // 随机字符串  
        String echostr = request.getParameter("echostr");  
        PrintWriter out = response.getWriter();  
        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败  
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {  
            out.print(echostr);  
        }  
        out.close();  
        out = null;  
	}
	
	/**
	 * 处理微信服务器发来的消息
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 将请求、响应的编码均设置为UTF-8（防止中文乱码）  
        request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8");
        //获取accessToken
        String at = TokenThread.accessToken.getToken(); 
        // 调用核心业务类接收消息、处理消息  
        String respMessage;
		try {
			respMessage = CoreService.processRequest(request);
			// 响应消息  
	        PrintWriter out = response.getWriter();  
	        out.print(respMessage);  
	        out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

}
