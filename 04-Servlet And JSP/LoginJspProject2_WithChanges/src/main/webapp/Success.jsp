<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String name = (String)request.getAttribute("data"); %>
<h1>Welcome...</h1>
<% out.println(name); %>

<% out.println("Today is ="+Calendar.getInstance().getTime()); %>

<% response.sendRedirect("https://www.google.com"); %>

</body>
</html>