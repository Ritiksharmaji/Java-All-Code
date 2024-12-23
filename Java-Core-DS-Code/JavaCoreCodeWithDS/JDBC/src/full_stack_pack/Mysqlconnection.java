package full_stack_pack;
import java.sql.*;
public class Mysqlconnection
{
	 public static void main(String args[])
	 {
		 try
		 {
			 System.out.println("hello");
			 
			// Class.forName("com.mysql.cj.jdbc.Driver");// installing driver
			 
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/full_stack_developer","root","Ritiksharma620@");
			//here sonoo is database name, root is username and password 
			 Statement stmt=con.createStatement();
			 
			 ResultSet rs=stmt.executeQuery("select * from application");
			 //where address ='qqq' and dept = 'FInance' 
			  while(rs.next())
			  {
				  System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+  rs.getString(4));
			  }
			 
		 }catch(Exception e)
		 {
			 System.out.println("Exception"+ e); 
		 }
	 }
}