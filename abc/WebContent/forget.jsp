<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password</title>
</head>
<body background="C:/Users/AE206_PC12/Desktop/intelligent-communities.png" text=black>
	<jsp:include page="banner.jsp" />

	<h2>Forget Password</h2>
	<%-- <% if(request.getParameter("invalid")!= null) { %>
	<font size="3" color = "red">Invalid Email ID / Movie</font>
	<% } %> --%>
	<form action="forget.do">
		<span>EmailId :</span> <span>
		<input type="email" name="email" placeholder="someone@xyz.in"></span> <br> <br> <B>
			UserId : 
			<input type="password" placeholder="1 character minimum" name="userId"> <br> <br> <span> 
			<input type="submit" value="submit">
		</span>
	</form>

</body>
</html>