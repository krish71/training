<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example 8</title>
</head>
<body>
<f:form action="save" method="post" modelAttribute="flight">
Flight No : <f:input path="flightNo"/> <f:errors path="flightNo" /> <br/>
Carrier : <f:input path="carrier"/> <f:errors path="carrier" /> <br/>
From : <f:input path="from"/> <br/>
To : <f:input path="to"/> <br/>
<input type="submit" value="Add" />
</f:form>
</body>
</html>