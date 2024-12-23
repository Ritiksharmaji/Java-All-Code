package COLLEGE_JDBC;
import java.sql.*;
public class create_table {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		//String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/college";
		String user="root";
		String password="Ritiksharma620@";
	/*	String sql_query="CREATE TABLE REGISTRATION " +
                "(id INTEGER not NULL, " +
                " first VARCHAR(255), " + 
                " last VARCHAR(255), " + 
                " age INTEGER, " + 
                " PRIMARY KEY ( id ))"; 
                
                */
		String sql_query="CREATE TABLE REPUBLICDAY (id INTEGER NOT NULL,name VARCHAR(30))";
		//Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		 
		stmt.executeUpdate(sql_query);
		System.out.println("table created");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
