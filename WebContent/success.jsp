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
<s:property value="hello"/>
<%-- ${user[0].name }
${user[0].password }
${user[0].age }
${user[1].name }
${user[1].password }
${user[1].age } --%>
 ${user['gh'].name }
${user['gh'].password }
${user['gh'].age }
${user['tt'].name }
${user['tt'].password }
${user['tt'].age }
</body>
</html>