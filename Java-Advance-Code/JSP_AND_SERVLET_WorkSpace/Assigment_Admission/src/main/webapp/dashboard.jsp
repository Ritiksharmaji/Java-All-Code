<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h1>Welcome, <%= session.getAttribute("user") %></h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Course</th>
            <th>Actions</th>
        </tr>
        <%
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admissions_db", "root", "password");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM admissions");
            while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getString("email") %></td>
            <td><%= rs.getString("course") %></td>
            <td>
                <a href="edit_admission.jsp?id=<%= rs.getInt("id") %>">Edit</a>
                <a href="delete_admission.jsp?id=<%= rs.getInt("id") %>" onclick="return confirm('Are you sure?')">Delete</a>
            </td>
        </tr>
        <% } %>
    </table>
</body>
</html>
