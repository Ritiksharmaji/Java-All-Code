package college_servlet_jsp_program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class nice
 */
@WebServlet("/nice")
public class nice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public nice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
     // TODO Auto-generated method stub
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		
		 if(a.equals("ritik")&&b.equals("admin123"))
	        {
	        	out.println("Login Successful......... Welcome "+a);
	            RequestDispatcher rs = request.getRequestDispatcher("welcome.html");
	            rs.include(request, response);
	        }
	        else
	        {
	           out.println("Username or Password incorrect");
	           RequestDispatcher rs = request.getRequestDispatcher("firstLogin.html");
	           rs.include(request, response);
	        }
		
	
	}

}
