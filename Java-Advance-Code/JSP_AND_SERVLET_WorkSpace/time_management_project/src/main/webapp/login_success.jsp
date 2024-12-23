<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="time.table.entities.User" %>    
    
    
      <%
          User user=(User)session.getAttribute("currentUser");
       if(user==null)
       {
    	   response.sendRedirect("login.jsp");
    	   
       }
      
      
      
            
            %>
            
            
            
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> user name</p><%= user.getName() %>
<p> user id</p><%= user.getId() %>
 <!--   <p> user type</p><%= user.getType() %>   it cant work -->

            
</body>
</html>