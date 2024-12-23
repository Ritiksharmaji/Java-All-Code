package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSession1
 */
@WebServlet("/httpsession1")
public class HttpSession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
			
			
			String email=request.getParameter("email");
			String password=request.getParameter("pass");
			
			if(email.equals("ritik@gmail.com") && password.equals("rocky123"))
			{
				
			//	request.setAttribute("key","ritik sharma");// to set the key value	
				HttpSession session=request.getSession();
				session.setAttribute("key", "ritik sharma ji");
				
				RequestDispatcher rd=request.getRequestDispatcher("/httpsession1_jsp.jsp");
				rd.forward(request, response);
			}
			else {
				response.setContentType("text/html");
				out.print("wrong email and password");
				RequestDispatcher rd=request.getRequestDispatcher("/httpsession1_cookies.html");
				rd.forward(request, response);
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
			out.print(e);
			
		}
	}

}
