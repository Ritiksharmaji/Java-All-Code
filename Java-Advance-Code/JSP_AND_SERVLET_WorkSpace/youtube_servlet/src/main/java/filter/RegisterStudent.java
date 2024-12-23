package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterStudent
 */
@WebServlet("/Stdreg")
public class RegisterStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterStudent() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException , IOException
    {
    	String name=req.getParameter("name");
    	String email=req.getParameter("email");
    	int marks=Integer.parseInt(req.getParameter("marks"));
    	super.doGet(req, res);
    	// to sending the output
    	
    	PrintWriter out=res.getWriter();
    	out.println("<h4> name:</h4>"+name);
    	out.println("<h4> email:</h4>"+email);
    	out.println("<h4> marks:</h4>"+marks);

    	
    }

}
