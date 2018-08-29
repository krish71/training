<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
<link href="css/default.css" rel="stylesheet" />
</head>
<body>
<p class="intro">
	With the help of this lab, we will try covering the core concepts
	of Spring MVC. Each example with cover a particular feature of Spring
	MVC in a step by step manner. At the end we will see how Spring MVC
	provides full support for developing RESTful applications.
</p>

<h2>Example 1</h2>
In this example we will see the old style of writing Controller in Spring MVC.	
<a href="example1.do">Click here</a> to run the example.

<h2>Example 2</h2>
In this example we will see how to use annotations for mapping a Controller.
<a href="example2.do">Click here</a> to run the example.

<h2>Example 3</h2>
Spring MVC promotes Test driven development whereby stressing more on
the POJO approach. This time the Controller is a simple POJO class.
<a href="example3.do">Click here</a> to run the example.

<h2>Example 4</h2>
In this example we will see how the controller itself can generate the response.
This can be helpful in RESTful use cases.
<a href="controller/example4">Click here</a> to run the example.

<h2>Example 5</h2>
In this example we will see how to read request parameters easily.
<a href="example5.jsp">Click here</a> to run the example.

<h2>Example 6</h2>
In this example we will see how to dynamically populate a bean when
a form is submitted. Also we will discuss how we can group multiple CRUD
operations together in a single Controller class.
<a href="example6.jsp">Click here</a> to run the example.

<h2>Example 7</h2>
In this example, we will see what's the importance of View Resolvers
by demonstrating how to generate HTML or PDF as a response conditionally.
A similar logic is used when developing RESTful Services. Click any of the links
to run the example.<br/>
<a href="controller/example7?view=html">HTML</a> OR <a href="controller/example7?view=pdf">PDF</a>

<h2>Example 8</h2>
In this example we will see how we can add support for validation in Spring MVC.
<a href="controller/example8/add">Click here</a> to run the example.

<h2>Example 9</h2>
In this example we will see support for I18N from Spring MVC. Click on any of the links
to run the example.<br/>
<a href="controller/example9?lang=en">English</a> OR <a href="controller/example9?lang=hi">Hindi</a>

<h2>Example 10</h2>
In this example we will see support for Themes from Spring MVC. Click on any of the links
to run the example.<br/>
<a href="controller/example10?theme=default">Theme 1</a> | <a href="controller/example10?theme=green">Delete</a>




<h2>Example 11</h2>
In this example we will see how we can serve JSON/XML as response which can serve
RESTful clients. Also we will discuss about content negotiation feature of Spring
MVC.
<a href="controller/rest/flights">Click here</a> to run the example.
</body>
</html>