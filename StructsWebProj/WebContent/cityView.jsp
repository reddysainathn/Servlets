<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2 align="center">Result Set</h2>




<table border =2 align='center'>

<tr><th>Id</th><th>CountryCode</th><th>District</th><th>Name</th><th>Population</th></tr>

<tr>

<td><s:property value="city.id"/></td>
<td><s:property value="city.contryCode"/></td>
<td><s:property value="city.district"/></td>
<td><s:property value="city.name"/></td>
<td><s:property value="city.population"/></td>
</tr>

</table>

</body>
</html>