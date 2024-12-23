package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First_servlet
 */
@WebServlet("/cookie1")
public class First_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String s=request.getParameter("textname");
		
		Cookie e=new Cookie("textname",s);
		response.addCookie(e);
		
		out.println("welcome to"+s);
		out.println("<form action='cookie2' method='post'>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
		}catch(Exception e)
		{
			System.out.println("this is error of servlet 1:"+e);
		}
	}

}
