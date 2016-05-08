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
<s:form action="/info/hello.do">
<%-- <s:textfield name="user[0].name"></s:textfield>
<s:textfield name="user[0].age"></s:textfield>
<s:textfield name="user[0].password"></s:textfield>
<s:textfield name="user[1].age"></s:textfield>
<s:textfield name="user[1].name"></s:textfield>
<s:textfield name="user[1].password"></s:textfield> --%>
 <s:textfield name="user['gh'].name"></s:textfield>
<s:textfield name="user['gh'].age"></s:textfield>
<s:textfield name="user['gh'].password"></s:textfield>
<s:textfield name="user['tt'].age"></s:textfield>
<s:textfield name="user['tt'].name"></s:textfield>
<s:textfield name="user['tt'].password"></s:textfield>
<s:submit></s:submit>
</s:form>
</body>
</html>