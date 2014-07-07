package com.csst.business.action;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;

import com.csst.business.model.TCompany;
import com.csst.business.model.TTrUser;
import com.csst.business.service.ICompanyService;
import com.csst.business.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CompanyAction extends ActionSupport{
	private ICompanyService companyService;
	private TCompany company;
	
	public String testAction(){
		return "bbb";
	}
	
	public void saveCompany(){
		company = companyService.saveCompany(company);
		try {
			ServletActionContext.getResponse().getWriter().print(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCompanyData(){
		company = companyService.getCompanyData();
		return "company";
	}
	

	public ICompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(ICompanyService companyService) {
		this.companyService = companyService;
	}

	public TCompany getCompany() {
		return company;
	}

	public void setCompany(TCompany company) {
		this.company = company;
	}
	
}
