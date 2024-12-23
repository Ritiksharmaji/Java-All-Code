package durga_sir;
import javax.servlet.*;
import java.io.*;
import java.util.Enumeration;
public class contextservlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		arg1.setContentType("text/html");
		
		PrintWriter out=arg1.getWriter();
		
		ServletContext context=getServletContext();
		
		String logical_n=context.getServletContextName();
		
		String driver=context.getInitParameter("mysql_driver");
		String url=context.getInitParameter("url");
		String driveer=context.getInitParameter("driver_class");
	//	String urel=context.getInitParameter("");
		
		Enumeration e=context.getInitParameterNames();
		String paraNames="";
		while(e.hasMoreElements())
		{
			paraNames=paraNames+e.nextElement()+"<br>";
			
		}
		// to get the attributes details 
		
		context.setAttribute("cid", "c-111");
		context.setAttribute("cname", "java");
		context.setAttribute("ccost", 1000);
		
		// get attribute is able to give data in form of object but recuired data in in form of string .
		String cid=(String)context.getAttribute("cid");
		String cname=(String)context.getAttribute("cname");
		int ccost=(Integer)context.getAttribute("ccost");
		
		e=context.getAttributeNames();
		String attrNames="";
		while(e.hasMoreElements())
		{
			attrNames=attrNames+e.nextElement();
		}
		
		// to display the data
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("LOgical name: "+logical_n+"<br>");
		out.println("driver class: "+driveer+"<br>");
		out.println("driver name:"+driver+"<br>");
		out.println("driver  url: "+url+"<br>");
		out.println("parameter names:");
		
		out.println(paraNames);
out.println("course id: "+cid+"<br>");
out.println("course name:"+cname+"<br>");
out.println("course cocst:"+ccost+"<br>");

//
out.println("Attributes Name");
out.println(attrNames);
		
	}

}
