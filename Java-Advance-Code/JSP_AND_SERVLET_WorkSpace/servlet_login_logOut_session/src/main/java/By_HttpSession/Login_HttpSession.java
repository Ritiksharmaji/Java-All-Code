package By_HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login_HttpSession
 */
@WebServlet("/login_httpsession")
public class Login_HttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		
		response.setContentType("text/thml");
		
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link_httpsession.html").include(request, response);  
        
        String name=request.getParameter("name");  
        String password=request.getParameter("pass");  
          
        if(password.equals("admin123") && name.equals("ritikji"))
        {  
        out.print("Welcome, "+name);
        
        HttpSession session=request.getSession();  
        session.setAttribute("name",name);  
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("/login_httpSession.html").forward(request, response);  
        }  
        out.close();  
	}

}
