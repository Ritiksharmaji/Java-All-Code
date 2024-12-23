package first_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Second_servlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		System.out.println("this is servlwt using gneric servlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>this is my servlet using generic servlet of ritik</h1>");
		
	}
	

}
