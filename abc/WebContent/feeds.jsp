<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:/Users/AE206_PC12/Desktop/intelligent-communities.png">
<jsp:include page="/banner.jsp"/>
<table border="1" border-color="crimson">
		<tr bgcolor="wheat">
			<th>Feed Id</th><th>Feed Time</th><th>Query</th><th>Comments</th>
		</tr>
		<c:forEach items="${Feeds}" var="Feeds">
		<tr>
			<td>${Feeds.feedId}</td>
			<td>${Feeds.feedTime}</td>
			<td><a href="question.do?id=${Feeds.feedId}">${Feeds.query}</td>
			<td>${Feeds.totalCmnts}</td>
				
		</tr>
		</c:forEach>
		</table>
</body>
</html>