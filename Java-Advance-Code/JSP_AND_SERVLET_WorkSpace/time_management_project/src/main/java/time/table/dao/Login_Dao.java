package time.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import time.table.entities.User;

//import com.tech.blog.entities.User;

public class Login_Dao {
	
	/*
	int id;
	private String password=null;
	 private String table_type=null;
	
	*/
	private Connection con;
	public Login_Dao(Connection con)
	{
		this.con=con;
		
		/* so without the connection object can't access this class so if we 
		 * want to access this class we must have to give the argument to it 
		 * which argument must be Connection type return..
		 * 
		 */
	}
	
	
	/*get user by email and password for login verification 
	 * or
	 * to retrive data from database
	 *  
	 */
	
	


	

/*
 * this is going to return all the values from database to User class object
 */
	
	 
	public User getUserByTableNameEmailAndPassword(String type,int id,String password)
	{
		User user=null;
		String table_type=null;
		String query=null;
		
		
		try {
			
			if(type.equals("admin"))
			{
				table_type="admin_login";
				System.out.println("admin table exit");
				 query="select admin_id,admin_name from "+table_type+" where admin_id=? and admin_password=?";
				
				
			}
			else if(type.equals("faculty"))
			{
				table_type="faculty_login";
				System.out.println("faculty table exit");
				 query="select faculty_id,faculty_name from "+table_type+" where faculty_id=? and faculty_Password=?";
						
			}
			else if(type.equals("hod"))
			{
				table_type="admin_login";
				System.out.println("hod table exit");
				 query="select hod_id,hod_name from "+table_type+" where hod_id=? and hod_password=?";
			}
			else if(type.equals("student"))
			{
				table_type="student_login";
				System.out.println("student table exit");
				query="select student_id,student_name from "+table_type+" where student_id=? and student_password=?";
			}
			else {
				
				
				System.out.println("table name error");
			}
			
			System.out.println("hello");
			
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, id);
			pstmt.setString(2, password);
			
			ResultSet set=pstmt.executeQuery();
			
			System.out.println("hello");// to execute the query
			if(set.next())
			{
				user=new User();
				
				// retrive data from database
				// data from db
				String name=set.getString("name");	
				
				//String name=set.getString(2);
				// forwade the store data into User class method SetName()
				// set to user object
				/*
				 * here we are calling the setName() method of User class 
				 * to set the value so that we can campare with other values 
				 * for authentication
				 */
				user.setName(name);
				// to get the id data from db and set to User object
				user.setId(set.getInt("id"));
				
			}			
			
		}catch(Exception e)
		{
			System.out.println("error happed in catch statement!!");
			
		}
			
		return user;
	}

	
}
