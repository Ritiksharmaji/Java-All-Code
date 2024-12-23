<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="style.css">
 <title>CarShowRoom Inventory</title>
</head>
 <body>
 <h1> Welcome To Honda Showroom! </h1>
 <table border="1">
 <thead>
 <tr>
 <th> Honda car India is a subsidiary of the honda of japan for the
production, marketing and export of passenger car in india</th>
 </tr>
 </thead>
 <tbody>
 <tr>
 <td>To view details of car models, select an option below:</td>
 </tr>
 <tr>
 <td>
 <form action="response.jsp" method="POST">
<strong>select an option:</strong>
 <select name="car_id">
 <option>Honda City</option>
 <option>Honda civic</option>
 </select>
 <input type="submit" value="Submit" />
 </form> </td>
 </tr>
 </tbody>
 </table>
</body>
</html>
