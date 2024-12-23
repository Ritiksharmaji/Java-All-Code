package com.tech.blog.dao;

import java.sql.*;
import java.util.ArrayList;

import com.tech.blog.entities.Post;
import com.tech.blog.entities.category;
public class PostDao {
	
	Connection con;

	public PostDao(Connection con) {
		super();
		this.con = con;
	}
	
	
	public ArrayList<category> getAllcategories(){
		
		ArrayList<category> list = new ArrayList<>();;
		try {
			
			String q = "select * from categories";
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(q);
			
			while(set.next())
			{
				// fetching the data form database..
				int cid = set.getInt("categorie_id");
				String name = set.getString("name");
				String description = set.getString("description");
				category c = new category(cid,name,description);
				list.add(c);
				
			}
			
		}catch(Exception e) {
			
			System.out.println("error in PostDao:");
			
		}
		
		System.out.println(list);
		
		return list;
		
	}

	public boolean savePost(Post p) {
		boolean f = false;
		try {
			
			String q = "insert into posts(post_Title,post_Content,post_code,post_pic,cid,userId)values(?,?,?,?,?,?)";            
			PreparedStatement pstst = con.prepareStatement(q);
			pstst.setString(1, p.getPost_title());
			pstst.setString(2, p.getPost_Content());
			pstst.setString(3, p.getPost_code());
			pstst.setString(4, p.getPost_pic());
			pstst.setInt(5, p.getCid());
			pstst.setInt(6, p.getUserId());
			
			pstst.executeUpdate();
			f=true;
			
//			System.out.println(p.getPost_title());
//			System.out.println(p.getPost_Content());
//			System.out.println(p.getPost_code());
//			System.out.println(p.getPost_pic());
//			System.out.println(p.getCid());
//			System.out.println(p.getUserId());
		}catch(Exception e) {
			
			System.out.println("error in savePost:"+ e);
		}
		
		
		return f;
	}
}
