package sai;
import java.sql.*;
public class Table_create {
	static final String url="jdbc:mysql://localhost:3306/college";
	static final String username="root";
	static final String password="Ritiksharma620@";
	public static void main(String[] args) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		String table="create table Money"+
		"(id int ,"+"name varchar(30))";
		st.executeUpdate(table);
		System.out.println("table is created");
		String s="insert into Money values(43,'sai')";
		st.execute(s);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Money");
		System.out.println(rs.getInt(1)+" "+ rs.getString(2));
		stmt.close();
	}
		catch(Exception e)
	{
			System.out.println(e);
	}

	}

}
