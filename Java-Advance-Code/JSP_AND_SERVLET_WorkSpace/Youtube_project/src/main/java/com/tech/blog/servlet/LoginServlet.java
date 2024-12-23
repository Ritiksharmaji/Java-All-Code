package com.tech.blog.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		try {
			
			String userEmail=request.getParameter("email");
			String userPassword=request.getParameter("password");
			
			/*
			 * we know that UserDao class having data from database
			 * so we are going to crate the object for it
			 */
			UserDao dao=new UserDao(ConnectionProvider.getConnection());
			
			/* calling the function with given parameter values.
			   also we known that that function is returning some values so we will store it 
			   in User object
			 */
			User u=dao.getUserByEmailAndPassword(userEmail, userPassword);
			
			if(u == null)
			{
				// login.error....
				/*
				 * it will be happed when the stored data is not matched login data
				 * for that we are cerating the object of Message class by using it we can apply the 
				 * ajax feacture on login page to display the error so that
				 * page will still in login page.
				 */
				//out.print("login fail...");
				Message msg = new Message("Invalid Details ! try with another", "error", "alert-danger");
				// we are going to create the Httpsession object to store this sms and forware to other.
				HttpSession s=request.getSession();
				s.setAttribute("msg", msg);
				// here we are setting the value of Message object to session
				response.sendRedirect("Login_jsp.jsp");
			}
			else
			{
				// login success..
				/*
				 * we are going to create the HttpSession object to mantainer the state of authentication..
				 */
				HttpSession s=request.getSession();
				s.setAttribute("currentUser", u);
				response.sendRedirect("profile.jsp");
				
			}
			
		}catch(Exception e)
		{
			
		}
		
	
	}

}
