package com.csst.business.dao.mysql.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csst.business.dao.TestDao;
import com.csst.business.model.TTrUser;

public class TestDaoImpl extends BaseDaoImpl implements TestDao {

	@Override
	public TTrUser findUserById(String id) {
		Session session=getSessionFactory().getCurrentSession();
		TTrUser user=(TTrUser)session.get(TTrUser.class, id);
		return user;
	}

}
