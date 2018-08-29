<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Example 6</title>
</head>
<body>
<form action="controller/flights/add" method="post">
Flight No : <input type="text" name="flightNo" /> <br/>
Carrier : <input type="text" name="carrier" /> <br/>
From : <input type="text" name="from" /> <br/>
To : <input type="text" name="to" /> <br/>
<input type="submit" value="Add" />
</form>
</body>
</html>