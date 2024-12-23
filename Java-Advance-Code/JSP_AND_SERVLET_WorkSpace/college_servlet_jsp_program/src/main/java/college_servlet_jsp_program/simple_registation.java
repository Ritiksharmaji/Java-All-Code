package college_servlet_jsp_program;
import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  


public class simple_registation extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String n=request.getParameter("userName");  
String p=request.getParameter("password");      
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/full_stack_developer","root","Ritiksharma620@");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into onlion_registation_verify values(?,?)");  
  
ps.setString(1,n);  
ps.setString(2,p);  
    
int i=ps.executeUpdate();  
if(i>0)  
out.print("You are successfully registered...");  
out.print("data has stored in database");  
      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  
