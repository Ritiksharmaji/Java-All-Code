package com.tech.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tech.blog.entities.User;

// to enteracted with database

public class UserDao {
	
	private Connection con;
	
	public UserDao(Connection con)
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
	
	public boolean saveUser(User user)
	{
		boolean f=false;
		/*
		 * BYdefault f=false beacuse it not insert data into database.
		 * so after execute the statement for insert data into database.
		 * we will make it true..
		 */
		try {
			// insert data into database...
			
			String query="insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			
			/*
			 * call the getName() method to store data into database which is stored into in this 
			 * method
			 */
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getAbout());
			
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
	}
	
	/*get user by email and password for login verification 
	 * or
	 * to retrive data from database
	 *  
	 */
	
	public User getUserByEmailAndPassword(String email,String password)
	{
		User user=null;
		
		try {
			String query="select * from user where email=? and password=?";
			
		PreparedStatement pstmt=con.prepareStatement(query);
		
		pstmt.setString(1, email);
		pstmt.setString(2, password);
		
		
		ResultSet set=pstmt.executeQuery();
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
			
			// to get the password data from db and set to User object
			user.setPassword(set.getString("password"));
			
			// to get the email data from db and set to User object
			user.setEmail(set.getNString("email"));
			user.setGender(set.getString("gender"));
			user.setAbout(set.getString("about"));
			user.setDateTime(set.getTimestamp("rdate"));
			
			user.setProfile(set.getString("profile"));
		}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		return user;
	}
	
	// to update the data into data base...
	
	public boolean updateUser( User user)
	{
		
		boolean f=false;
		try
		{
			String query="update user set name=?,email=?,password=?,profile=? where id=?";
			
			PreparedStatement p=con.prepareStatement(query);
			
			p.setString(1, user.getName());
			p.setString(2, user.getEmail());
			p.setString(3, user.getPassword());
			p.setString(4, user.getProfile());
			p.setInt(5, user.getId());
			
			p.executeUpdate();
			f=true;
			
			
			
		}catch(Exception e)
		{
			System.out.println("error in update method:"+e);
		}
		return f;
	}
	

}
