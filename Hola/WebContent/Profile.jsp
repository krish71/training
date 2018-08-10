<%@page import="lti.hola.bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="Banner.jsp" />
	<label>Login successful.</label>
	<br>
	<br>
	<% RegisterBean user = (RegisterBean)session.getAttribute("User"); %>
	<table align="left">
		<tr><th colspan="2">User Profile details</th></tr>
		<tr><td>Name</td><td><%= user.getName() %></td></tr>
		<tr><td>Email</td><td><%= user.getEmail() %></td></tr>
		<tr><td>Age</td><td><%= user.getAge() %></td></tr>
		<tr><td>Gender</td><td><%= user.getGender() %></td></tr>
		<tr><td>City</td><td><%= user.getCity() %></td></tr>	
		<tr><td colspan="2"> <img src="<%= user.getProfilePhoto() %>" height="200" width="200"> </td></tr>
 	</table>
	<hr>
	
	<%@ include file="Footer.html"%>
</body>
</html>