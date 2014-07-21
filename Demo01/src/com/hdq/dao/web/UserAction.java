package com.hdq.dao.web;

import com.hdq.dao.bo.UserBO;
import com.hdq.dao.factory.UserServiceFactory;

public class UserAction {
	public 	String  getById()throws Exception{
		String id = "1212";
		UserBO user = UserServiceFactory.getUserServiceInstance().getById(id);
		return null; 
	}
}
