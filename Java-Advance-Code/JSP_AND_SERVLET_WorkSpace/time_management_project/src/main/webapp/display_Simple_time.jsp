<%@ page import="java.sql.*, java.util.*" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Display Time Data</title>
</head>
<body>
    <h1>Time Data</h1>
    <table border="1">
        <tr>
            <th> Name</th>
            <th> Time</th>
        </tr>
        <%
            String jdbcUrl = "jdbc:mysql://localhost:3306/project_time_table";
            String dbUsername = "root";
            String dbPassword = "Ritiksharma620@";
            Connection conn = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                String selectSQL = "SELECT faculty_ID, subject_ID,course_ID,course_name,year,section,start_time,end_time FROM admin_faculty_allocate";
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(selectSQL);

                while (resultSet.next()) {
                    int eventName = resultSet.getInt("faculty_ID");
                    Time start_time = resultSet.getTime("start_time");
                    Time end_time = resultSet.getTime("end_time");
                    String course_name = resultSet.getString("course_name");
                    String subject_id = resultSet.getString("subject_ID");
                    String course_id = resultSet.getString("course_ID");
                    String section = resultSet.getString("section");
                    String year = resultSet.getString("year");
        %>
                    <tr>
                        <td><%= eventName %></td>
                        <td><%= course_name %></td>
                        
                        <td><%= subject_id %></td>
                        
                        <td><%= course_id %></td>
                        <td><%= section %></td>
                        <td><%= year %></td>
                    </tr>
        <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        %>
    </table>
</body>
</html>
