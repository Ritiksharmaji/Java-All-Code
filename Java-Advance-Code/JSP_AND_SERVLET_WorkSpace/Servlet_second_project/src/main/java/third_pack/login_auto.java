package third_pack;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class login_auto  extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
      //  request.getRequestDispatcher("thirdpackfirst.html").include(request, response);  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        if(password.equals("admin123")){  
            out.print("You are successfully logged in!");  
            out.print("<br>Welcome, "+name);  
            request.getRequestDispatcher("thirdpackfirst.html").include(request, response); 
              
            Cookie ck=new Cookie("name",name);  
            response.addCookie(ck);  
        }else{  
            out.print("sorry, username or password error!");  
            request.getRequestDispatcher("thirdpackfirst.html").include(request, response);  
        }  
          
        out.close();  
	}

}
