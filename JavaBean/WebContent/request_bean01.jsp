<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="cou" scope="request" class="com.chen.Count"/>
	<h3>第<jsp:getProperty name="cou" property="count"/>次访问</h3>
	<jsp:forward page="request_bean02.jsp"></jsp:forward>
</body>
</html>