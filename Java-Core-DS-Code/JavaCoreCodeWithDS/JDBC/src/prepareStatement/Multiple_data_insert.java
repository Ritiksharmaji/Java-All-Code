package prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
public class Multiple_data_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		try {
		String url="jdbc:mysql://localhost:3306/prepost";
		String user="root";
		String password="Ritiksharma620@";
		Scanner sc=new Scanner(System.in);
		
		String sql_query="insert into employee values(?,?,?)";
		//
		Connection con=DriverManager.getConnection(url,user,password); 
		//
		PreparedStatement stmt=con.prepareStatement(sql_query);
		//PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?)");
		
	
		while(true)
		{
			System.out.println("enter id of employee");
			int id=sc.nextInt() ;

			System.out.println("enter name of employee");
			String name=sc.next() ;

			System.out.println("enter salary of employee");
			double salary=sc.nextInt() ;

			stmt.setInt(1,id);
			stmt.setString(2,name);
			stmt.setDouble(3,salary);
			count=stmt.executeUpdate();
			
			System.out.println("record inserted");
			
			System.out.println("do u want to insert more data[yes/no]");
			String option=sc.next();
			if(option.equalsIgnoreCase("no"))
			{
				break;
			}
			
			
		}
		//int i=stmt.executeUpdate();  
		System.out.println(count+" records inserted");  
		  con.close();
			
		
		
		}catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
