package request_dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Precties_Dispatcher1
 */
@WebServlet("/precties_dispatcher1")
public class Precties_Dispatcher1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
		RequestDispatcher rd=request.getRequestDispatcher("prectice_dispatcher2");
		rd.include(request, response);
		
		String name="ritik sharma";
		
		out.println("<h1> this is first dispatcher :"+name);
		}catch(Exception e)
		{
			System.out.println(e);
			out.println(e);
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
