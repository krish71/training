<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="<s:theme code='css' />" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example 10 Output</title>
</head>
<body>

<f:form action="example8/delete" method="post" modelAttribute="flight">
	<table align="center" width="50%" border="1" cellspacing="5">
		<tr bgcolor="wheat">
			<th>Flight No</th><th>Carrier</th><th>From</th><th>To</th>
		</tr>
		<c:forEach items="${ flights }" var="flight">
		
		<tr>
			<td> <input type="radio" name="flightNo" value="${ flight.flightNo }">${ flight.flightNo } <td> 
			<td>${ flight.flightNo }</td>
			<td>${ flight.carrier }</td>
			<td>${ flight.from }</td>
			<td>${ flight.to }</td>			
		</tr>
		</c:forEach>
	</table>
	
		<input type=submit name=submit value="delete flight">
	
</f:form>
</body>
<img src="<s:theme code='img' />" width="100" height="100"/>
</html>


