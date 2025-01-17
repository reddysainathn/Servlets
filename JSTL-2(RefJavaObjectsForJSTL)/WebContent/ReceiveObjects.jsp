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

User-1 Name:<c:out value="${user1.name }"></c:out><br>
User-2 Name:<c:out value="${user2.name }"></c:out><br>
User-3 Name:<c:out value="${user3.name }"></c:out><br>
User-1 ID:<c:out value="${user1.id }"></c:out><br>
User-2 ID:<c:out value="${user2.id }"></c:out><br>
User-3 ID:<c:out value="${user3.id }"></c:out><br>

<%--Using Implicit Objects --(http://www.informit.com/articles/article.aspx?p=30946&seqNum=7)--%>

User-1 Name:<c:out value="${sessionScope.user1.name }"></c:out><br>
User-2 Name:<c:out value="${requestScope.user2.name}"></c:out><br>
User-3 Name:<c:out value="${applicationScope.user3.name }"></c:out><br>



<%-- Maps in Expression Language --%>



Map Objects:<c:out value='${map1["fruit"] }'></c:out><br>
Map Objects:<c:out value='${map2["fruit"] }'></c:out><br>


<c:out value="${link }"></c:out><br>


${link }<br>



</body>
</html>