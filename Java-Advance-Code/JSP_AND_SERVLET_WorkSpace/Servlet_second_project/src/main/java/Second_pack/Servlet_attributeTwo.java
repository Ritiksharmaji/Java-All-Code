package Second_pack;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet_attributeTwo extends  HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
    	try(PrintWriter out=response.getWriter())
    	{
    		//
    		//out.println("<!DOCTYPE html>");
    	//	out.println("< html>");
    		//out.println("<title>servlet s1</title>");
    		//out.println("</head>");
    	//	out.println("<body>");
    		
    		
    		int nn1=Integer.parseInt(request.getParameter("n1"));
    		int nn2=Integer.parseInt(request.getParameter("n2"));
    		
    		int p=nn1*nn2;
    		//
    		//get attribute from request
    	//	int sum=request.getAttribute("sum"); it show the  error beacuse here sum is onject type to we have type cast..
    		int sum=(int)request.getAttribute("sum");
    		out.println("<h1>sum is="+sum);
    		out.println("<h2>product is="+p);
    	//	out.println("<h1>");
    		//out.println("sum is="+sum);
    		//out.println("product is="+p);
    		//out.println("</h1>");
    		//out.println("</body>");
    		//out.println("</html>");
    	}
	}

	
}


