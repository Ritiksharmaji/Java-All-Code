package first_pack;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
	{
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("this is successfully servlet");
		out.println("<h1>successfully registered</h1>");
	}
	

}
