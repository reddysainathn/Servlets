<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user5" class="beans.User" scope ="page"></jsp:useBean>


Without any param or value assigned we can access with the property name as

<br>http://localhost:8088/JSP-Beans/bean-parameters.jsp?password=Hello


<br>

<jsp:setProperty  name="user5" property="password" param="p"/>

<jsp:setProperty  name="user5" property="*" />

Email::<span /><%=user5.getEmail() %>
<br>
Password::<%=user5.getPassword() %>
</body>
</html>