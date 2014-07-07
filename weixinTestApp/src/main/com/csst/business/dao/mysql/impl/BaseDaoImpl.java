package com.csst.business.dao.mysql.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csst.business.dao.BaseDao;
import com.csst.business.model.TTrUser;

public class BaseDaoImpl implements BaseDao {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Object o) {
		Session session = sessionFactory.getCurrentSession();
		session.save(o);
		
	}

	/****
	 * 查询 所有的 用户名
	 */
	

}
