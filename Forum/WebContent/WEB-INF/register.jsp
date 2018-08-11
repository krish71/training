<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#85C1E9;">
<jsp:include page="Banner.jsp"/>
<form action="UserController.nk">
		<label for="userid" name="userid">Name</label><br> 
		<input type="text" name="userid" style="background-color:#EBF5FB; color:black;"><br><br>
		
		<label for="password" name="pass">Password</label><br> 
		<input type="password" name="password" style="background-color:#EBF5FB; color:black;"><br><br>
		
		<label for="email" name="email">Email Id</label><br> 
		<input type="text" name="email" style="background-color:#EBF5FB; color:black;"><br><br>
		 
		
		
		 		 
		<input type="submit" name="submit" value="Submit"><br><br>
	</form>
	<%@ include file="Footer.html" %>
</body>
</html>