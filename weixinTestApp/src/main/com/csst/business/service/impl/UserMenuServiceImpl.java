package com.csst.business.service.impl;

import java.util.List;

import com.csst.business.dao.IUserMenuDao;
import com.csst.business.model.TUserMenu;
import com.csst.business.service.IUserMenuService;

public class UserMenuServiceImpl implements IUserMenuService {

	private IUserMenuDao userMenuDao;
	@Override
	public TUserMenu saveUserMenu(TUserMenu usermenu) {
		return userMenuDao.saveUserMenu(usermenu);
	}

	@Override
	public List<TUserMenu> findAllUserMenu() {
		// TODO Auto-generated method stub
		return userMenuDao.findAllUserMenu();
	}

	@Override
	public boolean updateUserMenu() {
		// TODO Auto-generated method stub
		return userMenuDao.updateUserMenu();
	}

	@Override
	public boolean deleteUserMenu(String menuId) {
		// TODO Auto-generated method stub
		return userMenuDao.deleteUserMenu(menuId);
	}
	@Override
	public boolean isAddMenuAjax(String id) {
		// TODO Auto-generated method stub
		return userMenuDao.isAddMenuAjax(id);
	}

	@Override
	public List<TUserMenu> getParentMenuById(String userMenuId) {
		// TODO Auto-generated method stub
		return userMenuDao.getParentMenuById(userMenuId);
	}
	
	@Override
	public TUserMenu getUserMenuById(String userMenuId) {
		// TODO Auto-generated method stub
		return userMenuDao.getUserMenuById(userMenuId);
	}
	public IUserMenuDao getUserMenuDao() {
		return userMenuDao;
	}

	public void setUserMenuDao(IUserMenuDao userMenuDao) {
		this.userMenuDao = userMenuDao;
	}

	@Override
	public boolean checkHaveChildsById(String id) {
		return userMenuDao.checkHaveChildsById(id);
	}

	

	

	

	
}
