package COLLEGE_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class Retrives_data_with_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String url="jdbc:mysql://localhost:3306/college";
			String user="root";
			String password="Ritiksharma620@";
			Connection con=DriverManager.getConnection(url, user, password);
			 String sql_query="select * from  REPUBLICDAY2";
			PreparedStatement ps=con.prepareStatement(sql_query);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				
				java.sql.Date sdate=rs.getDate(3);
				System.out.println(id+" " +name+" "+sdate);
			}
			
		}catch(Exception e)
		{
			System.out.println("execption:"+e);
		}

	}

}
