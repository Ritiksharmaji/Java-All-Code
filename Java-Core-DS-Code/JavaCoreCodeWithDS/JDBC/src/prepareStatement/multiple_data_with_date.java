package prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class multiple_data_with_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count;
		try {
		String url="jdbc:mysql://localhost:3306/college";
		String user="root";
		String password="Ritiksharma620@";
		Scanner sc=new Scanner(System.in);
		
		String sql_query="insert into REPUBLICDAY2 values(?,?,?)";
		//
		Connection con=DriverManager.getConnection(url,user,password); 
		//
		PreparedStatement ps=con.prepareStatement(sql_query);
		//PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?)");
		
	
		while(true)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			
			System.out.println("enter name");
			String name=sc.next();
			
			System.out.println("enter date of join");
			String dob=sc.next();

			ps.setInt(1, id);
			ps.setString(2,name);
			
			/* to convert string into util date formate
			 * 
			 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date udate=sdf.parse(dob);
		
		// to convert util date to sql date 
		
		long l=udate.getTime();
		java.sql.Date sdate=new java.sql.Date(l);
		
		//set the date
		//ps.setDate(3, java.sql.Date);
		ps.setDate(3, sdate);
		count=ps.executeUpdate();		
		System.out.println("date inserted");
	    System.out.println("do u want to insert more data[yes/no]");
		String option=sc.next();
		if(option.equalsIgnoreCase("no"))
		{
			break;
		}			
	}  
		System.out.println(count+" records inserted");  
		  con.close();
		}catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

	

}
