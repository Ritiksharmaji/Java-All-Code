package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class order extends HttpServlet{

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           System.out.println("order servlet executed");
        	out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet order</title>");            
            out.println("</head>");
            out.println("<body>");
           out.println("<h1>Servlet order at " + request.getContextPath() + "</h1>");
          //  out.println("<h1> this is profile pages");
 
            out.println("</body>");
            out.println("</html>");
        }
    }
	
}
