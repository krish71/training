<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="<s:theme code='css' />" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example 10 Output</title>
</head>
<body>
	<table align="center" width="50%" border="1" cellspacing="5">
		<tr bgcolor="wheat">
			<th>Flight No</th><th>Carrier</th><th>From</th><th>To</th>
		</tr>
		<c:forEach items="${ flights }" var="flight">
		<tr>
			<td>${ flight.flightNo }</td>
			<td>${ flight.carrier }</td>
			<td>${ flight.from }</td>
			<td>${ flight.to }</td>			
		</tr>
		</c:forEach>
	</table>
</body>
<img src="<s:theme code='img' />" width="100" height="100"/>
</html>


