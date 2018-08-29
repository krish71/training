<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:/Users/AE206_PC12/Desktop/intelligent-communities.png">
	<jsp:include page="banner.jsp" />
	<h1>Share Your Response</h1>&nbsp &nbsp &nbsp <a href="home.jsp">You need to login</a>
	
	<table border="1" bordercolor="crimson">
			<tr>
				<th colspan="2">${Question.query}</th>
			</tr>
			<tr>
	<c:if test="${User != null}">
	<form action="comment.do">
	<td colspan="2"><textarea name="response" rows="5" cols="30"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Respond"></td>
			</tr>
			</form>	
	</c:if>
	<c:forEach items="${Question.comments}" var="cmnt">
				<tr><td>${cmnt.user.userId}</td>
					<td>${cmnt.response}</td>
			</c:forEach>

		</table>


</body>
</html>