package com.csst.business.model;

import java.util.HashSet;
import java.util.Set;

/**
 * TUserMenu entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUserMenu implements java.io.Serializable {

	// Fields

	private String id;
	private String usermenuName;
	private String usermenuCode;
	private Integer usermenuLeve;
	private String usermenuType;
	private String fkUmid;
	private Integer usermenuNo;
	private String usermenuLink;
	private  String type;//区别自定义菜单和文字菜单
	private TUserMenu fkUserMenu;
	private Set userMenus = new HashSet(0); //字Part
	// Constructors

	/** default constructor */
	public TUserMenu() {
	}

	/** minimal constructor */
	public TUserMenu(String id) {
		this.id = id;
	}

	/** full constructor */
	public TUserMenu(String id, String usermenuName, String usermenuCode,
			Integer usermenuLeve, String usermenuType, String fkUmid) {
		this.id = id;
		this.usermenuName = usermenuName;
		this.usermenuCode = usermenuCode;
		this.usermenuLeve = usermenuLeve;
		this.usermenuType = usermenuType;
		this.fkUmid = fkUmid;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsermenuName() {
		return this.usermenuName;
	}

	public void setUsermenuName(String usermenuName) {
		this.usermenuName = usermenuName;
	}

	public String getUsermenuCode() {
		return this.usermenuCode;
	}

	public void setUsermenuCode(String usermenuCode) {
		this.usermenuCode = usermenuCode;
	}

	public Integer getUsermenuLeve() {
		return this.usermenuLeve;
	}

	public void setUsermenuLeve(Integer usermenuLeve) {
		this.usermenuLeve = usermenuLeve;
	}

	public String getUsermenuType() {
		return this.usermenuType;
	}

	public void setUsermenuType(String usermenuType) {
		this.usermenuType = usermenuType;
	}

	public String getFkUmid() {
		return this.fkUmid;
	}

	public void setFkUmid(String fkUmid) {
		this.fkUmid = fkUmid;
	}

	public Integer getUsermenuNo() {
		return usermenuNo;
	}

	public void setUsermenuNo(Integer usermenuNo) {
		this.usermenuNo = usermenuNo;
	}

	public String getUsermenuLink() {
		return usermenuLink;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUsermenuLink(String usermenuLink) {
		this.usermenuLink = usermenuLink;
	}

	public TUserMenu getFkUserMenu() {
		return fkUserMenu;
	}

	public void setFkUserMenu(TUserMenu fkUserMenu) {
		this.fkUserMenu = fkUserMenu;
	}

	public Set getUserMenus() {
		return userMenus;
	}

	public void setUserMenus(Set userMenus) {
		this.userMenus = userMenus;
	}
}