package com.hdq.dao.factory;

import java.sql.Connection;

import com.hdq.dao.dao.IUserDao;
import com.hdq.dao.dao.impl.UserDaoImpl;
import com.hdq.dao.db.DbSession;

public class UserDaoFactory {
	public static IUserDao getUserDaoInstance(Connection conn){
		return new UserDaoImpl(conn);
	}
}
