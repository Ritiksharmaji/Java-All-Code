package com.tech.blog.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;


/*
 * multi type data declar..
 */

@MultipartConfig
/**
 * Servlet implementation class ServletEdit
 */
//@WebServlet("/ServletEdit")
@WebServlet(urlPatterns = "/ServletEdit", name = "ServletEdit", loadOnStartup = 1)
public class ServletEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		try {
			
			// fetch all the data...
			String name=request.getParameter("user_name");
		//	String id=request.getParameter("user_id");
			
			String email=request.getParameter("user_email");
			String password=request.getParameter("user_password");
			
			/*
			 * for storing the image data we are using the Part type object
			 */
			Part part_image=request.getPart("user_image");
			/*
			 * to store the image name and with extension
			 */
			
			String imageName=part_image.getSubmittedFileName();
			 
			//get the user from the session..
			HttpSession s=request.getSession();
			
			User user=(User)s.getAttribute("currentUser");
			
			// to update the data into data base 
			/*
			 * here we don't need to creating connect and other things 
			 * beacuse already user has login  and session has created
			 * so directly we can change the values by calling the 
			 * method..
			 * for that we are going to call the method of User class 
			 * then go for userDao to change the data from old to new..
			 * 
			 */
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			// to delete the old user image
			String oldFile = user.getProfile();
			user.setProfile(imageName); // now data has change then we need to store the changed data to databse..
			
			/*
			 * now to update the value we habe to user UserDao class object
			 * now create a method updateUser to update the data into database.
			 * which is having user type variables
			 */
			
			UserDao dao=new UserDao(ConnectionProvider.getConnection());
			
		//	if(dao.updateUser(user))
			boolean ans=dao.updateUser(user);
			if(ans== true)
			{
				System.out.println("updated");
				//out.println("data updated");
				// fetching the image path to edit or delete
				String path = request.getRealPath("/")+"pics"+File.separator+user.getProfile();
				// getRealPath- this method gives the path upto webapp folder
				  
				// to delete the old image path..
				String Old_image_path = request.getRealPath("/")+"pics"+File.separator+oldFile;
				
				if(!oldFile.equals("default.png"))
				{
					Helper.delete_file(Old_image_path);
				}
				
				
				
					if(Helper.save_file(part_image.getInputStream(), path))
					{
						//out.print("profile updated...");
						
						Message msg = new Message("profile updated", "success", "alert-success");
						// we are going to create the Httpsession object to store this sms and forware to other.
						//HttpSession s=request.getSession();
						s.setAttribute("msg", msg);
						// here we are setting the value of Message object to session
						
					}
					else {
						//out.print("error in save file...");
						
						Message msg = new Message("error in save file...", "error", "alert-danger");
						// we are going to create the Httpsession object to store this sms and forware to other.
						//HttpSession s=request.getSession();
						s.setAttribute("msg", msg);
						
					}
				
			}
			
			
		}catch(Exception e)
		{
			System.out.println("error"+e);
			
			
		}
		
		response.sendRedirect("profile.jsp");
	}

}
