package cntroller_pack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import registration.*;
import model_of_registration.*;

/**
 * Servlet implementation class employee_servlet
 */
@WebServlet("/employee_servlet")
public class employee_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private registration res=new registration();
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employee_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int id=request.getContentLength();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		Employe emp=new Employe();
		
		
		emp.setId(id);
		emp.setName(name);
		emp.setPassword(password);
		
		
		try 
		{
			registration.registration_employee(employee);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
