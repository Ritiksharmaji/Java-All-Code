package First;
import java.sql.*;
import java.sql.*;
import java.security.*;
import java.util.Scanner;
public class Siwan {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree","root","Ritiksharma620@");
				Statement stmt=con.createStatement();
				System.out.println("insert record");
				String sql="insert into fruit value(43)";
				stmt.executeUpdate(sql);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		}


}
