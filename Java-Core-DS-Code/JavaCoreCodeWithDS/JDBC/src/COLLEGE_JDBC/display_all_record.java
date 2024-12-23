package COLLEGE_JDBC;
import java.sql.*;
public class display_all_record {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/college";
		String user="root";
		String password="Ritiksharma620@";
		try {
			// step 2 load the driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 3 create the connection object 
			Connection con=DriverManager.getConnection(url,user,password);
			
			//step 4 create the statement object
			Statement stmt=con.createStatement();
		//	ResultSet rs=stmt.executeQuery("select * from login");
			ResultSet rs=stmt.executeQuery("select id,name from login");
			while(rs.next())
		//	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
