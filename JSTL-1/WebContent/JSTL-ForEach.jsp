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


	<%--JSTL ForEach LOOP --%>

	<c:forEach var="i" begin="0" end="10" step="2" varStatus="status">

		<b>Loop Counter is:<c:out value="${i }"></c:out><span></span>
		</b>
		<c:out value="${status }"></c:out><span></span>
		
		<c:if test="${status.first }">
		
		This was the first Iteration.<br>
		</c:if>
		<c:if test="${status.last }">
		
		This was the first Last.<span></span>
		</c:if>
		<br>
		<br>

	</c:forEach>

</body>
</html>