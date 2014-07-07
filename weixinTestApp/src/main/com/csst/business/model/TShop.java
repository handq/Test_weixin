package com.csst.business.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TShop entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TShop implements java.io.Serializable {

	// Fields

	private String id;
	private TCompany TCompany;
	private String SImglink;
	private String SNotice;
	private String SState;
	private String SType;
	private String SOpeningtime;
	private String SServiceArea;
	private String SDistributionArea;
	private String SPredateRelation;
	private String SLocation;
	private String SDesc;
	private Date SUpdatedate;
	private String SUpdateuser;
	private Set BMenus = new HashSet(0);

	// Constructors

	/** default constructor */
	public TShop() {
	}

	/** minimal constructor */
	public TShop(String id) {
		this.id = id;
	}

	/** full constructor */
	public TShop(String id, TCompany TCompany, String SImglink, String SNotice,
			String SState, String SType, String SOpeningtime,
			String SServiceArea, String SDistributionArea,
			String SPredateRelation, String SLocation, String SDesc,
			Date SUpdatedate, String SUpdateuser, Set BMenus) {
		this.id = id;
		this.TCompany = TCompany;
		this.SImglink = SImglink;
		this.SNotice = SNotice;
		this.SState = SState;
		this.SType = SType;
		this.SOpeningtime = SOpeningtime;
		this.SServiceArea = SServiceArea;
		this.SDistributionArea = SDistributionArea;
		this.SPredateRelation = SPredateRelation;
		this.SLocation = SLocation;
		this.SDesc = SDesc;
		this.SUpdatedate = SUpdatedate;
		this.SUpdateuser = SUpdateuser;
		this.BMenus = BMenus;
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

	public String getSImglink() {
		return this.SImglink;
	}

	public void setSImglink(String SImglink) {
		this.SImglink = SImglink;
	}

	public String getSNotice() {
		return this.SNotice;
	}

	public void setSNotice(String SNotice) {
		this.SNotice = SNotice;
	}

	public String getSState() {
		return this.SState;
	}

	public void setSState(String SState) {
		this.SState = SState;
	}

	public String getSType() {
		return this.SType;
	}

	public void setSType(String SType) {
		this.SType = SType;
	}

	public String getSOpeningtime() {
		return this.SOpeningtime;
	}

	public void setSOpeningtime(String SOpeningtime) {
		this.SOpeningtime = SOpeningtime;
	}

	public String getSServiceArea() {
		return this.SServiceArea;
	}

	public void setSServiceArea(String SServiceArea) {
		this.SServiceArea = SServiceArea;
	}

	public String getSDistributionArea() {
		return this.SDistributionArea;
	}

	public void setSDistributionArea(String SDistributionArea) {
		this.SDistributionArea = SDistributionArea;
	}

	public String getSPredateRelation() {
		return this.SPredateRelation;
	}

	public void setSPredateRelation(String SPredateRelation) {
		this.SPredateRelation = SPredateRelation;
	}

	public String getSLocation() {
		return this.SLocation;
	}

	public void setSLocation(String SLocation) {
		this.SLocation = SLocation;
	}

	public String getSDesc() {
		return this.SDesc;
	}

	public void setSDesc(String SDesc) {
		this.SDesc = SDesc;
	}

	public Date getSUpdatedate() {
		return this.SUpdatedate;
	}

	public void setSUpdatedate(Date SUpdatedate) {
		this.SUpdatedate = SUpdatedate;
	}

	public String getSUpdateuser() {
		return this.SUpdateuser;
	}

	public void setSUpdateuser(String SUpdateuser) {
		this.SUpdateuser = SUpdateuser;
	}

	public Set getBMenus() {
		return this.BMenus;
	}

	public void setBMenus(Set BMenus) {
		this.BMenus = BMenus;
	}

}