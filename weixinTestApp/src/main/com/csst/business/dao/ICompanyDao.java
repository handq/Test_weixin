package com.csst.business.dao;


import com.csst.business.model.TCompany;
import com.csst.business.model.TTrUser;

public interface ICompanyDao extends BaseDao {
	public TTrUser findUserById(String id);

	public TCompany saveCompany(TCompany company);

	public TCompany getCompanyData();  
	
}
