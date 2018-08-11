<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change password</title>
</head>
<body style="background-color: #85C1E9;">
	<jsp:include page="Banner.jsp" />
	<form action="UserController.nk">
	
		<label>Enter User Id</label><br> 
		<input type="userid" name="userid" style="background-color: #EBF5FB; color: black;"><br>
		
		<label>Enter new password</label><br> 
		<input type="password" name="password" style="background-color: #EBF5FB; color: black;"><br><br> 
		
		<br> <input type="submit" value="Set Password">
	</form>
	<%@ include file="Footer.html"%>
</body>
</html>