package com.tech.blog.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.tech.blog.dao.PostDao;
import com.tech.blog.entities.Post;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;

@MultipartConfig
/**
 * Servlet implementation class AddPostServlet
 */
@WebServlet("/AddPostServlet")
public class AddPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
        	int cid = Integer.parseInt(request.getParameter("c_id"));
        	String pTitle = request.getParameter("pTitle");
        	String pContent = request.getParameter("pContent");
        	String pCode = request.getParameter("pCode");
        	// for pic data type
        	Part part = request.getPart("pic");
        	
        	// getting the current user id by session
        	HttpSession session = request.getSession();
        	User user = (User)session.getAttribute("currentUser");
//        	out.println("your post id is:"+cid);
//        	out.println("your post code is:"+pContent);
//        	out.println("your post title is:"+pCode);
//        	out.println("your post title is:"+pTitle);
//        	// to print the file name
//        	out.println(part.getSubmittedFileName());
        	
        	// creating object for Post class
        	Post p = new Post(pTitle,pContent,pCode,part.getSubmittedFileName(),null,cid,user.getId());
        	
        	// to call the PostDao class
        	PostDao dao = new PostDao(ConnectionProvider.getConnection());
        	
        	if(dao.savePost(p)) {
        		
        		//String path = request.getRealPath("/")+"blog_pic"+File.separator+part.getSubmittedFileName();
        		String path = getServletContext().getRealPath("/") + "blog_pic" + File.separator + part.getSubmittedFileName();
        		Helper.save_file(part.getInputStream(), path);
        		out.println("data done");
        		// With this line
        		
        		
        		
        	}else {
        		out.println("data not save Error:");
        	}
        }
        	
        
	}

}
