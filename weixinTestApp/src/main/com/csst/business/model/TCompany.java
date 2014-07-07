package com.csst.business.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TCompany entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TCompany implements java.io.Serializable {

	// Fields

	private String id;
	private String CName;
	private String CDesc;
	private String CAddress;
	private String CInfomation;
	private String CCode;
	private String CLink;
	private Date CUpdatime;
	private String CUpdateuser;
	private String CFax;
	private String CEmail;
	private String CLocation;
	private String CBusline;
	private Set TCompanyRelations = new HashSet(0);
	private Set TShops = new HashSet(0);
	private Set TEffects = new HashSet(0);
	private Set TNotices = new HashSet(0);

	// Constructors

	/** default constructor */
	public TCompany() {
	}

	/** minimal constructor */
	public TCompany(String id) {
		this.id = id;
	}

	/** full constructor */
	public TCompany(String id, String CName, String CDesc, String CAddress,
			String CInfomation, String CCode, String CLink, Date CUpdatime,
			String CUpdateuser, String CFax, String CEmail, String CLocation,
			String CBusline, Set TCompanyRelations, Set TShops, Set TEffects,
			Set TNotices) {
		this.id = id;
		this.CName = CName;
		this.CDesc = CDesc;
		this.CAddress = CAddress;
		this.CInfomation = CInfomation;
		this.CCode = CCode;
		this.CLink = CLink;
		this.CUpdatime = CUpdatime;
		this.CUpdateuser = CUpdateuser;
		this.CFax = CFax;
		this.CEmail = CEmail;
		this.CLocation = CLocation;
		this.CBusline = CBusline;
		this.TCompanyRelations = TCompanyRelations;
		this.TShops = TShops;
		this.TEffects = TEffects;
		this.TNotices = TNotices;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	public String getCDesc() {
		return this.CDesc;
	}

	public void setCDesc(String CDesc) {
		this.CDesc = CDesc;
	}

	public String getCAddress() {
		return this.CAddress;
	}

	public void setCAddress(String CAddress) {
		this.CAddress = CAddress;
	}

	public String getCInfomation() {
		return this.CInfomation;
	}

	public void setCInfomation(String CInfomation) {
		this.CInfomation = CInfomation;
	}

	public String getCCode() {
		return this.CCode;
	}

	public void setCCode(String CCode) {
		this.CCode = CCode;
	}

	public String getCLink() {
		return this.CLink;
	}

	public void setCLink(String CLink) {
		this.CLink = CLink;
	}

	public Date getCUpdatime() {
		return this.CUpdatime;
	}

	public void setCUpdatime(Date CUpdatime) {
		this.CUpdatime = CUpdatime;
	}

	public String getCUpdateuser() {
		return this.CUpdateuser;
	}

	public void setCUpdateuser(String CUpdateuser) {
		this.CUpdateuser = CUpdateuser;
	}

	public String getCFax() {
		return this.CFax;
	}

	public void setCFax(String CFax) {
		this.CFax = CFax;
	}

	public String getCEmail() {
		return this.CEmail;
	}

	public void setCEmail(String CEmail) {
		this.CEmail = CEmail;
	}

	public String getCLocation() {
		return this.CLocation;
	}

	public void setCLocation(String CLocation) {
		this.CLocation = CLocation;
	}

	public String getCBusline() {
		return this.CBusline;
	}

	public void setCBusline(String CBusline) {
		this.CBusline = CBusline;
	}

	public Set getTCompanyRelations() {
		return this.TCompanyRelations;
	}

	public void setTCompanyRelations(Set TCompanyRelations) {
		this.TCompanyRelations = TCompanyRelations;
	}

	public Set getTShops() {
		return this.TShops;
	}

	public void setTShops(Set TShops) {
		this.TShops = TShops;
	}

	public Set getTEffects() {
		return this.TEffects;
	}

	public void setTEffects(Set TEffects) {
		this.TEffects = TEffects;
	}

	public Set getTNotices() {
		return this.TNotices;
	}

	public void setTNotices(Set TNotices) {
		this.TNotices = TNotices;
	}

}