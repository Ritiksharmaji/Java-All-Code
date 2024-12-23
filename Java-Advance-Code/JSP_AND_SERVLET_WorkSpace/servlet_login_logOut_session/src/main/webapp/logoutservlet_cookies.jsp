<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>this is logout page!!</h1>
    <% 
    request.getRequestDispatcher("linke_cookies.html").include(request, response);  
    
    Cookie ck=new Cookie("name","");  
    ck.setMaxAge(0);  
    response.addCookie(ck);  
       

      
      
      %>
      <h1>you have logout successfully</h1>
</body>
</html>