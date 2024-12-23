package by_cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginservlet_cookies")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        
	        // we are including the below request by requestdispatcher
	        request.getRequestDispatcher("linke_cookies.html").include(request, response);  
	          
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	          
	        if(password.equals("admin123") && name.equals("ritik")){  
	            out.print("You are successfully logged in!");  
	            out.print("<br>Welcome, "+name);  
	           
	            // creating cookies 
	            Cookie ck=new Cookie("name",name);  
	            response.addCookie(ck);  // send to next resource
	        }else{  
	            out.print("sorry, username or password error!");  
	            request.getRequestDispatcher("login_cookies.html").include(request, response);  
	        }  
	          
	        out.close();  
	}

}
