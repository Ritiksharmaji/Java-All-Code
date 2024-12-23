package first_one;
import  java.sql.*;
import  java.sql.Connection;
import  java.sql.DriverManager;


public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Ritiksharma620@");
			Statement stmt=con.createStatement();
			System.out.println("insert record");
			String sql="UPDATE bca SET name='helloji' WHERE student_id='4' ";
			stmt.executeUpdate(sql);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
