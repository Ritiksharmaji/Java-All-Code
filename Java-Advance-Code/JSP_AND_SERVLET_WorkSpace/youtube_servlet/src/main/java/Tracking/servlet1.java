package Tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1  extends HttpServlet {
	private static final long serialVersionUID = 1L;

    	
	 public void doPost(HttpServletRequest request, HttpServletResponse response){  
		    try{  
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		  
		    Cookie ck=new Cookie("uname",n);//creating cookie object  
		    response.addCookie(ck);//adding cookie in the response  
		  
		    //creating submit button 
		    
		    out.print("<form action='servlet2' method='post'>");  
		    out.print("<input type='submit' value='go to second servlet'>");  
		    out.print("</form>");  
		          
		    out.close();  
		  
		        }catch(Exception e){System.out.println(e);}  
		  }  
    }


