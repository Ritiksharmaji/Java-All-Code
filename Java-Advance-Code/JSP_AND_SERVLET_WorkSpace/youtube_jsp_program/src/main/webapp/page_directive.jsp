<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Random, java.io.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp page by using the page directive</title>
</head>
<body>


<h1>Random number:</h1>
<%
Random r=new Random();
int n=r.nextInt(10);

%>

<%=n %>

<!-- this is for include directive page syntax -->

<%@include file="include_jsp_file.jsp" %>


</body>
</html>