<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/uploader" enctype="multipart/form-data" >

<input type="file" value=" Select image.." />

<input type="submit" value="Start Upload" />


</form>

</body>
</html>