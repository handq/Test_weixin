package com.csst.business.model;

import java.sql.Timestamp;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * 
 * @author MyEclipse Persistence Tools
 */

public class TCustomMenu implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -584145807648200955L;
	private String id;
	private String menuName;
	private String menuCode;
	private Integer menuLeve;
	private String menuType;
	private String fkMenu;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuCode() {
		return menuCode;
	}
	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}
	public Integer getMenuLeve() {
		return menuLeve;
	}
	public void setMenuLeve(Integer menuLeve) {
		this.menuLeve = menuLeve;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public String getFkMenu() {
		return fkMenu;
	}
	public void setFkMenu(String fkMenu) {
		this.fkMenu = fkMenu;
	}
	
}