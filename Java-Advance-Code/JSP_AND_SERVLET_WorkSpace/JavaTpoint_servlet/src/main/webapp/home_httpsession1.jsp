<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


   <%
    //  String name=(String)request.getAttribute("key");
     String name=(String)session.getAttribute("key");


    %>
<h1>welcome: <%=name %></h1>
<h1>this is home page</h1>

<a href="aboutUs_httpsession1.jsp">about</a><br>
<a href="httpsession1_jsp.jsp">profile</a><br>

</body>
</html>