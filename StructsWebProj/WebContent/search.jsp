	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search page</title>
</head>
<body>

<h2 align="center">City Search</h2>
<s:form action="cityAction">
<s:textfield label="CityID" name="cityId"></s:textfield>
<s:submit value="SEARCH"></s:submit>
</s:form>

</body>
</html>