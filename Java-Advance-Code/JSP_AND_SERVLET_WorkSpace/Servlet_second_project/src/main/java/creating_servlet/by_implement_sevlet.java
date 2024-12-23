package creating_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class by_implement_sevlet implements Servlet{  
	ServletConfig config=null;  
	  /*three life cycle methods
	 1) int() method
	 2)service() method
	 3)destroy() method  */
	public void init(ServletConfig config)
	{  
	this.config=config;  
	System.out.println("servlet is initialized");  
	}  
	  
	public void service(ServletRequest req,ServletResponse res)  
	throws IOException,ServletException
	{  
	  
	res.setContentType("text/html");  
	  
	PrintWriter out=res.getWriter();  
	out.print("<html><body>");  
	out.print("<b>hello simple servlet</b>");  
	out.print("</body></html>");
	System.out.println("servlet is call");  

	  
	}  
	public void destroy()
	{
		System.out.println("servlet is destroyed");
	}  
	
	//non life cycle method
	//getServletInfo().
	//getServletConfig().
	public ServletConfig getServletConfig()
	{
		return this.config;
		}  
	public String getServletInfo()
	{
		return "this is created by ritik";
		}  
	  
	}  

