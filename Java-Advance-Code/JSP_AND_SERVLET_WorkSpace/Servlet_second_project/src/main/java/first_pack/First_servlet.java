package first_pack;
import java.io.IOException;
import java.io.*;
import javax.servlet.*;
public class First_servlet implements Servlet
{
      
	// life cycle mathod 
	
	ServletConfig conf;
	
	@Override
	public void init(ServletConfig conf) throws ServletException 
	{
		this.conf=conf;
		System.out.println("creating object...");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		System.out.println("servicing .............");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>this is my output from servlet method: </h1>");
		//out.println("<h1>todays date and time is"+new Date().toString()+"</h1>");
		
	}
	@Override
	public void destroy()
	{
		// TODO Auto-generated method stub
		System.out.println("going to destroy servlet object");
		
	}

	@Override
	public ServletConfig getServletConfig()
	{
		// TODO Auto-generated method stub
		//return null;
		return this.conf;
	}
// non- life cycle method.
	@Override
	public String getServletInfo()
	{
		// TODO Auto-generated method stub
		//return null;
		return "this servlet is created by ritik";
	}

	
	
	
	
	
	
	

}
