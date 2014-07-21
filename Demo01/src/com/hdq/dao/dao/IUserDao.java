package com.hdq.dao.dao;

import java.sql.SQLException;

import com.hdq.dao.bo.UserBO;

public interface IUserDao {
	public UserBO getById(String id) throws SQLException;
}
