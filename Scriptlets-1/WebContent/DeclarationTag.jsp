<%@page import="java.io.PrintWriter"%>
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
	//JSP pages are converted to Servlets before they are converted to classes and run by the server
%>
	<!-- Declaration Tag -->
	<%!private String name = "John";

	private String getInfo() {
		return "Hello There From DELACRATION TAG";
	}%>
	<%
		out.println(getInfo());
	%>

</body>
</html>