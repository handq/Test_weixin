package com.hdq.dao.serice;

import java.sql.SQLException;

import com.hdq.dao.bo.UserBO;

public interface IUserService {
	public  UserBO getById(String id) throws SQLException;
}
