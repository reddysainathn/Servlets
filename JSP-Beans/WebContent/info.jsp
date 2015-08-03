<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Beans are mechanism for sharing data between JSP pages
Scope is so Important in Beans
Page Scope-->Using the Bean on only One page and it won't survive the Redirect
Request Scope-->Request is using only on Request,Only one request can be made,and no redirect but it can survive forward
Session Scope-->It sets a coockie where it sets a Time-Out 
Application Scope-->Application scope is not for user,but its for Web-Application ,survives multiple users,and multiple Applications and browsers
</body>
</html>