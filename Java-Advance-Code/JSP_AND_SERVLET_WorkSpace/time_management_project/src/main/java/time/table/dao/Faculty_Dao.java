package time.table.dao;

/*
 * this is simple java class
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;


import time.table.entities.Admin_Faculty;

public class Faculty_Dao {
	
	
private Connection con;
	
	public Faculty_Dao(Connection con)
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
	
	public boolean saveFaculty(Admin_Faculty faculty)
	{
		boolean f=false;
		/*
		 * BYdefault f=false beacuse it not insert data into database.
		 * so after execute the statement for insert data into database.
		 * we will make it true..
		 */	
		
		try {
			// insert data into database...
			
			String operation=faculty.getOperation();
			
			if(operation.equals("create"))
			{
				String query="insert into admin_facultycreate(faculty_id,faculty_name,faculty_email,faculty_password,faculty_gender,faculty_join_date) values(?,?,?,?,?,?)";
				
				PreparedStatement pstmt=con.prepareStatement(query);
				/*
				 * call the getName() method to store data into database which is stored into in this 
				 * method
				 */
				pstmt.setInt(1, faculty.getId());
				pstmt.setString(2, faculty.getName());
				pstmt.setString(3, faculty.getEmail());
				pstmt.setString(4, faculty.getPassword());
				pstmt.setString(5, faculty.getGender());
		//		pstmt.setString(6, faculty.getDate_join());
				
				// Creating a date for birthdate
				
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        Date birthdate = dateFormat.parse(faculty.getDate_join());
		        pstmt.setDate(6, new java.sql.Date(birthdate.getTime()));
		        
		        pstmt.executeUpdate();
				f=true;
				
			}
			else if(operation.equals("update"))
			{
				System.out.println("update execute1");
				
				String query="UPDATE admin_facultycreate SET faculty_name =?,faculty_email=?,faculty_password=?,faculty_gender=?,faculty_join_date=? WHERE faculty_id=?";
				PreparedStatement pstmt=con.prepareStatement(query);
				/*
				 * call the getName() method to store data into database which is stored into in this 
				 * method
				 */
				System.out.println("update execute2");
				pstmt.setString(1, faculty.getName());
				pstmt.setString(2, faculty.getEmail());
				pstmt.setString(3, faculty.getPassword());
				pstmt.setString(4, faculty.getGender());
		//		pstmt.setString(6, faculty.getDate_join());
				System.out.println("update execute3");
				// Creating a date for birthdate
				
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        Date birthdate = dateFormat.parse(faculty.getDate_join());
		        pstmt.setDate(5, new java.sql.Date(birthdate.getTime()));
		        System.out.println("update execute4");
		        pstmt.setInt(6, faculty.getId());
		        System.out.println("update execute5");
		        pstmt.executeUpdate();
		        System.out.println("update execute6");
			//	pstmt.executeUpdate();
				f=true;
				System.out.println("update execute7");
			}
			else {
				
				
				System.out.println("error happed");
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("error happed raa");
		}
		System.out.println("this is Faculty dao java");
		System.out.println(f);
		return f;
		
	}	
	
	
	/*
	 * to retrive data from database
	 *  
	 */
	
	

}
