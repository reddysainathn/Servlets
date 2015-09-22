<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="structs" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<structs:form action="loginProcess">
<h2 align="center">Login Page</h2>

<structs:textfield label="Username" name="username"></structs:textfield>
<structs:password label="Password" name="password"></structs:password>
<structs:submit value="LOGIN"></structs:submit>
</structs:form>

</body>
</html>