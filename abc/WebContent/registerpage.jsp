<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body text=black>
	<jsp:include page="banner.jsp" />

	<form action="register.do">
		<table width="400" allign="center">
			<tr>
				<th colspan="2">Registration Form</th>
			</tr>
			<tr>
				<label for="panId" name="panId">PAN NO :</label>

				<input type="text" name="panId"
					pattern="([A-Z]{5})([0-9]{4})([A-Z]{1})" minlength="10"
					maxlength="10" placeholder="ABCDE1234F"
					style="background-color: #EBF5FB; color: black;">
			</tr>
			<tr>
				<td><b>EmailId :</B><br></td>
			</tr>
			<tr>
				<td><input type="email" name="email"
					placeholder="someone@xyz.in" pattern="[A-Za-z0-9@.]{10,40}"><br>
					<br></td>
			</tr>


			<tr>
				<td><b>Password :</B> <br></td>
			</tr>
			<tr>
				<td><input type="password" name="password"
					placeholder="8 to 20 characters minimum"><br> <br></td>
			</tr>
			<tr>
				<label for="security" name="security">SET ANSWER TO THIS
					SECURITY QUESTION</label>
				<br>
				<label for="security" name="security">ENTER YOUR MOTHER'S
					MIDDLE NAME :</label>
				<br>
				<input type="password" name="security"
					style="background-color: #EBF5FB; color: black;">
			</tr>
			<span>
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></span>
			</tr>
		</table>
	</form>

</body>
</html>