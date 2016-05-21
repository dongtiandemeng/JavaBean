<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<% request.setCharacterEncoding("utf-8"); %>
<body>
<jsp:useBean id="simple" scope="page" class="com.chen.SimpleBean"/>
<jsp:setProperty name="simple" property="name" param="age"/>
<jsp:setProperty name="simple" property="age"  param="name"/>
	<h3>姓名：<%= simple.getName() %></h3>
	<h3>年龄：<%= simple.getAge() %></h3>
</body>
</html>