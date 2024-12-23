package time.table.helper;

/*
 * this is a simple class 
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
private static Connection con;
	
	public static Connection getConnection()
	{
		try {
			if(con == null)  // to avoid the create the connction again -again
			{
			// loading the driver
			
			// create connection
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_time_table", "root", "Ritiksharma620@");
			}
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		return con;
	}

}

