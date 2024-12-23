package com.tech.blog.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

/**
 * Servlet implementation class RegisterServlet
 * 
 */

/*
 * to process the multi level data like image and etc. we are using the @multipartconfig
 *  which is availabe in javax.servlet.annotation.MultipartConfig; pack
 */
@MultipartConfig

@WebServlet("/RegisterServlet")
/*
 * this Registation servlet is used for insert data into database.
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
        	
            // fetch all data 
        	// filter work
            String check=request.getParameter("check");
            if(check == null)
            {
            	out.println("box not checked");
            }
            else {
            	String name=request.getParameter("user_name");
            	String email=request.getParameter("user_email");
            	String password=request.getParameter("user_password");
            	String gender=request.getParameter("gender");
            	String about=request.getParameter("about");
            	
            	/*to pass above parameter to User class so that 
            	 *they can be again share to UserDao then database 
            	 * 
            	 * we are creating the object of User class and setting(passing) this all 
            	 * parameter to corresponding for that we have to import com.tech.blog.entities.User;
            	 */
            	User userr=new User(name, email , password, gender,about);
            	
            	/*
            	 * it goes to initialize all this values into User class variable respectively.
            	 * after initialize values to parameters we need to store it into database , so
            	 */
            	
            	/* create userDao object because to interact with data
            	 * base we are writing the code in UserDao class
            	 * so in-order to create the UserDao object we must have to give the Connection type 
            	 * object so,
            	 * 
            	 */
            	
            
            	UserDao dao=new UserDao(ConnectionProvider.getConnection());
            	/*
            	 * so after success full data insert into database the value of doa object will true(1).
            	 */
            	if(dao.saveUser(userr))
            	{
            	//	save..
            		out.println("done");
            	}
            	else {
            		out.println("error");
            	}
            	
            }
                       
        
        }
	
	
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
