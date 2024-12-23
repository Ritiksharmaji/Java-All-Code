package prepareStatement;
import java.sql.*;
public class prepared_statement_simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/college";
			String user="root";
			String password="Ritiksharma620@";
			String sql_query="insert into state values(?,?,?,?)";
			
		//	Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection(url,user,password);  
			
		PreparedStatement stmt=con.prepareStatement(sql_query);  
		stmt.setInt(1,500);//1 specifies the first parameter in the query  
		stmt.setString(2,"bihar"); 
		stmt.setString(3,"Ritik"); 
		stmt.setInt(4,4003); 
		  
		  
		System.out.println(" records inserted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  

	}

}
