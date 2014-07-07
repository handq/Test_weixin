package com.csst.business.model;

import java.sql.Timestamp;
import java.util.Set;
import java.util.TreeSet;

/**
 * TWcmChannel entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TTrUser implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -584145807648200955L;
	private String id;
	/**用户名*/
	private String tuUsername;
	/**用户密码*/
	private String tuPassword;
	/**用户密码*/
	private String tuEmail;
	/**用户手机号*/
	private String tuPhone;
	/**身份证号*/
	private String tuIdno;
	/**专业*/
	private String tuMajor;
	/**创建用户*/
	private String tuCreateuser;
	/**性别*/
	private Integer tuSex;
	/**填写 省 市 服务区*/
	private String  tuArea;
	/**状态  1表明是卖家，0表明是普通的用户*/
	private Integer  tuStatus;
	/**审核*/
	private Integer  tuAudit;
	/**删除*/
	private Integer  tuEnable;
	/**创建时间*/
	private Timestamp tuCreatetime;
	
	/**用户的真实姓名*/
	private String realName;
	
	/***
	 * 用户注册的时候，需要验证邮箱，如果没有验证邮箱，则不能登录！
	 * 等登陆的时候，跳转到提交验证码的界面
	 * 验证完毕之后，将该字段设置为null，
	 */
	private Integer registAuthCode;
	
	public Integer getRegistAuthCode() {
		return registAuthCode;
	}
	public void setRegistAuthCode(Integer registAuthCode) {
		this.registAuthCode = registAuthCode;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTuUsername() {
		return tuUsername;
	}
	public void setTuUsername(String tuUsername) {
		this.tuUsername = tuUsername;
	}
	public String getTuPassword() {
		return tuPassword;
	}
	public void setTuPassword(String tuPassword) {
		this.tuPassword = tuPassword;
	}
	public String getTuEmail() {
		return tuEmail;
	}
	public void setTuEmail(String tuEmail) {
		this.tuEmail = tuEmail;
	}
	public String getTuPhone() {
		return tuPhone;
	}
	public void setTuPhone(String tuPhone) {
		this.tuPhone = tuPhone;
	}
	public String getTuIdno() {
		return tuIdno;
	}
	public void setTuIdno(String tuIdno) {
		this.tuIdno = tuIdno;
	}
	public String getTuMajor() {
		return tuMajor;
	}
	public void setTuMajor(String tuMajor) {
		this.tuMajor = tuMajor;
	}
	public String getTuCreateuser() {
		return tuCreateuser;
	}
	public void setTuCreateuser(String tuCreateuser) {
		this.tuCreateuser = tuCreateuser;
	}
	public Integer getTuSex() {
		return tuSex;
	}
	public void setTuSex(Integer tuSex) {
		this.tuSex = tuSex;
	}
	public String getTuArea() {
		return tuArea;
	}
	public void setTuArea(String tuArea) {
		this.tuArea = tuArea;
	}
	public Integer getTuStatus() {
		return tuStatus;
	}
	public void setTuStatus(Integer tuStatus) {
		this.tuStatus = tuStatus;
	}
	public Integer getTuAudit() {
		return tuAudit;
	}
	public void setTuAudit(Integer tuAudit) {
		this.tuAudit = tuAudit;
	}
	public Integer getTuEnable() {
		return tuEnable;
	}
	public void setTuEnable(Integer tuEnable) {
		this.tuEnable = tuEnable;
	}
	public Timestamp getTuCreatetime() {
		return tuCreatetime;
	}
	public void setTuCreatetime(Timestamp tuCreatetime) {
		this.tuCreatetime = tuCreatetime;
	}
	
	
	
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	@Override
	public String toString() {
		return "TTrUser [tuUsername=" + tuUsername + ", tuPassword="
				+ tuPassword + ", tuEmail=" + tuEmail + ", tuPhone=" + tuPhone
				+ ", tuIdno=" + tuIdno + ", tuMajor=" + tuMajor
				+ ", tuCreateuser=" + tuCreateuser + ", tuSex=" + tuSex
				+ ", tuArea=" + tuArea + ", tuStatus=" + tuStatus
				+ ", tuAudit=" + tuAudit + ", tuEnable=" + tuEnable
				+ ", tuCreatetime=" + tuCreatetime + "]";
	}
	
}