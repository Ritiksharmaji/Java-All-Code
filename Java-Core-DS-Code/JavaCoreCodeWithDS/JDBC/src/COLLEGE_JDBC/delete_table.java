package COLLEGE_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete_table {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/college";
		String user="root";
		String password="Ritiksharma620@";
		String sql_query="delete from bca"; 
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		 
		stmt.executeUpdate(sql_query);
		System.out.println("table deleted");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}


}
