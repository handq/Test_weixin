package com.csst.business.service;

import java.util.List;

import com.csst.business.model.BUser;
import com.csst.business.model.TTrUser;

public interface IUserService {
	
	public TTrUser getUserById(String id);

	public BUser volidate(BUser user); 
} 
