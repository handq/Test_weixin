package com.csst.business.model;

import java.util.Date;

/**
 * TUser entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable {

	// Fields

	private String id;
	private String UName;
	private String UOpenid;
	private String UWeixinno;
	private String UPhone;
	private String UEmail;
	private Date UUpdatetime;

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(String id) {
		this.id = id;
	}

	/** full constructor */
	public TUser(String id, String UName, String UOpenid, String UWeixinno,
			String UPhone, String UEmail, Date UUpdatetime) {
		this.id = id;
		this.UName = UName;
		this.UOpenid = UOpenid;
		this.UWeixinno = UWeixinno;
		this.UPhone = UPhone;
		this.UEmail = UEmail;
		this.UUpdatetime = UUpdatetime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUOpenid() {
		return this.UOpenid;
	}

	public void setUOpenid(String UOpenid) {
		this.UOpenid = UOpenid;
	}

	public String getUWeixinno() {
		return this.UWeixinno;
	}

	public void setUWeixinno(String UWeixinno) {
		this.UWeixinno = UWeixinno;
	}

	public String getUPhone() {
		return this.UPhone;
	}

	public void setUPhone(String UPhone) {
		this.UPhone = UPhone;
	}

	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	public Date getUUpdatetime() {
		return this.UUpdatetime;
	}

	public void setUUpdatetime(Date UUpdatetime) {
		this.UUpdatetime = UUpdatetime;
	}

}