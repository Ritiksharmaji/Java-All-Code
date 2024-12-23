package prepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatement_update_data {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		try {
		String url="jdbc:mysql://localhost:3306/prepost";
		String user="root";
		String password="Ritiksharma620@";
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter id of employee to update name");
		int id=sc.nextInt();

		System.out.println("enter name of employee to update");
		String name=sc.next();
		
		
	//	String sql_query="UPDATE employee SET name_of_emp = ? WHERE id = ?";
		
		String sqlUpdate = "UPDATE employee "
                + "SET name_of_emp = ? "
                + "WHERE id = ?";		
		
		
		//
		Connection con=DriverManager.getConnection(url,user,password); 
		//
		PreparedStatement stmt=con.prepareStatement(sqlUpdate);
		//PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?)");
		
		
		
			stmt.setString(1,name);
			stmt.setInt(2,id);
			count=stmt.executeUpdate();
			System.out.println("record updated");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
