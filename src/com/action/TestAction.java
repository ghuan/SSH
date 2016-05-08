package com.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Map user;
	private String hello;
	
	
	public Map getUser() {
		return user;
	}

	public void setUser(Map user) {
		this.user = user;
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public String execute(){
		
		hello = "大笨蛋";
		return SUCCESS;
	}
}
