package com.hdq.dao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hdq.dao.bo.UserBO;
import com.hdq.dao.dao.IUserDao;
import com.hdq.dao.factory.UserDaoFactory;

public class UserDaoImpl implements IUserDao {
	private Connection conn;
	
	public UserDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	public UserBO getById(String id) throws SQLException {
		UserBO user = new UserBO();
		String sql = "select * from t_userino where id = ?";
		PreparedStatement statm = this.conn.prepareStatement(sql);
		statm.setString(1, id);
		ResultSet rs = statm.executeQuery();
		if(rs.next()){
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setAge(rs.getInt("age"));
		}
		return user;
	}

}
