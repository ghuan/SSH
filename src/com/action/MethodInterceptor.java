package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class MethodInterceptor extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("execute");
		return SUCCESS;
	}
	public String method1() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("method1");
		return SUCCESS;
	}
	public String method2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("method2");
		return SUCCESS;
	}
	public String method3() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("method3");
		return SUCCESS;
	}
}
