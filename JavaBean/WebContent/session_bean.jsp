<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id = "cou" scope="session" class="com.chen.Count"/>


<body>
<h2>第<jsp:getProperty name="cou" property="count"/>次访问</h2>
<%session.removeAttribute("cou"); %>
</body>
</html>