package com.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class A{
	public String dd = "";
	public void a(){
		
		System.out.println("a");
	}
	public void b(){
		
		System.out.println("b");
	}
	
}

class B extends A{
	String a = new String();
	Object b = a;
	public void a(){
		
		System.out.println("a");
	}
	public void c(){
		
		System.out.println("c");
	}
}
public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		
	}

}
