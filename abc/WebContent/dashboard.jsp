<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Window</title>
</head>

<body background="C:/Users/AE206_PC12/Desktop/intelligent-communities.png" text=black>
<jsp:include page="banner.jsp" />
<h1>My Dashboard</h1><hr size="3" color="crimson">

User Id: ${User.userId}<br>
Email Id: ${User.email}<br>
Feed:${User.totalFeeds}<br>
<a href="query.jsp">Ask Question</a>
<% User user= (User) session.getAttribute("User"); %>


</body>
</html>