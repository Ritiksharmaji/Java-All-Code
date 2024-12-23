package url_Rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet_url
 */
@WebServlet("/firstservlet_url")
public class FirstServlet_url extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  try{  
			  
		        response.setContentType("text/html");  
		        PrintWriter out = response.getWriter();  
		          
		        String n=request.getParameter("userName");  
		        out.print("Welcome "+n);  
		  
		        //appending the username in the query string  
		      //  out.println("<form method='post'>");
		        out.print("<a href='secondservlet_url?uname="+n+"'>visit</a>");
		      //  out.println("</form>");
		                  
		        out.close();  
		  
		                }catch(Exception e){System.out.println(e);}  
		    
	}

}
