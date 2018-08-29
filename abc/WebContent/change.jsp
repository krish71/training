<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
</head>
<body background="C:/Users/AE206_PC12/Desktop/intelligent-communities.png" text=black>
<jsp:include page="banner.jsp" />


	<h2>Forget Password</h2>
	<form action="change.do" >
		<span>New Password:</span> <span>
		<input type="password" placeholder="8 to 20 characters minimum" name="password"> <br> <br> <span>
			Enter Email ::</span> <span>
			<input type="email"  name="email"> <br> <br>
			<input
			type="submit" value="submit" name="submit"> </span>
			<span><a href="login.jsp"><button>Login again</button></a>
	</form>

</body>
</html>