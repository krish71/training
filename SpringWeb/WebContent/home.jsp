<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>

	<form action="login.go">
		<font color="red">${Invalid}</font> 
		<label>Email:&nbsp</label> <input type="text" name="email" value="Email" required><br> <label>Password:&nbsp</label> 
		<input type="password" name="password" value="" required><br> 
			<input type="submit" value="login">
	</form>
</body>
</html>