<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%--JSTL choose Tag --%>
	<p />
	<c:choose>
		<c:when test="${param.id == 1} ">
			<strong>ID is equal to 1</strong>
		</c:when>
		<c:when test="${param.id == 2} ">
			<strong>ID is equal to 2</strong>
		</c:when>
		<c:otherwise>
			<strong>ID is equal to Neither 1 Nor 2</strong>
		</c:otherwise>
	</c:choose>

</body>
</html>