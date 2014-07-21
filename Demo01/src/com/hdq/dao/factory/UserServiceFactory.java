package com.hdq.dao.factory;

import com.hdq.dao.serice.IUserService;
import com.hdq.dao.serice.impl.UserServiceImpl;

public class UserServiceFactory {
	public static IUserService getUserServiceInstance(){
		return new UserServiceImpl();
	}
}	
