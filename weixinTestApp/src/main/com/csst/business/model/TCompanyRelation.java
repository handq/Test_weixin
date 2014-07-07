package com.csst.business.model;

import java.util.Date;

/**
 * TCompanyRelation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TCompanyRelation implements java.io.Serializable {

	// Fields

	private String id;
	private TCompany TCompany;
	private String crName;
	private String crCode;
	private String crValue;
	private Date crUpdatedate;

	// Constructors

	/** default constructor */
	public TCompanyRelation() {
	}

	/** minimal constructor */
	public TCompanyRelation(String id) {
		this.id = id;
	}

	/** full constructor */
	public TCompanyRelation(String id, TCompany TCompany, String crName,
			String crCode, String crValue, Date crUpdatedate) {
		this.id = id;
		this.TCompany = TCompany;
		this.crName = crName;
		this.crCode = crCode;
		this.crValue = crValue;
		this.crUpdatedate = crUpdatedate;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TCompany getTCompany() {
		return this.TCompany;
	}

	public void setTCompany(TCompany TCompany) {
		this.TCompany = TCompany;
	}

	public String getCrName() {
		return this.crName;
	}

	public void setCrName(String crName) {
		this.crName = crName;
	}

	public String getCrCode() {
		return this.crCode;
	}

	public void setCrCode(String crCode) {
		this.crCode = crCode;
	}

	public String getCrValue() {
		return this.crValue;
	}

	public void setCrValue(String crValue) {
		this.crValue = crValue;
	}

	public Date getCrUpdatedate() {
		return this.crUpdatedate;
	}

	public void setCrUpdatedate(Date crUpdatedate) {
		this.crUpdatedate = crUpdatedate;
	}

}