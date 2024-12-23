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
    // String name=(String)request.getAttribute("key");
    String name=(String)session.getAttribute("key");

    %>
<h1>welcome: <%=name %></h1>
<h1>this is profile page</h1>

<a href="home_httpsession1.jsp">Home</a><br>
<a href="aboutUs_httpsession1.jsp">about</a><br>

<!-- to delete the HttpSession object we are creating logout -->
<br><a href="logout_session">logout</a>  <!-- there logout_session is url path of a servlet -->

</body>
</html>