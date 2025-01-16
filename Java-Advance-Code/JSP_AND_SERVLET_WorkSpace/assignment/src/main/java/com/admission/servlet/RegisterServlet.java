package com.admission.servlet;

import com.admission.dao.UserDAO;
import com.admission.model.User;
import com.admission.util.PasswordUtil;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String dob = request.getParameter("dob");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String course = request.getParameter("course");
        String photo = request.getParameter("photo");  // Assume file is handled
        String signature = request.getParameter("signature"); // Assume file is handled
        String password = PasswordUtil.hashPassword(request.getParameter("password"));
        
        User user = new User(name, dob, email, mobile, address, course, photo, signature, password);
        
        try {
            UserDAO userDAO = new UserDAO();
            int result = userDAO.registerUser(user);
            if (result > 0) {
                response.sendRedirect("login.jsp");
            } else {
                response.sendRedirect("register.jsp?error=true");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
