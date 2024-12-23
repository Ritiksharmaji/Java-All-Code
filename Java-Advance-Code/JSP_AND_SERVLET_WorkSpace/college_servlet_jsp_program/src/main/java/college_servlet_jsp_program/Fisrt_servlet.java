package college_servlet_jsp_program;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;


public class Fisrt_servlet extends HttpServlet 
{
    protected void post(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException 
   {
             response.setContentType("text/html;charset=UTF-8");
              try (PrintWriter out = response.getWriter()) 
             {
                    out.println("Welcome to Servlet");
   }
} 
}
