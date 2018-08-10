<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Request cannot be processed</h1>
	<hr>
	<h2>Problem Occurred due to...</h2>
	<font size="4" color="red"> <%=exception.toString()%>
	</font>
	<br>
	<br>
	<br>
	<a href="${header.referer}">Please try again </a>
</body>
</html>