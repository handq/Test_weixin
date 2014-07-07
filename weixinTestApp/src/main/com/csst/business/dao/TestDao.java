package com.csst.business.dao;


import com.csst.business.model.TTrUser;

public interface TestDao extends BaseDao {
	public TTrUser findUserById(String id);
	
}
