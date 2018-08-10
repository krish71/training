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
		<label for="name" name="Name">Name</label><br> 
		<input type="text" name="name" style="background-color:#EBF5FB; color:black;"><br><br>
		
		<label for="email" name="email">Email Id</label><br> 
		<input type="text" name="email" style="background-color:#EBF5FB; color:black;"><br><br>
		 
		<label for="password" name="pass">Password</label><br> 
		<input type="password" name="password" style="background-color:#EBF5FB; color:black;"><br><br>
		
		 <label for="age" name="age">Age</label><br> 
		<input type="number" name="age" style="background-color:#EBF5FB; color:black;"><br><br>
		
		
		 <label for="gender" name="gender">Gender</label><br>
		 
		 <input type="radio" name="gender" id="male" value="male">
		 <label for="male">Male</label><br>
		 
 		 
 		 <input type="radio" name="gender" id="female" value="female">
 		 <label for="female">Female</label><br>
 		 
 		 <input type="radio" name="gender" id="other" value="other">
		 <label for="male">Other</label><br><br>
 		
 		<label for="city" name="city">City</label><br> 
		<input type="text" name="city" style="background-color:#EBF5FB; color:black;"><br><br>
		
		
		<label for="movie" name="movie">Set answer to this security question:-</label><br>
		<label for="movie" name="movie">Enter your favorite movie</label><br>
		<input type="password" name="movie" style="background-color:#EBF5FB; color:black;"><br><br>
		 
		 
		<label for="profilePhoto" name="profilePhoto">Select profile photo</label><br> 
		<input type="file" name="profilePhoto" style="background-color:#EBF5FB; color:black;">
		<br><br>
		 		 
		<input type="submit" name="submit" value="Submit"><br><br>
	</form>
	<%@ include file="Footer.html" %>
</body>
</html>