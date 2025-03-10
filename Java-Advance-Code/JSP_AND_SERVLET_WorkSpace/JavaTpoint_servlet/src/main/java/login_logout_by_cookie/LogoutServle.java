package login_logout_by_cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogoutServle
 */
@WebServlet(name = "LogoutServle_cookie", urlPatterns = { "/logoutservle_cookie" })
public class LogoutServle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	          
	        request.getRequestDispatcher("link.html").include(request, response);  
	          
	        Cookie ck=new Cookie("name","");  
	        ck.setMaxAge(0);  
	        response.addCookie(ck);  
	          
	        out.print("you are successfully logged out!");  
	}

}
