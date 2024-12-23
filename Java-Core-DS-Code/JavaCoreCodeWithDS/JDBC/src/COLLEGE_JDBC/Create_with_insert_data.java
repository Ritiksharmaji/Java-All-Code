package COLLEGE_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_with_insert_data {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		//String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/college";
		String user="root";
		String password="Ritiksharma620@";
		String sql_query="CREATE TABLE state2 " +
                "(id_of_state INTEGER not NULL, " +
                "name_of_state VARCHAR(255) not NULL, " + 
                " chif_manister VARCHAR(255) not NULL, " + 
                " total_distic INTEGER, " + 
                " PRIMARY KEY ( id_of_state ))";
	//	String sql_query2="insert into state2 values(1001,'bihar','nitesh kumar',302)";
	//	String sql_query3="insert into state2 values(1002,'uttra pradesh','YOGI ADITY NATH',504)";
		String sql_query4="insert into state2 values(1004,'jharkhand state','Ritik sharma',598)";
		
		//Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		 
	//	stmt.executeUpdate(sql_query);
		
		System.out.println("table created");
	//	stmt.executeUpdate(sql_query2);
	//	stmt.executeUpdate(sql_query3);
		stmt.executeUpdate(sql_query4);
		System.out.println("data has inserted");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}


}
