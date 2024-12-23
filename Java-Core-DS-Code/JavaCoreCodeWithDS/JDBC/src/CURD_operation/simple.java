package CURD_operation;
import java.sql.*;
import java.util.Scanner;
import java.sql.*;

public class simple{

    private static final String jdbcUrl = "jdbc:mysql://localhost:3306/college";
    private static final String username = "root";
    private static final String password = "Ritiksharma620@";

    public static void main(String[] args) {
    	simple jdbcCRUD = new simple();
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("enter a number from 1 to 5");
    	System.out.println("1 for create");
    	System.out.println("2 for insert data");
    	System.out.println("3 for update");
    	System.out.println("4 for select");
    	System.out.println("5 for delete");
    	int a=sc.nextInt();
    	if(a == 1)
    	{
    		jdbcCRUD.createTable();
    	}
    	else if(a == 2)
    	{
    		System.out.println("enter table name");
    		String table=sc.next();
    		System.out.println("enter name:");
    		String name=sc.next();
    		System.out.println("enter emal");
    		String email=sc.next();
    		// call the function
    		jdbcCRUD.insertData(table, name, email);
    	}
    	else if(a == 3)
    	{
    		System.out.println("enter table name");
    		String table=sc.next();
    		System.out.println("this is for update data");
    		System.out.println("enter name for update");
    		String name=sc.next();
    		
    		System.out.println("enter password");
    		String pass=sc.next();
    		jdbcCRUD.updateData(table, name, pass);
    	}
    	else if(a == 4)
    	{
    		
    		System.out.println("this is for select data");
    		System.out.println("enter table name");
    		String table=sc.next();
    		 jdbcCRUD.callFunction(table);
            System.out.println("Function result: " + functionResult);
    		
    	}
    	else if(a == 5)
    	{
    		System.out.println("this is for delete table");
    		System.out.println("enter table name");
    		String table=sc.next();
    		jdbcCRUD.deleteData(table);
    	}
        
        
        
        
    }

    public void createTable() {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) 
        {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                                    "username VARCHAR(50)," +
                                    "email VARCHAR(50))";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createTableSQL);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertData( String table,String username, String email) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) 
        {
            String insertSQL = "INSERT INTO" +table+" (username, email) VALUES (?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, email);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateData(String table,String username, String newEmail) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String updateSQL = "UPDATE"+table+" SET email = ? WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
                preparedStatement.setString(1, newEmail);
                preparedStatement.setString(2, username);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void callFunction(String table) {
        int result = 0;
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String functionSQL = "SELECT username, email from "+table;
            try (PreparedStatement preparedStatement = connection.prepareStatement(functionSQL)) {
               
            	String name=null;
            	String email=null;
           // 	preparedStatement.setString(1, name);
           //     preparedStatement.setString(2, email);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) 
                    {
                    	name=resultSet.getString(1);
                    	email=resultSet.getString(2);
                    	System.out.println("uesr name:"+name+ "email:"+email);
                        result = resultSet.getInt("result");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public void deleteData( String table) {
        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String deleteSQL = "DELETE table " + table; 
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
               // preparedStatement.setString(1, username);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
