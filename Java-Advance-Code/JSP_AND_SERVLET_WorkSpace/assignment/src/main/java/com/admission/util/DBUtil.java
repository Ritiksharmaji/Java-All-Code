package com.admission.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // Database connection details (You can change these as needed)
    private static final String URL = "jdbc:mysql://localhost:3306/admission_db";
    private static final String USER = "root";  // Replace with your MySQL username
    private static final String PASSWORD = "Ritiksharma620@";  // Replace with your MySQL password

    // Method to establish a database connection
    public static Connection getConnection() throws SQLException {
        try {
            // Register the JDBC driver (for MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Return the connection to the MySQL database
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("JDBC Driver not found.", e);
        }
    }
}
