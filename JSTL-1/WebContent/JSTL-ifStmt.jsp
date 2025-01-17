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
<c:out value="Hello World JSTL"></c:out>

 <jsp:useBean id="test" class="beans.TestBean" scope="page"></jsp:useBean>
 <p>Value of info Attribute:<c:out value="${test.info}"></c:out></p>


<%--This is new type of Comment in JSTL and this cooments won't appear --%>

<%--Getting URL parameters --%>

<%--Try this url to see the output (http://localhost:8088/JSTL-1/JSTL-bean.jsp?name=john)--%>
Name Parameter:<c:out value="${param.name }"></c:out>


<%--JSTL if Statement --%>

<p/>
<%--Conditon goes in test attribute --%>
<%--List of Implicit Objects like param goto==(http://docs.oracle.com/javaee/1.4/tutorial/doc/JSPIntro7.html) --%>
<c:if test='${param.name == "John" }'>
Hello Bob
</c:if>

<c:if test='${param.name != "John" }'>
Hello there
</c:if>
 
</body>
</html>