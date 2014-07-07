package com.csst.business.model;

import java.util.Date;

/**
 * BUser entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class BUser implements java.io.Serializable {

	// Fields

	private String userPass;
	private String id;
	private String userName;
	private String userEmail;
	private Date userCratetime;

	// Constructors

	/** default constructor */
	public BUser() {
	}

	/** minimal constructor */
	public BUser(String userPass) {
		this.userPass = userPass;
	}

	/** full constructor */
	public BUser(String userPass, String id, String userName, String userEmail,
			Date userCratetime) {
		this.userPass = userPass;
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userCratetime = userCratetime;
	}

	// Property accessors

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getUserCratetime() {
		return this.userCratetime;
	}

	public void setUserCratetime(Date userCratetime) {
		this.userCratetime = userCratetime;
	}

}