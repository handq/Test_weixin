package com.csst.business.service.impl;

import com.csst.business.dao.ICompanyDao;
import com.csst.business.dao.TestDao;
import com.csst.business.model.TCompany;
import com.csst.business.model.TTrUser;
import com.csst.business.service.ICompanyService;
import com.csst.business.service.TestService;

public class CompanyServiceImpl implements ICompanyService{
	private ICompanyDao companyDao;

	@Override
	public TTrUser getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ICompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(ICompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	@Override
	public TCompany saveCompany(TCompany company) {
		// TODO Auto-generated method stub
		return companyDao.saveCompany(company);
	}

	@Override
	public TCompany getCompanyData() {
		// TODO Auto-generated method stub
		return companyDao.getCompanyData();
	}
	
	
}
