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
<form action="UserController.nk">
		<label for="email" name="email">Email Id:</label><br><br> 
		<input type="text" name="email" style="background-color:#EBF5FB; color:black;"><br>
		<br> <label for="movie" name="pass">Please enter your favourite movie:</label><br><br> 
		<input type="password" name="movie" style="background-color:#EBF5FB; color:black;"><br><br> 
		<input type="submit" name="submit" value="Submit"><br><br>
	</form>
	<%@ include file="Footer.html" %>
</body>
</html>