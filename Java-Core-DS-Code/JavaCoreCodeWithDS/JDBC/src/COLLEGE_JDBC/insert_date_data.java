package COLLEGE_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class insert_date_data {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/full_stack_developer";
        String username = "root";
        String password = "Ritiksharma620@";
        
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            
            // Insert data
            String insertQuery = "INSERT INTO simple_date (name, date) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            
            preparedStatement.setString(1, "John Doe");
            
            // Creating a date for birthdate
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date birthdate = dateFormat.parse("1990-08-15");
            preparedStatement.setDate(2, new java.sql.Date(birthdate.getTime()));
            
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted.");
            
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

