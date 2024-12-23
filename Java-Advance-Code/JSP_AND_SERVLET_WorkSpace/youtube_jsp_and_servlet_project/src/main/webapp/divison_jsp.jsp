<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="Error_handling_jsp.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>divistion of two numbers</title>
</head>
<body>


<% 
     //fetch  two numbers
    String n1= request.getParameter("first_number");
    String n2=request.getParameter("second_number");

// conversting string to integer

int a=Integer.parseInt(n1);
int b=Integer.parseInt(n2);
int c;
c=a/b;
%>

  
<h2 result=><%=c %></h2>
</body>
</html>