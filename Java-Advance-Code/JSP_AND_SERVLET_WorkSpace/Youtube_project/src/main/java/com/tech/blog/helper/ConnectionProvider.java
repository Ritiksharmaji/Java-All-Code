package com.tech.blog.helper;
import java.sql.*;

public class ConnectionProvider {
	
	private static Connection con;
	
	public static Connection getConnection()
	{
		try {
			if(con == null)  // to avoid the create the connction again -again
			{
			// loading the driver
			
			// create connection
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog", "root", "Ritiksharma620@");
			}
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		return con;
	}

}
