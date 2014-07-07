package com.csst.business.action;

import java.io.IOException;

import org.apache.http.HttpRequest;
import org.apache.struts2.ServletActionContext;

import com.csst.business.common.MD5Code;
import com.csst.business.model.BUser;
import com.csst.business.model.TTrUser;
import com.csst.business.model.TUser;
import com.csst.business.service.IUserService;
import com.csst.business.service.TestService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport{
	private IUserService userService;
	private BUser user;
	private boolean flag;
	
	public String testAction(){
		System.out.println("=============================");
		return "bbb";
	}

	public boolean volidate(String userName,String userPass){
		boolean flag = false;
		BUser buser = new BUser();
		buser.setUserName(userName);
		MD5Code md5 = new MD5Code();
		buser.setUserPass(md5.getMD5ofStr(userPass));
		user = userService.volidate(buser);
		if(user.getId()!=null){
			flag=true;
		}
		return flag;
	}
	
	public String login(){
		MD5Code md5 = new MD5Code();
		user.setUserPass(md5.getMD5ofStr(user.getUserPass()));
		user = userService.volidate(user);
		ActionContext.getContext().getSession().put("user",user);
		return "mainPage";
	}
	
	public String layout(){
		System.out.println(ActionContext.getContext().getSession().get("user"));
		ActionContext.getContext().getSession().clear();
		System.out.println(ActionContext.getContext().getSession().get("user"));
		return "login";
	}
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public BUser getUser() {
		return user;
	}

	public void setUser(BUser user) {
		this.user = user;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
