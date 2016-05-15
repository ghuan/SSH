package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MethodInterceptor extends MethodFilterInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("1");
		String result = arg0.invoke();
		long end = System.currentTimeMillis();
		System.out.println(arg0.getAction().getClass().getName()+" is invoked1 :" + (end-start)+" ms");
		return result;
	}

}
