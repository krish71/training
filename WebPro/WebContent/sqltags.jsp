<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<body>
	<%--  --%>

	<sql:query var="rs" dataSource="jdbc/myoracle">
select * from product
</sql:query>

	<table border="2">
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="item" items="${rs.rows }">
			<tr>
				<td>${item.code}</td>
				<td>${item.name}</td>
				<td>${item.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>