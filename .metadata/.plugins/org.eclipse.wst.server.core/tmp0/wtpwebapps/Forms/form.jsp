<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forms</title>
</head>
<body>

<form action="/Forms/Controller" method="get">


<input type="text" name="user" value="Sainath">

<input type="submit" value ="OK"> 



</form>

<form action="/Forms/Controller" method="post">

<input type="text" name="id">

<input type="submit" value ="OK">

</form>

</body>
</html>