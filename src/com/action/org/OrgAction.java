package com.action.org;

import com.action.entity.Org;
import com.opensymphony.xwork2.ActionSupport;

public class OrgAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Org org;
	public Org getOrg() {
		return org;
	}

	public void setOrg(Org org) {
		this.org = org;
	}

	public String execute(){
		
		return SUCCESS;
	}
	public String getOrgw(){
		
		return SUCCESS;
	}
}
