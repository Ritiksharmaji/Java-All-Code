package college_servlet_jsp_program;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class Error_of_filter extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	response.setContentType("text/html;charset=UTF-8");
      try( PrintWriter out = response.getWriter())
      {
     // TODO Auto-generated method stub
		//String a=request.getParameter("user");
		//String b=request.getParameter("password");
		
		out.println("Username or Password incorrect");
        RequestDispatcher rs = request.getRequestDispatcher("firstLogin.html");
        rs.include(request, response);	       
		
      }
      
      
	} 	
     
		
	
	}
