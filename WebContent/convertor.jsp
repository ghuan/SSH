<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="org" namespace="/info">
  用户名：<s:textfield name="org.orgName"/><br/>  
    密码：<s:textfield name="org.bz"/><br/>  
    手机版：<s:textfield name="org.zfbz"/><br/>  
    <s:textfield name="org.email"/><br/>  
<s:submit></s:submit>
</s:form>
</body>
</html>