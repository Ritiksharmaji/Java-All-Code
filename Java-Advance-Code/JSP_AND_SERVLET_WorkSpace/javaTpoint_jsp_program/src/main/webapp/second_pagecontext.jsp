<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%    String s=(String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);
       out.println("hello"+s);
       
       String c=(String)pageContext.getAttribute("college",PageContext.SESSION_SCOPE);
       out.print(c);
        %>
</body>
</html>