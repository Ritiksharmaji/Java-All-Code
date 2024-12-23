package com.tech.blog.entities;

import java.sql.Timestamp;

public class Post {
	
	private int post_id;
	private String post_title;
	private String post_Content;
	private String post_code;
	private String post_pic;
	private Timestamp post_date;
	private int cid;
	private int userId;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(int post_id, String post_title, String post_Content, String post_code, String post_pic,
			Timestamp post_date, int cid, int userId) {
		super();
		this.post_id = post_id;
		this.post_title = post_title;
		this.post_Content = post_Content;
		this.post_code = post_code;
		this.post_pic = post_pic;
		this.post_date = post_date;
		this.cid = cid;
		this.userId = userId;
	}
	
	public Post(String post_title, String post_Content, String post_code, String post_pic, Timestamp post_date,
			int cid,int userId) {
		super();
		this.post_title = post_title;
		this.post_Content = post_Content;
		this.post_code = post_code;
		this.post_pic = post_pic;
		this.post_date = post_date;
		this.cid = cid;
		this.userId = userId;
	}

	public int getPost_id() {
		return post_id;
	}

	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getPost_Content() {
		return post_Content;
	}

	public void setPost_Content(String post_Content) {
		this.post_Content = post_Content;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public String getPost_pic() {
		return post_pic;
	}

	public void setPost_pic(String post_pic) {
		this.post_pic = post_pic;
	}

	public Timestamp getPost_date() {
		return post_date;
	}

	public void setPost_date(Timestamp post_date) {
		this.post_date = post_date;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	

}
