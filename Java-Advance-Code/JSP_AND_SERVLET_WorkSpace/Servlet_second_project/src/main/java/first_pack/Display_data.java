package first_pack;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class Display_data  extends HttpServlet 
{
    protected void service(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException 
   {
             response.setContentType("text/html;charset=UTF-8");
              try (PrintWriter out = response.getWriter()) 
             {
                    out.println("Welcome to Servlet");
   }
} 
}