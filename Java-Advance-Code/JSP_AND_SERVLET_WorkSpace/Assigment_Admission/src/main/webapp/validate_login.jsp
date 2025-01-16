<%@ page import="java.sql.*, java.security.*" %>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    // Hash the input password
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(password.getBytes());
    String hashedPassword = new String(md.digest());

    // Check credentials
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admissions_db", "root", "password")) {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM admissions WHERE email = ? AND password = ?");
        ps.setString(1, email);
        ps.setString(2, hashedPassword);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            session.setAttribute("user", rs.getString("name"));
            response.sendRedirect("dashboard.jsp");
        } else {
            out.println("Invalid login credentials.");
        }
    }
%>
