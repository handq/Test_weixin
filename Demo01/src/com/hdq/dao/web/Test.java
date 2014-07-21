package com.hdq.dao.web;

import java.sql.SQLException;

import com.hdq.dao.bo.UserBO;
import com.hdq.dao.db.DbSession;
import com.hdq.dao.factory.UserServiceFactory;

public class Test {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		String id = "11";
		UserBO user = UserServiceFactory.getUserServiceInstance().getById(id);
		System.out.println(user.getName());
		/*DbSession db = new DbSession();
		System.out.println(db);*/
	}

}
