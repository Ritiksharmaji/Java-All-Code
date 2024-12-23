package COLLEGE_JDBC;
import java.sql.*;
import java.util.*;
public class Insert_multiple_recordrows {
	public static void main(String[] args) throws Exception
	{
	//lass.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Ritiksharma620@");
		Statement stmt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("enter id of state");
			int id=sc.nextInt() ;

			System.out.println("enter name of state");
			String name=sc.next() ;

			System.out.println("enter name of chif mi.. of state");
		   String name2=sc.next() ;

			System.out.println("enter total number of distic");
			int dist=sc.nextInt() ;
			
			System.out.println("enter table name as state");
			String name3 =sc.next() ;
			
			String sql_query=String.format("insert into "+name3+" values(%d,'%s','%s',%d)",id,name,name2,dist);
			
			stmt.executeUpdate(sql_query);
			System.out.println("record inserted");
			
			System.out.println("do u want to insert more data[yes/no]");
			String option=sc.next();
			if(option.equalsIgnoreCase("no"))
			{
				break;
			}
			
		}
		System.out.println("table created");
		con.close();
	}

}
