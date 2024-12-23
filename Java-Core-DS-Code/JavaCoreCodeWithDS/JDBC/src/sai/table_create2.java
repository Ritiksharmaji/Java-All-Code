package sai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class table_create2 {
	static final String url="jdbc:mysql://localhost:3306/college";
	static final String username="root";
	static final String password="Ritiksharma620@";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			String table="create table Moon"+
			"(id int ,"+"name varchar(30))";
			st.executeUpdate(table);
			System.out.println("table is created");
			
			
		}
			catch(Exception e)
		{
				System.out.println(e);
		}

		}

	}


