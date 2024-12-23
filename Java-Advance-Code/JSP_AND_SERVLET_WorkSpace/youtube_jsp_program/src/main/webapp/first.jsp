<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
background:#e2e2e2;

}




</style>
</head>
<body>
<h1>this is jsp program</h1>

<!-- this is for jsp declaration  -->

<%! 
int a=50;
int b=10;

String name="Ritik";
public int dosum()
{
	return a+b;
}
public String reverse()
{
	StringBuffer bf=new StringBuffer(name);
	return bf.reverse().toString();
}

%>

<!-- using the scriptlet tag for printing the element on web -->

<% 
out.println(a);
		out.println("<br>");
		out.println("value of b:"+b);
		out.println("<br>");
		out.println("sum of both :"+dosum());
		out.println("<br>");

%>

<!-- by using expression tag for displaing the element on web -->
<%=b%>
<h1>value of addiiton of both by using the expression tag:<%=dosum() %></h1>
</body>
</html>