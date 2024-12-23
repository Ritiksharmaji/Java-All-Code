package first_one;
import java.sql.*;

public class class1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
		String url="jdbc:mysql://localhost:3306/vignan";
		String username="root";
		String password="Ritiksharma620@";
		String query="select name from employee where id=2";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("name");
		System.out.println("name of second person="+name);
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
