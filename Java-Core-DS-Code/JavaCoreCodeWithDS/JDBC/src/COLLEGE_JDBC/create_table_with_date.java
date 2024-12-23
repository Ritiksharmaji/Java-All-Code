package COLLEGE_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class create_table_with_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String url="jdbc:mysql://localhost:3306/college";
			String user="root";
			String password="Ritiksharma620@";
			String sql_query="CREATE TABLE REPUBLICDAY2 (id INTEGER NOT NULL,name VARCHAR(30), date_join date)";
			String sql_query2="insert into REPUBLICDAY2 values(?,?,?)";
			
			Connection con=DriverManager.getConnection(url, user, password);
		//	Statement sc=con.createStatement();		
		//	sc.executeUpdate(sql_query);
		//	System.out.println("table created with date");
			
			PreparedStatement ps=con.prepareStatement(sql_query2);
			Scanner ss=new Scanner(System.in);
			System.out.println("enter id");
			int id=ss.nextInt();
			
			System.out.println("enter name");
			String name=ss.next();
			
			System.out.println("enter date of join");
			String dob=ss.next();
			
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
		ps.executeUpdate();
		
		System.out.println("date inserted");
			
		}catch(Exception e)
		{
			System.out.println("exection on date :"+e);
		}

	}

}
