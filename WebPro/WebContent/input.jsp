<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product input page</h1>
	<hr>
	<form action="process.jsp">
		Code: &nbsp<input name="code"><br><br> 
		Name: <input name="name"><br><br>
		Price:&nbsp <input name="price"><br><br>
		<input type="submit" value="Process">
	</form>
</body>
</html>