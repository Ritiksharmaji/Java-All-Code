<%@page import="java.sql.DriverManager"%>
<%@page language="java" session="true" isThreadSafe="true" contentType="text/html"
pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="style.css">
 <title>Car Details</title>
 </head>
 <body>
 <table border="1">
 <thead>
 <tr>
<th>Honda Cars India</th>
 </tr>
 </thead>
 <tbody>
 <tr>
 <td>
 <%
 try 
 {
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Ritiksharma620@");  
 Statement stmt = con.createStatement();
 String name=request.getParameter("car_id");
 String s = "select * from honda_showroom";
 ResultSet r = stmt.executeQuery(s);
 if (r.next()) {
 out.println("Model Name:" + r.getString("cname"));
 out.println("</td></tr>");
 out.println("<tr><td>");
 out.println("Cost:" + r.getString("cost"));
 out.println("</td></tr>");
 out.println("<tr><td>");
 out.println("Milage:"+r.getString("milage"));
 out.println("</td></tr>");
 out.println("<tr><td>");
 out.println("Color:"+r.getString("color"));
 }
 con.close();
 } catch (Exception ex) {
 out.println(ex);
 }
 %>
 </tbody>
 </table>
 </body>
</html>
