package com.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class AliaseAction2 extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private String str3;
	private String str2;
	
	public String execute(){
		
		return SUCCESS;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	
	
}
