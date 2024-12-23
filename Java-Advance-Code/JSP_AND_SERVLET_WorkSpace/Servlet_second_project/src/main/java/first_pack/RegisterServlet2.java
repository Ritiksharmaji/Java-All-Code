package first_pack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public  class RegisterServlet2 extends HttpServlet
{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h2> welcome to Register servlet</h2>");
		//
		String name=request.getParameter("user_name");
		String password=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		String gender=request.getParameter("user_gender");
		String course=request.getParameter("Course");
		
		String cond=request.getParameter("condition");
		if(cond!=null)
		{
		if(cond.equals("checked"))
		{
			out.println("<h2> NAME:"+name+"</h2>");
			out.println("<h2> PASSWORD:"+password+"</h2>");
			out.println("<h2> EMAIL:"+email+"</h2>");
			out.println("<h2> GENDER:"+gender+"</h2>");
			out.println("<h2> COURSE:"+course+"</h2>");
			//jdbc
		//	RequestDispatcher rd=request.getRequestDispatcher("Success");
		//	rd.forward(request, response);
			
			
		}
		else
		{
			out.println("<h2> you dont have accepted the terms and condition</h2>");
		}
		}
		else
		{
			out.println("<h2> you dont have accepted the terms and condition</h2>");
			
			// i want to include out put of form.html
			// get the object of RequestDispatcher
			
			RequestDispatcher rd=request.getRequestDispatcher("form2.html");
			// include method
			rd.include(request, response);
		}
	}

}
