package CURD_operation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class curd {
	
   static	String url="jdbc:mysql://localhost:3306/college";
   static  String user="root";
   static   String password="Ritiksharma620@";
   static String table_name=null;
	public static  void createTable(String s) throws SQLException
	{
		Connection cn=DriverManager.getConnection(url,user,password);
	 	Statement sm=cn.createStatement();
		String sql_query1="CREATE TABLE s(id INTEGER NOT NULL, name VARCHAR(30), age INTEGER , PRIMARY KEY ( id ))";
		sm.executeUpdate(sql_query1);
		System.out.println("table has created");
	}
	public  static void insertData(String s) throws SQLException
	
	{
		Connection cn=DriverManager.getConnection(url,user,password);
	 	Statement sm=cn.createStatement();
		String sql_query2="insert into s values(101,'govinda',40)";
		sm.executeUpdate(sql_query2);
		System.out.println("data has inserted");
	}
	public static void updateData(String s) throws SQLException
	{
		Connection cn=DriverManager.getConnection(url,user,password);
	 	Statement sm=cn.createStatement();
		String sql_query3="UPDATE mca s age=50 WHERE name='dev'";
		sm.executeUpdate(sql_query3);
		System.out.println("data  has updated");
	}
	public static  void displayData(String s) throws SQLException 
	{
		Connection cn=DriverManager.getConnection(url,user,password);
	 	Statement sm=cn.createStatement();
		String sql_query4="select * from s";
		
		 ResultSet rs=sm.executeQuery(sql_query4);
		    System.out.println("this is the stored data in database");
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(1) +" " + rs.getString(2));
		    }
		    
		  sm.executeQuery(sql_query4);
		  System.out.println("data  has displayed");
	}
	public static  void deleteData(String s)
	{
		Connection cn;
		try {
			cn = DriverManager.getConnection(url,user,password);			
			Statement sm=cn.createStatement();
			String sql_query5="DELETE FROM s WHERE name='govinda'";
			sm.executeUpdate(sql_query5);
			System.out.println("data  has deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			//step-3
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number from 1 to 5:");
			int a=sc.nextInt();
			
			if(a == 1)
			{
				System.out.println("enter the table name");
				table_name=sc.next();
				
				// call the method
				createTable(table_name);
			}
			else if(a == 2)
			{
				System.out.println("enter the table name");
				table_name=sc.next();
				
				// call the method
				insertData(table_name);
			}
			else if(a == 3)
			{
				System.out.println("enter the table name");
				table_name=sc.next();
				// call the method
				updateData(table_name);
			}
			else if(a == 4)
			{
				System.out.println("enter the table name");
				table_name=sc.next();
				//call the method
				displayData(table_name);
				
			}
			else if(a == 5)
			{
				System.out.println("enter the table name");
				table_name=sc.next();
				//call the method
				deleteData(table_name);
			}
			else {
				System.out.println("erroe");
			}
			

	}

}
