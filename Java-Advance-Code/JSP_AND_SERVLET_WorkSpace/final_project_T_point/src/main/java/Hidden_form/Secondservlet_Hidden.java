package Hidden_form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Secondservlet_Hidden
 */
@WebServlet("/Secondservlet_hidden")
public class Secondservlet_Hidden extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 try{  
		        response.setContentType("text/html");  
		        PrintWriter out = response.getWriter();  
		          
		        //Getting the value from the hidden field  
		        String n=request.getParameter("uname");  
		        out.print("Hello "+n);  
		  
		        out.close();  
		                }catch(Exception e){System.out.println(e);}  
	}

}
