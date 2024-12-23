package college_servlet_jsp_program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ClassFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("before filter");
		
		PrintWriter out=arg1.getWriter();  
		String a=arg0.getParameter("user");
		String b=arg0.getParameter("password");
	                       
	    if(b.equals("admin") && a.equals("ritik")){ 
	                   
	    arg2.doFilter(arg0, arg1);//sends request to next resource(next filter)
	//    RequestDispatcher rd=arg0.getRequestDispatcher("login");  
    //    rd.forward(arg0, arg1);  
	    }  
	    else{  
	                   //    out.print("username or password error!");  
	                   //    RequestDispatcher rd=arg0.getRequestDispatcher("firstLogin.html");  
	                   //    rd.include(arg0, arg1);  
	    	RequestDispatcher rd=arg0.getRequestDispatcher("loginError");  
	        rd.forward(arg0, arg1);  
	    } 
	    System.out.println("after filter of servlet ");
		
	}

}
