package com.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONString;
import net.sf.json.util.JSONUtils;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletResponse response = ServletActionContext.getResponse();
		if("tom".equals(name) && "111".equals(password)){
			response.getWriter().println("success");
		}else {
			response.getWriter().println("false");
		}
		return null;
	}
	
	public void login() throws Exception {
		// TODO Auto-generated method stub
		HttpServletResponse response = ServletActionContext.getResponse();
		Map<String,Object> map = new HashMap<String,Object>();
		
		if("tom".equals(name) && "111".equals(password)){
			
			map.put("success", true);
			map.put("msg", "login success!");
			response.getWriter().println(JSONObject.fromObject(map).toString());
		}else {
			
			map.put("success", false);
			map.put("msg", "login fail!");
			response.getWriter().println(JSONObject.fromObject(map).toString());
		}
	}

}
