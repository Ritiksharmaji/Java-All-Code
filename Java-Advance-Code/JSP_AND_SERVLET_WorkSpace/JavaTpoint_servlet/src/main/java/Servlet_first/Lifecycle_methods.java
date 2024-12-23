package Servlet_first;
import java.io.*;  
import javax.servlet.*;  
 
public class Lifecycle_methods implements Servlet{  
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
		return config;
		}  
	public String getServletInfo(){return "copyright 2007-1010";}  
	  
	}  
