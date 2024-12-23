package prepareStatement;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepareStatement_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="jdbc:mysql://localhost:3306/college";
		String user="root";
		String password="Ritiksharma620@";
		try {
			// step 2 load the driver class
		//	Class.forName("com.mysql.jdbc.Driver");
			//step 3 create the connection object 
			Connection con=DriverManager.getConnection(url,user,password);
			
			//step 4 create the statement object
			String sql_query="insert into state1 values(?,?,?,?)";
			//
			PreparedStatement pt=con.prepareStatement(sql_query);
			Scanner sc=new Scanner(System.in);
			
			while(true)
			{
				System.out.println("enter id of state");
				int id=sc.nextInt() ;

				System.out.println("enter name of state");
				String name=sc.next() ;

				System.out.println("enter name of chif mi.. of state");
			   String name2=sc.next() ;

				System.out.println("enter total number of distic");
				int dist=sc.nextInt() ;
				
				//String sql_query=String.format("insert into state values(%d,'%s','%s',%d)",id,name,name2,dist);
				
				
				pt.setInt(1,id);
				pt.setString(2,name);
				pt.setString(3,name2);
				pt.setInt(4,dist);
				
				System.out.println("record inserted");
				
				System.out.println("do u want to insert more data[yes/no]");
				String option=sc.next();
				if(option.equalsIgnoreCase("no"))
				{
					break;
				}
				
			}
			System.out.println("record inserted into table");
			// step 6 
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
