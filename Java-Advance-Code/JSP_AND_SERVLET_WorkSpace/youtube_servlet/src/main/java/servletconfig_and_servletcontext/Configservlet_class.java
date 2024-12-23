package servletconfig_and_servletcontext;
import java.io.*;
import javax.servlet.*;
// to get the servletConfig object name
import java.util.*;

public class Configservlet_class extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg1.setContentType("text/html");
		PrintWriter out=arg1.getWriter();
		ServletConfig config=getServletConfig();
		// to get the values of parameterss  
		
		String lname=config.getServletName();
		String deiverClass=config.getInitParameter("driverClass");
		String url=config.getInitParameter("url");
		String username=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		// to get the servletConfig object name
		
		Enumeration e=config.getInitParameterNames();
		String paraNames="";
		while(e.hasMoreElements())
		{
			paraNames=paraNames+e.nextElement()+"<br>";
		}
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("Logical name:"+lname+"<br>");
		out.println("Driver class:"+deiverClass+"<br>");
		out.println("URL name:"+url+"<br>");
		out.println("USERNAME:"+username+"<br>");
		out.println("PASSWORD:"+password+"<br>");
		
		out.println("initialization parameter names <br>");
		
		out.println(paraNames);
		out.println("</h2> </body></html>");
	}

}
