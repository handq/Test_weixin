package com.csst.business.action;

import com.csst.business.model.TTrUser;
import com.csst.business.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TestAction extends ActionSupport{
	private TestService testService;
	private TTrUser user;
	
	public String testAction(){
		System.out.println("=============================");
		return "bbb";
	}
	
	public String  getUserById(){
		//TTrUser user = new TTrUser();
		user=testService.getUserById("060A3B5E399E46ECB4CA16EF4A648831");
		return "success";
	}

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public TTrUser getUser() {
		return user;
	}

	public void setUser(TTrUser user) {
		this.user = user;
	}
	
	
}
