package time.table.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import time.table.dao.Course_Dao;
import time.table.entities.Admin_Course;
import time.table.entities.Message_class;
import time.table.helper.ConnectionProvider;

/**
 * Servlet implementation class Admin_Servlet_Course
 */
@WebServlet("/Admin_Servlet_Course")
public class Admin_Servlet_Course extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
			
			// fetch all data 
        	// filter work
            String check=request.getParameter("check");
            if(check == null)
            {
            	out.println("box not checked");
            }
            else {
            	String operation=request.getParameter("admin_course_operation");
            	/*
            	 * convert string to int type
            	 */
            	String id=request.getParameter("course_id");
            	String name=request.getParameter("course_name");
            	int year=Integer.parseInt(request.getParameter("course_year"));
            	
            	
            	
            	/*to pass above parameter to User class so that 
            	 *they can be again share to UserDao then database 
            	 * 
            	 * we are creating the object of User class and setting(passing) this all 
            	 * parameter to corresponding for that we have to import com.tech.blog.entities.User;
            	 */
            	
            	
            	Admin_Course userr=new Admin_Course(id,name,year,operation);
            	
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
            	
            
            	Course_Dao dao=new Course_Dao(ConnectionProvider.getConnection());
            	
            	if(dao.saveCourse(userr))
            	{
            		/*
                	 * so after success full data insert into database the value of doa object will true(1).
                	 */
            	//	save..
            		
            		Message_class m=new Message_class("record updated","success","alert-success");
            		/*
            		 * if httpsession has already exit then it don't goes to 
            		 * create again session object
            		 * it will work on that one
            		 */
            		
            		HttpSession s=request.getSession();
            		s.setAttribute("msg", m);
            		response.sendRedirect("course_admin.jsp");
            		
            		
            	}
            	else {
            		//out.println("error");
            		
            		Message_class sms=new Message_class("something went wrong","error", "alert-danger");
    				/*
    				 *  we are going to create the Httpsession object to store this sms and forware to login page
    				 *  so that we can display data on login data will not go to next page.
    				 */
    				HttpSession s=request.getSession();
    				s.setAttribute("msg", sms);
    				// here we are setting the value of Message object to session
    				response.sendRedirect("course_admin.jsp");
            	}
            	
            }
                       
        
        
	
			
			
		}catch(Exception e)
		{
			System.out.println(e);
			out.println(e);
		}
	}
	

}
