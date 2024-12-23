package filter_pack;

import java.io.IOException;

//import javax.xml.crypto.dsig.spec.XPathType.Filter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class myfilter implements Filter{
	
	@Override
    public void init(FilterConfig filterConfig) throws ServletException {
       
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        

 System.out.println("this is before filter");
 
 // ...........
 //..........
 chain.doFilter(request, response);
 System.out.println("After servlet filter");
 //...............
 //...............
    }

    @Override
    public void destroy() {
       
    }
    
    
}
