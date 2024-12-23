


Part #9 | Updating Profile Details using Servlet and jsp.....
step-1 create servelt ServletEdit-:
		to update the data from the user we need to create a servelt 
		name as ServletEdit which is formaction of profile file of edit section


step-2: updateUser method - create a method called as updateUser in that UserDao.java file to 
							update the data ...
							



Part #10 | Profile photo update Module-: in this model we are going to update the image which is update 
by the user 
step-1: create a file in com.tech.blog.helper name as helper.java
step-2: create two methods name as delete_file method and save_file method 

part-11 


Part #11 | Delete Old Profile Pic while updating new one| TechBlog
to delete the old image while updeting it we need to pass the path of old image to delete method not corrent image path..

	step-1:
			// to delete the old user image
			String oldFile = user.getProfile();
	step-2:
		// to delete the old image path..
				String Old_image_path = request.getRealPath("/")+"pics"+File.separator+oldFile;
				Helper.delete_file(Old_image_path);
----------------------------------------------------------------------------------------------------
part - 12:
Part #12 | Creating Database Tables for storing blogs with Categories 
for that we are creating the two tables
1)categories -: the categories table is created to store the data of types of blog with some 
				propetes 
2)posts-: to store the posts.
----------------------------------------------------------------------------------------------------
part-13:
Part #13 | Design Dynamic Form to add blog in jsp
create two class in com.tech.blog.entities 
1)category class: to store category types data in database..
2)post class:
3) add a modal from bootstrap 4 to profile.jsp after the profile modal for the post.
4) create PostDao class:

----------------------------------------------------------------------------
part-14: Best way to add Post(blog) to database using servlet

1)
	 to fetch the data on the servlet we need to give the name to some files on profile.jsp
	 a)<option> tag
	 b) <input type="file"  name="pic"/>
	 c)<textarea name="pCode" >
	 d)<textarea name="pContent" >
	 e)<input type="text" name="pTitle" >
2) we are using the Ajex so we are giving the id to form 
	a)<form id="add-post-form" action="AddPostServelt>
3) create a servelt name as AddPostServlet and implements
4) to save the post data user the PostDao class...


---------------------------------------------------------------
video-15 Part #15 | Message using Sweet Alert | Sweet ALert |
----------
step-1: to display the sms after successfull submit the poost
		we are using the sweetalter plagn so goto google and 
		write - sweet alter cdn  and copt the script tag
		ex-  https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js

		after that copy this and past to profile.jsp on bottom.
		and goto sweetAlert website and copy the sweet sms code and past 
		at after success line on profile.jsp at bootm
		ex-
		swal("Good job!", "You clicked the button!", "success");
		and apply this swal synatx on also error statemetns


----------------------------------------------------------------------------------------------------------
video-16 Part #16 | Display categories | main page layout explained 
-----------
	step-1: 
	
-------------------------------------------------------------------------------------------
video-17: Part #17 | Show all Post using AJAX | Fetch all posts (blog) |

























