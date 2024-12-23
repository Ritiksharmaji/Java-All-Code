package first_pack;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class Third_servlet extends HttpServlet
{
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException
	{
		System.out.println("this is for console get method");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1> this is get method of my servlet class </h1>");
	//	out.println(new Date().toString);
		
	}

}
