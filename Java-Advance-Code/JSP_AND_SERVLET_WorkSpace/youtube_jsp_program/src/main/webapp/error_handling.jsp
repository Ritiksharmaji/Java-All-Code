<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page errorPage="error_page.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>this is for error handling</h2>
<%!
 int a=20;
		int b=0;
 %>
 <%int divistion=a/b; %>
 
  <h2>Divistion=<%=divistion %></h2>
</body>
</html>