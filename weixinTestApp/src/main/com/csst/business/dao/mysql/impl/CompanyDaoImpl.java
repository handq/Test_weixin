package com.csst.business.dao.mysql.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.csst.business.dao.ICompanyDao;
import com.csst.business.dao.IUserMenuDao;
import com.csst.business.model.TCompany;
import com.csst.business.model.TTrUser;
import com.csst.business.model.TUserMenu;
import com.csst.services.Thread.TokenThread;
import com.csst.services.common.WeixinUtil;
import com.csst.services.pojo.Button;
import com.csst.services.pojo.CommonButton;
import com.csst.services.pojo.ComplexButton;
import com.csst.services.pojo.Menu;
import com.csst.services.pojo.ViewButton;

public class CompanyDaoImpl extends BaseDaoImpl implements ICompanyDao {

	@Override
	public TTrUser findUserById(String id) {
		return null;
	}

	@Override
	public TCompany saveCompany(TCompany company) {
		Session session=getSessionFactory().getCurrentSession();
		TCompany tt = new TCompany();
		session.saveOrUpdate(company);
		session.flush();
		session.clear();
		return tt;
	}

	@Override
	public TCompany getCompanyData() {
		Session session=getSessionFactory().getCurrentSession();
		TCompany tt = new TCompany();
		StringBuffer sb=new StringBuffer();
		sb.append(" from TCompany t where 1=1");
		List<TCompany> list=session.createQuery(sb.toString()).list();
		if(list.size()>0){
			tt = list.get(0);
		}
		session.flush();
		session.clear();
		return tt;
	}


	
}
