<%@ page import="java.sql.*, java.io.*, java.security.*, javax.servlet.http.Part" %>
<%
    // Retrieve form parameters
    String name = request.getParameter("name");
    String dob = request.getParameter("dob");
    String email = request.getParameter("email");
    String mobile = request.getParameter("mobile");
    String address = request.getParameter("address");
    String course = request.getParameter("course");
    String password = request.getParameter("password");

    // For file uploads
  //  Part photoPart = request.getPart("photo");
  //  Part signaturePart = request.getPart("signature");

    // Directory to store uploaded files
    String uploadPath = application.getRealPath("/") + "uploads/";

    // Create the directory if it doesn't exist
    File uploadDir = new File(uploadPath);
    if (!uploadDir.exists()) {
        uploadDir.mkdir();
    }

    // Save the uploaded files
  //  String photoPath = uploadPath + photoPart.getSubmittedFileName();
  //  String signaturePath = uploadPath + signaturePart.getSubmittedFileName();

    // Write files to the server
   // photoPart.write(photoPath);
   // signaturePart.write(signaturePath);

    // Debugging outputs
    out.println("<p>Name: " + name + "</p>");
    out.println("<p>Date of Birth: " + dob + "</p>");
    out.println("<p>Email: " + email + "</p>");
    out.println("<p>Mobile: " + mobile + "</p>");
    out.println("<p>Address: " + address + "</p>");
    out.println("<p>Course: " + course + "</p>");
  //  out.println("<p>Photo Path: " + photoPath + "</p>");
  //  out.println("<p>Signature Path: " + signaturePath + "</p>");

    // Hash the password
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    byte[] hashedBytes = md.digest(password.getBytes());
    StringBuilder hashedPassword = new StringBuilder();
    for (byte b : hashedBytes) {
        hashedPassword.append(String.format("%02x", b));
    }

    // Debugging: Output hashed password
    System.out.println("Hashed Password: " + hashedPassword.toString());

    // Database connection and data insertion
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admissions_db", "root", "Ritiksharma620@")) {
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO admissions (name, dob, email, mobile, address, course, photo, signature, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"
        );
        ps.setString(1, name);
        ps.setString(2, dob);
        ps.setString(3, email);
        ps.setString(4, mobile);
        ps.setString(5, address);
        ps.setString(6, course);
    //    ps.setString(7, photoPath);
     //   ps.setString(8, signaturePath);
        ps.setString(9, hashedPassword.toString());
        ps.executeUpdate();

        response.sendRedirect("success.jsp");
    } catch (Exception e) {
        System.err.println("Database Error: " + e.getMessage()); // Logs to server console
        out.println("<p style='color: red;'>Error: " + e.getMessage() + "</p>"); // Displays on browser
    }
%>
