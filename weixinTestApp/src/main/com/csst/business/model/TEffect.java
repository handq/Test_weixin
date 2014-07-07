package com.csst.business.model;

import java.util.Date;

/**
 * TEffect entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TEffect implements java.io.Serializable {

	// Fields

	private String id;
	private TCompany TCompany;
	private String EName;
	private String ECode;
	private String ELink;
	private String EContent;
	private String EDesc;
	private String EUsername;
	private Date EUpdatetime;

	// Constructors

	/** default constructor */
	public TEffect() {
	}

	/** minimal constructor */
	public TEffect(String id) {
		this.id = id;
	}

	/** full constructor */
	public TEffect(String id, TCompany TCompany, String EName, String ECode,
			String ELink, String EContent, String EDesc, String EUsername,
			Date EUpdatetime) {
		this.id = id;
		this.TCompany = TCompany;
		this.EName = EName;
		this.ECode = ECode;
		this.ELink = ELink;
		this.EContent = EContent;
		this.EDesc = EDesc;
		this.EUsername = EUsername;
		this.EUpdatetime = EUpdatetime;
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

	public String getEName() {
		return this.EName;
	}

	public void setEName(String EName) {
		this.EName = EName;
	}

	public String getECode() {
		return this.ECode;
	}

	public void setECode(String ECode) {
		this.ECode = ECode;
	}

	public String getELink() {
		return this.ELink;
	}

	public void setELink(String ELink) {
		this.ELink = ELink;
	}

	public String getEContent() {
		return this.EContent;
	}

	public void setEContent(String EContent) {
		this.EContent = EContent;
	}

	public String getEDesc() {
		return this.EDesc;
	}

	public void setEDesc(String EDesc) {
		this.EDesc = EDesc;
	}

	public String getEUsername() {
		return this.EUsername;
	}

	public void setEUsername(String EUsername) {
		this.EUsername = EUsername;
	}

	public Date getEUpdatetime() {
		return this.EUpdatetime;
	}

	public void setEUpdatetime(Date EUpdatetime) {
		this.EUpdatetime = EUpdatetime;
	}

}