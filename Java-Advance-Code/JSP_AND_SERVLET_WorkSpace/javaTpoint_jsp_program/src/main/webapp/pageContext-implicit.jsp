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
     String name=request.getParameter("username");
     out.println("welcome"+name);
     // seting the pagecontext for forword the data
     String n="this is vfstr";
     pageContext.setAttribute("user", name,PageContext.SESSION_SCOPE);
    		 out.println("<br>");
     pageContext.setAttribute("college", n,PageContext.SESSION_SCOPE);	 
     
          %>
          <a href="second_pagecontext.jsp">second</a>
          
</body>
</html>