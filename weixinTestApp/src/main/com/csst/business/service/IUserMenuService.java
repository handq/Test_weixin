package com.csst.business.service;

import java.util.List;

import com.csst.business.model.TUserMenu;

public interface IUserMenuService {
	public TUserMenu saveUserMenu(TUserMenu usermenu);
	public List<TUserMenu> findAllUserMenu();
	public boolean updateUserMenu();
	public boolean deleteUserMenu(String menuId);
	public boolean isAddMenuAjax(String id);
	public List<TUserMenu> getParentMenuById(String userMenuId);
	public TUserMenu getUserMenuById(String userMenuId);
	public boolean checkHaveChildsById(String id);    
}
