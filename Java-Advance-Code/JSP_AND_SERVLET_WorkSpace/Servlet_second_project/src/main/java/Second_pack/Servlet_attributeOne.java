package Second_pack;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet_attributeOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
  //  protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
   // {
    	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
    	try(PrintWriter out=response.getWriter())
    	{
    		//
    	//	out.println("<!DOCTYPE html>");
    		//out.println("< head>");
    		//out.println("<title>servlet s1</title>");
    		//out.println("</head>");
    		//out.println("<body>");
    		
    		out.println("<h2> this is first servlet for calculation</h2>");
    		//
    		String n1=request.getParameter("n1");
    		String n2=request.getParameter("n2");
    		//
    		int nn1=Integer.parseInt(n1);
    		int nn2=Integer.parseInt(n2);
    		//
    		//add
    		int s=nn1+nn2;
    		
    		// seting the attribute------------
    		
    		request.setAttribute("sum", s);
    		
    		//forwording the it with the help of request dispatcher.
    		RequestDispatcher rd=request.getRequestDispatcher("Servlet_attributeTwo");
    		rd.forward(request, response);
    		//out.println("</body>");
    		//out.println("</html>");
    	}
    }

}
