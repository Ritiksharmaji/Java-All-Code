<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>

body{
background:red;	
}


</style>
</head>
<body>
<h1>this is page 2</h1>

<%

//redirection

response.sendRedirect("page3_derictory.jsp");

%>
</body>
</html>