package COLLEGE_JDBC;
// step 1 importing package.
import java.sql.*;
public class CLASS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/college";
		String user="root";
		String password="Ritiksharma620@";
		try {
			// step 2 load the driver class
		//	Class.forName("com.mysql.jdbc.Driver");
			//step 3 create the connection object 
			Connection con=DriverManager.getConnection(url,user,password);
			
			//step 4 create the statement object
			Statement stmt=con.createStatement();
			
			//step 5 execute query
			
		//	stmt.executeUpdate("insert INTO login values(300,'ushri','ushri@123')");  
		//	stmt.executeUpdate("insert INTO login values(320,'rohit','siwan@123')");
		//	System.out.println("record inserted into table");
			// step 6
			
			
			ResultSet rs=stmt.executeQuery("select * from login");  //  where address ='qqq' and dept = 'FInance' 
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            //con.close();  
}catch(Exception e)
        { System.out.println("Exception"+ e.getLocalizedMessage());}  
}  
}  	
			
			
			
			
