package com.csst.business.model;

import java.util.Date;

/**
 * TNotice entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TNotice implements java.io.Serializable {

	// Fields

	private String id;
	private TCompany TCompany;
	private String STitle;
	private String SCode;
	private String SContent;
	private Integer SState;
	private Date SCreatetime;
	private String SCreatuer;
	private String SLink;

	// Constructors

	/** default constructor */
	public TNotice() {
	}

	/** minimal constructor */
	public TNotice(String id) {
		this.id = id;
	}

	/** full constructor */
	public TNotice(String id, TCompany TCompany, String STitle, String SCode,
			String SContent, Integer SState, Date SCreatetime,
			String SCreatuer, String SLink) {
		this.id = id;
		this.TCompany = TCompany;
		this.STitle = STitle;
		this.SCode = SCode;
		this.SContent = SContent;
		this.SState = SState;
		this.SCreatetime = SCreatetime;
		this.SCreatuer = SCreatuer;
		this.SLink = SLink;
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

	public String getSTitle() {
		return this.STitle;
	}

	public void setSTitle(String STitle) {
		this.STitle = STitle;
	}

	public String getSCode() {
		return this.SCode;
	}

	public void setSCode(String SCode) {
		this.SCode = SCode;
	}

	public String getSContent() {
		return this.SContent;
	}

	public void setSContent(String SContent) {
		this.SContent = SContent;
	}

	public Integer getSState() {
		return this.SState;
	}

	public void setSState(Integer SState) {
		this.SState = SState;
	}

	public Date getSCreatetime() {
		return this.SCreatetime;
	}

	public void setSCreatetime(Date SCreatetime) {
		this.SCreatetime = SCreatetime;
	}

	public String getSCreatuer() {
		return this.SCreatuer;
	}

	public void setSCreatuer(String SCreatuer) {
		this.SCreatuer = SCreatuer;
	}

	public String getSLink() {
		return this.SLink;
	}

	public void setSLink(String SLink) {
		this.SLink = SLink;
	}

}