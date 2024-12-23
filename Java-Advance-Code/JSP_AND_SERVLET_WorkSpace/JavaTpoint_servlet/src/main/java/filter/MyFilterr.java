package filter;

import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.*;  
  
public class MyFilterr implements Filter{  
  
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException {  
	resp.setContentType("text/html");   
    PrintWriter out=resp.getWriter();  
          
    String password=req.getParameter("password");  
    if(password.equals("admin")){ 
    RequestDispatcher rd=req.getRequestDispatcher("servlet1_filter");
    chain.doFilter(req, resp);//sends request to next resource
    
    }  
    else{  
    
    out.print("username or password error!");  
    RequestDispatcher rd=req.getRequestDispatcher("firstLogin.html");  
    rd.include(req, resp);  
    }  
          
}  
    public void destroy() {}  
  
}  