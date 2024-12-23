/**
 * 
 */
package Result_set_mata_data;

/**
 * @author RITIK SHARMA
 *
 */
import java.sql.*;
public class getColumnCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/prepost";
			String user="root";
			String password="Ritiksharma620@";
			Connection con=DriverManager.getConnection(url,user,password);  
			  
			PreparedStatement ps=con.prepareStatement("select * from employee");  
			ResultSet rs=ps.executeQuery();  
			ResultSetMetaData rsmd=rs.getMetaData();  
			  
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
			  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

	}

}
