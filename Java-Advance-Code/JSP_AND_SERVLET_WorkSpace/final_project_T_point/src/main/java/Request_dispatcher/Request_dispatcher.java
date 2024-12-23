package Request_dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Request_dispatcher
 */
@WebServlet("/dispatcher1")
public class Request_dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    String p=request.getParameter("userPass");  
		          
		    if(p.equals("servlet")){  
		        RequestDispatcher rd=request.getRequestDispatcher("welcome");  
		        rd.forward(request, response);  
		    }  
		    else{  
		        out.print("Sorry UserName or Password Error!");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index_dispatcher.html");  
		        rd.include(request, response);  
		                      
		        }  
	}

}
