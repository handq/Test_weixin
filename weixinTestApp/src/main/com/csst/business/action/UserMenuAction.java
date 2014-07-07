package com.csst.business.action;

import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.csst.business.model.TTrUser;
import com.csst.business.model.TUserMenu;
import com.csst.business.service.IUserMenuService;
import com.csst.business.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserMenuAction extends ActionSupport{
	private IUserMenuService userMenuService;
	private TUserMenu userMenu;
	private List<TUserMenu> userMenus;
	private boolean flag;
	
	/**
	 * 取得所有自定义菜单
	 * @return list
	 */
	public String findAllMenus(){
		userMenus = userMenuService.findAllUserMenu();
		return "allMenuManager";
	}
	
	/**
	 * 更新自定义菜单（跳转形式）
	 * @return
	 */
	public String updateUserMenus(){
		flag = userMenuService.updateUserMenu();
		return "updateUserMenus";
	}
	/**
	 * 更新自定义菜单（ajax）
	 * @return
	 */
	public boolean updateUserMenusAjax(){
		flag = userMenuService.updateUserMenu();
		return flag;
	}
	/**
	 * 检查是否可以增加下级菜单
	 * @param id 当前菜单id
	 * @return 成功，失败
	 */
	public boolean isAddMenuAjax(String id){
		flag = userMenuService.isAddMenuAjax(id);
		return flag;
	}
	/**
	 * 根据id取得当前菜单
	 * @return
	 */
	public String getParentUserMenus(){
		String userMenuId = userMenu.getId();
		userMenu = userMenuService.getUserMenuById(userMenuId);
		return "userMenuAdd";
	}

	/**
	 * 保存菜单
	 * @return
	 */
	public void saveUserMenu(){
		userMenu = userMenuService.saveUserMenu(userMenu);
		try {
			ServletActionContext.getResponse().getWriter().print(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据id删除菜单
	 * @return
	 */
	public String deleteUserMenu(){
		flag = userMenuService.deleteUserMenu(userMenu.getId());
		if(flag){
			this.findAllMenus();
		}
		return "allMenuManager";
	}
	
	/**
	 * 根据id修改菜单
	 * @return
	 */
	public String editUserMenu(){
		String userMenuId = userMenu.getId();
		userMenu = userMenuService.getUserMenuById(userMenuId);
		return "editMenu";
	}
	
	/**
	 * 删除前检查是否有子记录
	 * @return
	 */
	public boolean  checkHaveChildsById(String id){
		flag = userMenuService.checkHaveChildsById(id);
		return flag;
	}
	public IUserMenuService getUserMenuService() {
		return userMenuService;
	}

	public void setUserMenuService(IUserMenuService userMenuService) {
		this.userMenuService = userMenuService;
	}

	public TUserMenu getUserMenu() {
		return userMenu;
	}

	public void setUserMenu(TUserMenu userMenu) {
		this.userMenu = userMenu;
	}


	public List<TUserMenu> getUserMenus() {
		return userMenus;
	}


	public void setUserMenus(List<TUserMenu> userMenus) {
		this.userMenus = userMenus;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}
