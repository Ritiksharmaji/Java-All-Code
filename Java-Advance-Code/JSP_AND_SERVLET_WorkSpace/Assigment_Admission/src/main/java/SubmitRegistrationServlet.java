import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.security.MessageDigest;
import java.sql.*;
import java.util.*;

@WebServlet("/submit_registration")
public class SubmitRegistrationServlet extends HttpServlet {

    // Define upload directory
    private static final String UPLOAD_DIRECTORY = "uploads";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Initialize file upload handler
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        // Create a map to hold form fields
        Map<String, String> formFields = new HashMap<>();
        
        // Handle file upload and form fields
        try {
            List<FileItem> formItems = upload.parseRequest(request);
            
            // Process the form fields and uploaded files
            for (FileItem item : formItems) {
                if (!item.isFormField()) {
                    // Handle file upload (Photo and Signature)
                    String fileName = new File(item.getName()).getName();
                    String filePath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY + File.separator + fileName;
                    File storeFile = new File(filePath);
                    item.write(storeFile);
                    
                    // Save file paths in form fields map (photo and signature)
                    if (item.getFieldName().equals("photo")) {
                        formFields.put("photo", filePath);
                    } else if (item.getFieldName().equals("signature")) {
                        formFields.put("signature", filePath);
                    }
                } else {
                    // Handle form fields (e.g., name, dob, email)
                    formFields.put(item.getFieldName(), item.getString());
                }
            }

            // Retrieve form data
            String name = formFields.get("name");
            String dob = formFields.get("dob");
            String email = formFields.get("email");
            String mobile = formFields.get("mobile");
            String address = formFields.get("address");
            String course = formFields.get("course");
            String password = formFields.get("password");

            // Hash the password (SHA-256)
            String hashedPassword = hashPassword(password);

            // Database insertion
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admissions_db", "root", "password")) {
                String sql = "INSERT INTO admissions (name, dob, email, mobile, address, course, photo, signature, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement ps = con.prepareStatement(sql)) {
                    ps.setString(1, name);
                    ps.setString(2, dob);
                    ps.setString(3, email);
                    ps.setString(4, mobile);
                    ps.setString(5, address);
                    ps.setString(6, course);
                    ps.setString(7, formFields.get("photo"));
                    ps.setString(8, formFields.get("signature"));
                    ps.setString(9, hashedPassword);
                    ps.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.getWriter().write("Error occurred during database insertion.");
                return;
            }

            // Redirect to success page
            response.sendRedirect("success.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Error occurred during file upload.");
        }
    }

    // Helper method to hash the password using SHA-256
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder hashedPassword = new StringBuilder();
            for (byte b : hashedBytes) {
                hashedPassword.append(String.format("%02x", b));
            }
            return hashedPassword.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
