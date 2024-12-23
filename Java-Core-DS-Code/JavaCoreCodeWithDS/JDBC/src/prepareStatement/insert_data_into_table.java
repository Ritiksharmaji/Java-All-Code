package prepareStatement;
import java.sql.*;
import java.util.Scanner;
public class insert_data_into_table {
	public static void main(String args[]){  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name with space");
		String s=sc.next();
		try{  
			String url="jdbc:mysql://localhost:3306/college";
			String user="root";
			String password="Ritiksharma620@";
			//String sql_query="insert into employee values(?,?,?)";
			
	//	Class.forName("com.mysql.cj.jdbc.driver");  
		  
		Connection con=DriverManager.getConnection(url,user,password);  
		  
		PreparedStatement stmt=con.prepareStatement("insert into registration values(?,?,?,?)");  
		stmt.setInt(1,10201);//1 specifies the first parameter in the query  
		stmt.setString(2,s); 
		stmt.setString(3, "ji");
		stmt.setInt(4,19);
		
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
	}

}
