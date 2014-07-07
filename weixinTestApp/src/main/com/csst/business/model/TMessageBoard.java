package com.csst.business.model;

import java.util.Date;

/**
 * TMessageBoard entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TMessageBoard implements java.io.Serializable {

	// Fields

	private String id;
	private String MContent;
	private Date MDate;
	private String MUsername;
	private String MOpenid;
	private Integer MType;
	private String fkMId;

	// Constructors

	/** default constructor */
	public TMessageBoard() {
	}

	/** minimal constructor */
	public TMessageBoard(String id) {
		this.id = id;
	}

	/** full constructor */
	public TMessageBoard(String id, String MContent, Date MDate,
			String MUsername, String MOpenid, Integer MType, String fkMId) {
		this.id = id;
		this.MContent = MContent;
		this.MDate = MDate;
		this.MUsername = MUsername;
		this.MOpenid = MOpenid;
		this.MType = MType;
		this.fkMId = fkMId;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMContent() {
		return this.MContent;
	}

	public void setMContent(String MContent) {
		this.MContent = MContent;
	}

	public Date getMDate() {
		return this.MDate;
	}

	public void setMDate(Date MDate) {
		this.MDate = MDate;
	}

	public String getMUsername() {
		return this.MUsername;
	}

	public void setMUsername(String MUsername) {
		this.MUsername = MUsername;
	}

	public String getMOpenid() {
		return this.MOpenid;
	}

	public void setMOpenid(String MOpenid) {
		this.MOpenid = MOpenid;
	}

	public Integer getMType() {
		return this.MType;
	}

	public void setMType(Integer MType) {
		this.MType = MType;
	}

	public String getFkMId() {
		return this.fkMId;
	}

	public void setFkMId(String fkMId) {
		this.fkMId = fkMId;
	}

}