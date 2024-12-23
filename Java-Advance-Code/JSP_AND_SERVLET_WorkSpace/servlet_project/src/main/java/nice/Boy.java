
package nice;
//import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.lang.*;

/**
 * Servlet implementation class Boy
 */
public class Boy implements Servlet
{
	ServletConfig conf;
	
	public void init(ServletConfig conf)
	{
		this.conf=conf;
		System.out.println("created object");
	}
	public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
	{
		System.out.println("servicing .....");
		
	}
	public void destroy()
	{
		System.out.println("going to distroy servlet object");
		
	}
	public ServletConfig getServletConfig()
	{
		return this.conf;
	}
	public String getServletInfo()
	{
		return "this servlet is created tiwari";
		
	}
	
}