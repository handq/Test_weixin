package com.hdq.dao.serice.impl;

import java.sql.SQLException;

import com.hdq.dao.bo.UserBO;
import com.hdq.dao.db.DbSession;
import com.hdq.dao.factory.UserDaoFactory;
import com.hdq.dao.serice.IUserService;

public class UserServiceImpl implements IUserService {
	private DbSession db = new DbSession();
	@Override
	public UserBO getById(String id) throws SQLException {
		return UserDaoFactory.getUserDaoInstance(db.getConnEction()).getById(id);
	}

}
