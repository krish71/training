<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<c:url value= "/css/bootstrap.min.css"/>">
<script src="<c:url value="/js/jquery.2.2.4.min.js"/>"></script>
<title>Login Page</title>
</head>
<body background="C:/Users/AE206_PC12/Desktop/intelligent-communities.png" text=black>
<jsp:include page="/banner.jsp" />
	<h2>Login Page</h2>
	<%-- <% if(request.getParameter("invalid")!= null) { %>
	<font size="3" color = "red">Invalid Email ID / Password</font>
	<% } %> --%>
	<form action="login.do" >
	<font color="red">${Prompt}</font>
		<b>User id</B></br><input  name="userId"
			placeholder="enter user id"></span> <br> <br> <B>
			
			
			Password :</B> <br> <input type="password" name="password" "
			placeholder="8 characters minimum"> <br> <br>
			<span><input
			type="submit" value="Submit" > </span>
			
			<br><br>
			<input type="button" value="New User?" onclick="window.location.href='registerpage.jsp'">&nbsp &nbsp &nbsp
			<input type="button" value="Forget password" onclick="window.location.href='forget.jsp'">
<!-- 			<a href="registerpage.jsp">New User?&nbsp &nbsp &nbsp </a> -->
<!-- 			<a href="forget.jsp">forgot password</a> -->
			
			</form>


	
</body>
</html>