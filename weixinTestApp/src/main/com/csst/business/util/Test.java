package com.csst.business.util;

import com.csst.business.test.model.MailSenderModel;


public class Test {
	/***
	 * 测试发送邮件的
	 * @param args
	 */
	public static void main(String[] args) {
		  //这个类主要是设置邮件  
	      MailSenderModel mailInfo = new MailSenderModel();   
	      mailInfo.setMailServerHost("smtp.126.com");//发送邮箱的主机服务器
	      mailInfo.setMailServerPort("25");//发送邮箱的主机端口
	      mailInfo.setValidate(true);//需要身份验证
	      mailInfo.setUserName("sihshangnet@126.com");//发送邮箱
	      mailInfo.setPassword("ss123654");//您的发送邮箱密码   
	      mailInfo.setFromAddress("sihshangnet@126.com");//发送邮箱
	      mailInfo.setToAddress("wanghao293@126.com"); //接受邮箱
	      Integer sixNumber=SixNumberFactory.createSixNumber();
	      mailInfo.setSubject("市尚网络注册激活");  
		     String sendStr="亲爱的用户，您好：<br/>"+
		      "欢迎注册市尚网络，我们将竭诚为您提供优质的服务。<br/>"+
			      "请将以下激活码输入到注册窗口中完成注册。<br/>"+
			      "激活码："+"<font color='green'>"+sixNumber+"</font></h1>";

	      mailInfo.setContent(sendStr);  
	      
	      //这个类主要来发送邮件  
	      SimpleMailSender sms = new SimpleMailSender();  
	      //sms.sendTextMail(mailInfo);//发送文体格式   
	      sms.sendHtmlMail(mailInfo);//发送html格式  
	}

}
