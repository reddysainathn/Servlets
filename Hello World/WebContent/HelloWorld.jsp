<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
//Method-1
//java.util.Date today = new java.util.Date();
//String text = "Todays's Date is :"+today.toString();

String text = "Todays's Date is :";
out.println(text);
%>

<%=
	
//text
new java.util.Date()


%>
</body>
</html>