package com.csst.business.service.impl;

import com.csst.business.dao.IUserDao;
import com.csst.business.dao.TestDao;
import com.csst.business.model.BUser;
import com.csst.business.model.TTrUser;
import com.csst.business.service.IUserService;
import com.csst.business.service.TestService;

public class UserServiceImpl implements IUserService{
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public TTrUser getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BUser volidate(BUser user) {
		// TODO Auto-generated method stub
		return userDao.volidate(user);
	}
	
	
}
