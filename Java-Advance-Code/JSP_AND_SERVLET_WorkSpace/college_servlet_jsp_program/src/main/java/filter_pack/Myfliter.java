package filter_pack;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Myfliter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException
	{
		// TODO Auto-generated method stub
		System.out.println("before filter");
		///
		//
		arg2.doFilter(arg0, arg1);
		//
		//
		System.out.println("after filter");
		
	}
	public void init(FilterConfig cofig)throws ServletException
	{
		
		
	}
	public void destroy()
	{
		
	}

}
