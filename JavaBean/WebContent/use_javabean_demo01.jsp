<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.chen.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	SimpleBean simpleBean = new SimpleBean();
	simpleBean.setName("李兴华");
	simpleBean.setAge(30);
%>
	<h3>姓名：<%= simpleBean.getName() %></h3>
	<h3>年龄：<%= simpleBean.getAge() %></h3>

</body>
</html>