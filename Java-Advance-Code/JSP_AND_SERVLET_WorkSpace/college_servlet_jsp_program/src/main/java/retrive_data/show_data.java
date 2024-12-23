package retrive_data;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

/**
 * Servlet implementation class show_data
 */
@WebServlet("/show_data")
public class show_data extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int roll=Integer.parseInt(request.getParameter("rollNumber"));
		
		
		try {
			
			String url="jdbc:mysql://localhost:3306/prectics";
			String user="root";
			String password="Ritiksharma620@";
			Class.forName("com.mysql.jdbc.Driver"); 
			String sql_query="select * from student where Roll=?";
			String sql_query2="select * from student where name=?";
			
			Connection con=DriverManager.getConnection(url,user,password);  
			  
			PreparedStatement ps=con.prepareStatement(sql_query);
			
			ps.setInt(1, roll);
			out.print("<table width=75% border=1");
			out.print("<caption>student Result:</caption>");
			
			ResultSet rs=ps.executeQuery();
			// to store the columns info we need to use ResultSetMetaData
			
			java.sql.ResultSetMetaData rsmd=rs.getMetaData();
			int totalColumn=rsmd.getColumnCount();
			out.print("<tr>");
			for(int i=1 ; i<=totalColumn ; i++)
			{
				out.print("<th>"+rsmd.getColumnName(i)+"</th>");
			}
			out.print("</tr>");
			
			while(rs.next())
			{
				out.print("<tr> <td>"+rs.getInt(1)+"</td> <td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(4)+"</td></tr>");
				
			}
			out.print("</table>");
			
		}catch(Exception e)
		{
		System.out.println("this is Exeception of retrive data: "+e);
		}
	}

}
