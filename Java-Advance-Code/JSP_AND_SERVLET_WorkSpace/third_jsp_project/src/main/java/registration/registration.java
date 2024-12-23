package registration;
import java.sql.*;
import model_of_registration.*;
public class registration {

	public int registration_employee(employee employee)throws ClassNotFoundException
	{
		String sql_query="insert into login"+
	"(idlogin,user_name,password)values"+
				"(?,?,?);";
		
		int result=0;
		Class.forName("com.mysql.jdbc.Driver");
		
		try
		{
			String url="jdbc:mysql://localhost:3306/vfstr";
			String user="root";
			String password="Ritiksharma620@";
			Connection con=DriverManager.getConnection(url, user, password);
			
			// step creating statment
			PreparedStatement stmt=con.prepareStatement(sql_query);
			
			//stmt.setInt(1, 1);
			stmt.setInt(1,employee.getId());
			stmt.setString(2, employee.getName());
			stmt.setString(3,employee.getPassword());
			
			System.out.println(stmt);
			
			result=stmt.executeUpdate();
		}
		catch(Exception e)
		{
		//	System.out.println(e);
			e.printStackTrace();
		}
		return result;
	}
	
}
