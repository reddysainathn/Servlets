<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- * Scope is Very Important
     * Session is one of the most important Scope for a bean
     * If we use session in scope,a cookie is set on the browser and that cookie has a time-out which it might be 10min for Tomcat
     * We can change the time-out configuring web.xml
     *-->
	<jsp:useBean id="user4" class="beans.User" scope="application"></jsp:useBean>

	<jsp:setProperty name="user4" property="email" value="Hello@yahoo.com" />

	<jsp:setProperty name="user4" property="password" value="letmein" />
	

<h2>Beans Set </h2>
</body>
</html>