package com.csst.business.model;

import java.util.Date;

/**
 * BMenu entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class BMenu implements java.io.Serializable {

	// Fields

	private String id;
	private TShop TShop;
	private String MName;
	private String MCode;
	private String MDiscription;
	private String MImgLink;
	private String MDiscountDis;
	private Double MPrice;
	private Double MDiccountPrice;
	private String MDicountInfo;
	private Date MUpdatetime;
	private String MUpdateuser;

	// Constructors

	/** default constructor */
	public BMenu() {
	}

	/** minimal constructor */
	public BMenu(String id) {
		this.id = id;
	}

	/** full constructor */
	public BMenu(String id, TShop TShop, String MName, String MCode,
			String MDiscription, String MImgLink, String MDiscountDis,
			Double MPrice, Double MDiccountPrice, String MDicountInfo,
			Date MUpdatetime, String MUpdateuser) {
		this.id = id;
		this.TShop = TShop;
		this.MName = MName;
		this.MCode = MCode;
		this.MDiscription = MDiscription;
		this.MImgLink = MImgLink;
		this.MDiscountDis = MDiscountDis;
		this.MPrice = MPrice;
		this.MDiccountPrice = MDiccountPrice;
		this.MDicountInfo = MDicountInfo;
		this.MUpdatetime = MUpdatetime;
		this.MUpdateuser = MUpdateuser;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TShop getTShop() {
		return this.TShop;
	}

	public void setTShop(TShop TShop) {
		this.TShop = TShop;
	}

	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

	public String getMCode() {
		return this.MCode;
	}

	public void setMCode(String MCode) {
		this.MCode = MCode;
	}

	public String getMDiscription() {
		return this.MDiscription;
	}

	public void setMDiscription(String MDiscription) {
		this.MDiscription = MDiscription;
	}

	public String getMImgLink() {
		return this.MImgLink;
	}

	public void setMImgLink(String MImgLink) {
		this.MImgLink = MImgLink;
	}

	public String getMDiscountDis() {
		return this.MDiscountDis;
	}

	public void setMDiscountDis(String MDiscountDis) {
		this.MDiscountDis = MDiscountDis;
	}

	public Double getMPrice() {
		return this.MPrice;
	}

	public void setMPrice(Double MPrice) {
		this.MPrice = MPrice;
	}

	public Double getMDiccountPrice() {
		return this.MDiccountPrice;
	}

	public void setMDiccountPrice(Double MDiccountPrice) {
		this.MDiccountPrice = MDiccountPrice;
	}

	public String getMDicountInfo() {
		return this.MDicountInfo;
	}

	public void setMDicountInfo(String MDicountInfo) {
		this.MDicountInfo = MDicountInfo;
	}

	public Date getMUpdatetime() {
		return this.MUpdatetime;
	}

	public void setMUpdatetime(Date MUpdatetime) {
		this.MUpdatetime = MUpdatetime;
	}

	public String getMUpdateuser() {
		return this.MUpdateuser;
	}

	public void setMUpdateuser(String MUpdateuser) {
		this.MUpdateuser = MUpdateuser;
	}

}