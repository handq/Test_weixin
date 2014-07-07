package com.csst.business.model;

import java.util.Date;

/**
 * BOnline entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class BOnline implements java.io.Serializable {

	// Fields

	private String id;
	private String OUsername;
	private String OPhone;
	private Date OPretime;
	private Integer OUserno;
	private String OHorseType;
	private Integer OHorseNo;
	private Date OArriveDate;
	private Date OLeaveDate;
	private String ODesc;

	// Constructors

	/** default constructor */
	public BOnline() {
	}

	/** minimal constructor */
	public BOnline(String id) {
		this.id = id;
	}

	/** full constructor */
	public BOnline(String id, String OUsername, String OPhone, Date OPretime,
			Integer OUserno, String OHorseType, Integer OHorseNo,
			Date OArriveDate, Date OLeaveDate, String ODesc) {
		this.id = id;
		this.OUsername = OUsername;
		this.OPhone = OPhone;
		this.OPretime = OPretime;
		this.OUserno = OUserno;
		this.OHorseType = OHorseType;
		this.OHorseNo = OHorseNo;
		this.OArriveDate = OArriveDate;
		this.OLeaveDate = OLeaveDate;
		this.ODesc = ODesc;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOUsername() {
		return this.OUsername;
	}

	public void setOUsername(String OUsername) {
		this.OUsername = OUsername;
	}

	public String getOPhone() {
		return this.OPhone;
	}

	public void setOPhone(String OPhone) {
		this.OPhone = OPhone;
	}

	public Date getOPretime() {
		return this.OPretime;
	}

	public void setOPretime(Date OPretime) {
		this.OPretime = OPretime;
	}

	public Integer getOUserno() {
		return this.OUserno;
	}

	public void setOUserno(Integer OUserno) {
		this.OUserno = OUserno;
	}

	public String getOHorseType() {
		return this.OHorseType;
	}

	public void setOHorseType(String OHorseType) {
		this.OHorseType = OHorseType;
	}

	public Integer getOHorseNo() {
		return this.OHorseNo;
	}

	public void setOHorseNo(Integer OHorseNo) {
		this.OHorseNo = OHorseNo;
	}

	public Date getOArriveDate() {
		return this.OArriveDate;
	}

	public void setOArriveDate(Date OArriveDate) {
		this.OArriveDate = OArriveDate;
	}

	public Date getOLeaveDate() {
		return this.OLeaveDate;
	}

	public void setOLeaveDate(Date OLeaveDate) {
		this.OLeaveDate = OLeaveDate;
	}

	public String getODesc() {
		return this.ODesc;
	}

	public void setODesc(String ODesc) {
		this.ODesc = ODesc;
	}

}