package time.table.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import time.table.dao.Login_Dao;
import time.table.entities.Message_class;
import time.table.entities.User;
import time.table.helper.ConnectionProvider;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		   response.setContentType("text/html");
		   String name = null;
		   PrintWriter out=response.getWriter();
		try 
		{			
			String type=request.getParameter("userType");
			int id=Integer.parseInt(request.getParameter("id"));
			String password=request.getParameter("password");			
		
			
	
			//User use=new User(type,id,password);
			
			Login_Dao dao=new Login_Dao(ConnectionProvider.getConnection());
			
			User u=dao.getUserByTableNameEmailAndPassword(type,id,password);
			
			if(u== null)
        	{
				/*login error
				 * get some error during in database 
				 */
				
			//	out.println("invalide deatails error");
				/*
				 * in-place of above code we are writing blow code
				 */
				
				Message_class sms=new Message_class("invalide id and passwork plz. ckeck","error", "alert-danger");
				/*
				 *  we are going to create the Httpsession object to store this sms and forware to login page
				 *  so that we can display data on login data will not go to next page.
				 *  
				 *  here we are setting the attribute values od message object values
				 */
				HttpSession s=request.getSession();
				s.setAttribute("msg", sms);
				// here we are setting the value of Message object to session
				response.sendRedirect("login.jsp");
        		
        	}
        	else {
        		
        		/* login success
            	 * so after success full data insert into database the value of doa object will true(1).
            	 * 
            	 * now storing the u object into session object 
            	 * here we are setting the attribute values as all data from database not from
            	 * 
            	 * Message object
            	 */
        	//	save..
        		HttpSession s=request.getSession();
        		
        		s.setAttribute("currentUser", u);
        		
        		if(type.equals("admin"))
        		{
        			response.sendRedirect("Admin_page.jsp");
        		}
        		else if(type.equals("faculty"))
        		{
        			response.sendRedirect("Faculty_page.jsp");
        			
        		}
        		else if(type.equals("hod"))
        		{
        			response.sendRedirect("Hod_page.jsp");
        		}
        		else if(type.equals("student"))
        		{
        			response.sendRedirect("Student_page.jsp");
        		}
        		else {
        			response.sendRedirect("Error_page.jsp");
        		}
        		
        		
        	}
        			
		}catch(Exception e)
		{
			out.println(e);
			
			System.out.println(e);
		}
		
		
	
	}

}
