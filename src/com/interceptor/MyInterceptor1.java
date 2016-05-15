package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor1 implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println("1");
		String result = arg0.invoke();
		long end = System.currentTimeMillis();
		System.out.println(arg0.getAction().getClass().getName()+" is invoked1 :" + (end-start)+" ms");
		return result;
	}

}
