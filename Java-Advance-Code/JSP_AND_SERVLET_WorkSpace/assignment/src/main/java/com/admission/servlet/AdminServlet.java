package com.admission.servlet;

import com.admission.dao.UserDAO;
import com.admission.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Example: Show all users
        String action = request.getParameter("action");

        if ("viewAll".equals(action)) {
            // Get the list of users from the database
            UserDAO userDAO = new UserDAO();
            List<User> users = userDAO.getAllUsers();

            // Set the users as a request attribute and forward to a JSP to display them
            request.setAttribute("users", users);
            request.getRequestDispatcher("/adminDashboard.jsp").forward(request, response);
        } else if ("logout".equals(action)) {
            // Handle admin logout
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("login.jsp");
        } else {
            // Default action (perhaps login or admin home)
            response.sendRedirect("adminLogin.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("delete".equals(action)) {
            // Handle deletion of a user record
            int userId = Integer.parseInt(request.getParameter("userId"));
            UserDAO userDAO = new UserDAO();
            boolean deleted = userDAO.deleteUser(userId);

            if (deleted) {
                // Redirect to the admin dashboard with a success message
                request.setAttribute("message", "User deleted successfully.");
            } else {
                // Redirect to the admin dashboard with an error message
                request.setAttribute("message", "Failed to delete user.");
            }
            request.getRequestDispatcher("/adminDashboard.jsp").forward(request, response);
        }
    }
}
