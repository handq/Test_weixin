package com.csst.business.service;

import java.util.List;

import com.csst.business.model.TCompany;
import com.csst.business.model.TTrUser;

public interface ICompanyService {
	
	public TTrUser getUserById(String id);

	public TCompany saveCompany(TCompany company);

	public TCompany getCompanyData();  
} 
