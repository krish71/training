<%@page import="lti.hola.bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Hola - Community of Experts</h1>
<% RegisterBean user = (RegisterBean) session.getAttribute("User");
   if(user != null){ %>
   <h4>Hello 
   <%= user.getName() %> |  <a href="UserController.nk?logout=yes">Log out</a></h4>
   <%} else { %> <h4>Hello Visitor</h4>
   <% } %>
   
<hr size="3" color="midnightblue">
</body>
</html>