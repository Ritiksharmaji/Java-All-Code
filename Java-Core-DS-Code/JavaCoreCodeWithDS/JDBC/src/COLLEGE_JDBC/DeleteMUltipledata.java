package COLLEGE_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteMUltipledata {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		String driver="com.mysql.cj.jdbc.Driver";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Ritiksharma620@");
		Statement stmt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		
		//
		System.out.println("enter cutoff of number of distic ");
		int cutoff=sc.nextInt();
		String sql_query=String.format("delete from state where id_of_state>=%d", cutoff);
		
		//
		int deleted_re=stmt.executeUpdate(sql_query);
		System.out.println("the total number of row has deleted="+deleted_re);
		con.close();

	}

}
