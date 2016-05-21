<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%	request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="reg" scope="request" class="com.chen.Register"/>

<body>
	用户名:<jsp:getProperty name="reg" property="name"/><br>
	年龄&nbsp&nbsp;龄:<jsp:getProperty name="reg" property="age"/><br>
	E-Mail:	<jsp:getProperty name="reg" property="email"/><br>	
</body>
</html>