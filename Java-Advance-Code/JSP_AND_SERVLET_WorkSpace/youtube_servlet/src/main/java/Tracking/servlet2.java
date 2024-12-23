package Tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2  extends HttpServlet {
	private static final long serialVersionUID = 1L;

    	
	public void doPost(HttpServletRequest request, HttpServletResponse response){  
	    try{  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	      
	    Cookie ck[]=request.getCookies();  
	    out.print("Hello "+ck[0].getValue());
	    out.print("<h2> this is another servlet page</h2>");
	  
	  
	    out.close();  
	  
	         }catch(Exception e){System.out.println(e);}  
	    }  

}

