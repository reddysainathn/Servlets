<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clothes Department</title>
</head>
<body>

<h2 align="center">Clothes</h2>

<form action="clothesPage">
<div align="right">You got  ${count} in the cart</div>
<div align="center">
<table>

<tr><td align="left" >Frock</td><td ><input type="checkbox" value="Frock" name="item7"></td></tr>
<tr><td align="left" >Anarkali</td><td ><input type="checkbox" value="Anarkali" name="item8"></td></tr>
<tr><td align="left" >Chudidar</td><td ><input type="checkbox" value="Chudidar" name="item9"></td></tr>
<tr><td><input type="submit" value="CheckOut>>>"></td></tr>
</table>

</form>
</div>
</body>
</html>