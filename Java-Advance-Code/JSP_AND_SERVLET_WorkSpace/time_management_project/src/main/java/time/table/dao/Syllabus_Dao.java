package time.table.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import time.table.entities.Admin_Course;
import time.table.entities.Admin_Syllabus;

public class Syllabus_Dao {
	
private Connection con;
	
	public Syllabus_Dao(Connection con)
	{
		this.con=con;
		
		/* so without the connection object can't access this class so if we 
		 * want to access this class we must have to give the argument to it 
		 * which argument must be Connection type return..
		 * 
		 */
	}
	
	/* method to insert user to data base
	 * actually we are initialized all the user data into User class object so 
	 * to aacess those data into here we are going to pass object of user class.
	 * here we are importing the com.tech.blog.entities.User for creating the object of User class
	 *  or 
	 *  to insert data into database 
	 */
	
	public boolean saveSyllabus(Admin_Syllabus user)
	{
		boolean f=false;
		/*
		 * BYdefault f=false beacuse it not insert data into database.
		 * so after execute the statement for insert data into database.
		 * we will make it true..
		 */
		
		
		
		
		try {
			// insert data into database...
			
			String operation=user.getOperation();
			
			if(operation.equals("create"))
			{
				String query="insert into syllabus_admin(id,name) values(?,?)";
				
				PreparedStatement pstmt=con.prepareStatement(query);
				/*
				 * call the getName() method to store data into database which is stored into in this 
				 * method
				 */
				pstmt.setInt(1, user.getId());
				pstmt.setString(2, user.getName());
		
				/*		pstmt.setString(2, user.getEmail());
				pstmt.setString(3, user.getPassword());
				pstmt.setString(4, user.getGender());
				pstmt.setString(5, user.getAbout());            */
				
				pstmt.executeUpdate();
				f=true;
				
			}
			else if(operation.equals("update"))
			{
				String query="UPDATE syllabus_admin SET name =? WHERE id=?";
				PreparedStatement pstmt=con.prepareStatement(query);
				/*
				 * call the getName() method to store data into database which is stored into in this 
				 * method
				 */
				pstmt.setString(1, user.getName());
				pstmt.setInt(2,user.getId() );
				
		
				/*		pstmt.setString(2, user.getEmail());
				pstmt.setString(3, user.getPassword());
				pstmt.setString(4, user.getGender());
				pstmt.setString(5, user.getAbout());            */
				
				pstmt.executeUpdate();
				
				f=true;
				
			}
			else {
				
				
				System.out.println("error happed");
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("this is syllabus Dao");
		System.out.println(f);
		return f;
		
	}

	
	
	
	


}
