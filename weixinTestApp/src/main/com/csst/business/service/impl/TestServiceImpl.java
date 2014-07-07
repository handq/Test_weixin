package com.csst.business.service.impl;

import com.csst.business.dao.TestDao;
import com.csst.business.model.TTrUser;
import com.csst.business.service.TestService;

public class TestServiceImpl implements TestService{
	private TestDao testDao;

	public TTrUser getUserById(String id) {
		return testDao.findUserById(id);
	}

	public TestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	
	
}
