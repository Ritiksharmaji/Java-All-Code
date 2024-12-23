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
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/profileservlet_cookies")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// this may be jsp pages also......
		
		  response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        request.getRequestDispatcher("linke_cookies.html").include(request, response);  
	          
	        Cookie ck[]=request.getCookies();  
	        if(ck!=null){  
	         String name=ck[0].getValue();  
	        if(!name.equals("")||name!=null){  
	            out.print("<b>Welcome to Profile</b>");  
	            out.print("<br>Welcome, "+name);  
	        }  
	        }else{  
	            out.print("Please login first");  
	            request.getRequestDispatcher("login_cookies.html").include(request, response);  
	        }  
	        out.close();  
	    }  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
	}

}
