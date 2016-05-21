<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr=false;
	function createXhr(){
		try {
			xhr = new ActiveXObject("msxml2.XMLHTTP");
		} catch (e1) {
			// TODO: handle exception
			try {
				xhr = new ActiveXObject("microsoft.XMLHTTP");
			} catch (e2) {
				// TODO: handle exception
				try {
					xhr = new XMLHttpRequest();
				} catch (e3) {
					// TODO: handle exception
					alert("your browers is not allow xmlhttprequest!");
				}
			}
		}
	}
	function sendRequest(){
		createXhr();
		if(xhr){
			var name = document.getElementById('name').value;
			var password = document.getElementById('password').value;
			var uri = "intercept/login!login.do";
			xhr.onreadystatechange = callBack;
			xhr.open("post",uri,false);
			xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded"); 
			xhr.setRequestHeader("Content-length", ("name="+name + "&password="+password).length);
			xhr.send("name="+name + "&password="+password);
		}
		
		function callBack(){
			
			if(xhr.readyState == 4 && xhr.status == 200){
				alert(JSON.parse(xhr.responseText).msg);
			}
		}
	}
</script>
</head>
<body>
<input type="text" id="name"/>
<input type="text" id="password"/>
<input type="button" id="submit" onclick="sendRequest()">
</body>
</html>