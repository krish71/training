<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#85C1E9;">
<jsp:include page="Banner.jsp" />
<% if(request.getParameter("invalid") != null) {%>
<font size="3" color="red">Invalid Email ID or Password </font> 

<% }%>

	<form action="UserController.nk">
		<label for="userid" name="userid">User Id:</label>
		<input type="text" name="userid" style="background-color:#EBF5FB; color:black;"><br><br> 
		
		<label for="password" name="password">Password:</label> 
		<input type="password" name="password" style="background-color:#EBF5FB; color:black;"><br><br>
		
		 <input type="submit" name="submit" value="Login"><br><br> 
		<a href="Forgot.jsp">Forget Password</a>&nbsp&nbsp&nbsp <a href="Register.jsp">Register here</a>
	</form>
	<%@ include file="Footer.html" %>
</body>
</html>