package com.action.entity;

import java.util.Date;

public class Org {
	private String orgName;
	private Date bz;
	private Integer zfbz;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public Date getBz() {
		return bz;
	}
	public void setBz(Date bz) {
		this.bz = bz;
	}
	public Integer getZfbz() {
		return zfbz;
	}
	public void setZfbz(Integer zfbz) {
		this.zfbz = zfbz;
	}
	
}
