<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String[ ] names = {"Harry","Man"};

pageContext.setAttribute("nameslist",names,PageContext.PAGE_SCOPE);

%>

<c:forEach items="${nameslist}" var="name">

<h1>${name }</h1><br>
</c:forEach>
</body>
</html>