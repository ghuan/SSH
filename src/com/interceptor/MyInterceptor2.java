package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor2 extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("2");
		String result = arg0.invoke();
		long end = System.currentTimeMillis();
		System.out.println(arg0.getAction().getClass().getName()+" is invoked2 :" + (end-start)+" ms");
		return result;
	}

}
