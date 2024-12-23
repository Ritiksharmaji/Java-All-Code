<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@page import="com.tech.blog.entities.User" %>
    <%@page import="com.tech.blog.entities.Message.*" %>
    <%@page import="com.tech.blog.entities.Message"%>
    <%@page import="com.tech.blog.dao.PostDao"%>
    <%@page import="com.tech.blog.helper.ConnectionProvider"%>
    <%@page import="com.tech.blog.entities.*"%>
    <%@page import="java.util.ArrayList"%>
        <%@page errorPage="Error_page.jsp" %>


            <% User user=(User)session.getAttribute("currentUser"); if(user==null) {
                response.sendRedirect("Login_jsp.jsp"); } else { } %>
                <!DOCTYPE html>
                <html>

                <head>
                    <meta charset="UTF-8">
                    <title>Insert title here</title>

                    <!-- this is css bootstrap -->
                    <link rel="stylesheet"
                        href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
                        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
                        crossorigin="anonymous" />
                    <!-- this is font icon awensome -->
                    <link rel="stylesheet"
                        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
                    <link href="css/NewFile.css" rel="stylesheet" type="text/css">

                    <!-- from here we are using the clip path for that following link -->
                    <style>
                        .banner-background {

                            clip-path: polygon(50% 0%, 100% 0, 100% 35%, 100% 92%, 80% 88%, 49% 96%, 20% 92%, 0 93%, 0% 35%, 0 0);
                        }
                    </style>
                </head>

                <body>

                    <!-- this is navbar starting -->

                    <nav class="navbar navbar-expand-lg navbar-dark userdefinecolor-background">
                        <a class="navbar-brand" href="index.jsp"> <span class="fa fa-bullseye"></span> techBlog</a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item active">
                                    <a class="nav-link" href="#"> <span class="	fa fa-check-square"></span> learnCode
                                        with Ritik <span class="sr-only">(current)</span></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Contact</a>
                                </li>
                                
                                 <li class="nav-item">
                                    <a class="nav-link" href="#" data-toggle="modal" data-target="#add-post-modal">Post</a>
                                </li>

                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Categories
                                    </a>
                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">Programming Language</a>
                                        <a class="dropdown-item" href="#">Project Implementation</a>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#">Data Structure</a>
                                    </div>

                            </ul>


                            <ul class="navbar-nav mr-right">
                                <li class="nav-item">

                                    <!-- Button trigger modal -->

                                    <a class="nav-link" href="#!" data-toggle="modal" data-target="#profile-model">
                                        <span class="fa fa-user-circle"></span>
                                        <%= user.getName() %>
                                    </a>
                                </li>

                                <li class="nav-item">
                                    <a class="nav-link" href="LogOutServlet"> <span
                                            class="fa fa-user-plus"></span>logout</a>
                                </li>

                            </ul>
                        </div>
                    </nav>

                    <!-- this is ending of navbar -->
                   
					<%
                                Message m = (Message) session.getAttribute("msg");
                                if (m != null) {
                            %>
                            <div class="alert <%= m.getCssClass() %>" role="alert">
                                <%= m.getContent() %>
                            </div> 


                            <%        
                                    session.removeAttribute("msg");
                                }

                            %>
                            


<!-- this is for main tag -->

	<main>
		<div class="container">
			<div class="row mt-4">
			<!-- first col -->
				<div class="col-md-4">
				<!-- display all the categories of post -->
					<div class="list-group">
					  <a href="#" class="list-group-item list-group-item-action active">
					    All posts
					  </a>
					  <a href="#" class="list-group-item list-group-item-action">java programming by hard code</a>
					  <!-- fetch the category from PostDao which take data from database.... -->
					  <!-- categories -->
					  <%

				        PostDao p = new PostDao(ConnectionProvider.getConnection());
						ArrayList<category> list1 = p.getAllcategories();
						
						for(category c:list1)
						{
						%>
						
						 <a href="#" class="list-group-item list-group-item-action">java programming by hard code</a>
						 <a href="#" class="list-group-item list-group-item-action"> <%= c.getName() %> </a>
						<%
						}
				       
				       %>
					  
					</div>
				</div>
			<!-- second col -->
				<div class="col-md-8">
				<!-- display all posts -->
				
		
       
       
				</div>
			</div>
		
		</div>
	
	</main>
<!-- end of main tag -->


                    <!-- this is profile model -->

                    <!-- Modal -->
                    <div class="modal fade" id="profile-model" tabindex="-1" role="dialog"
                        aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header userdefinecolor-background text-white">
                                    <h5 class="modal-title" id="exampleModalLabel"> profile details </h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body text-center">
                                    <div class="container">

                                        <img alt="" class="image-profile" src="pics/<%=user.getProfile()%>" width="80px"
                                            height="60px" style="border-radius:50%;">
                                        <h5 class="modal-title" id="profile_name">
                                            <%=user.getName() %>
                                        </h5>

                                        <!-- this is for display the details of user-- by table -->

                                        <div id="profile-details">
                                            <table class="table">
                                                <tbody>
                                                    <tr>
                                                        <th scope="col">id</th>
                                                        <th scope="col">
                                                            <%=user.getId() %>
                                                        </th>

                                                    </tr>
                                                </tbody>
                                                <tbody>
                                                    <tr>
                                                        <th scope="row">Email</th>
                                                        <td>
                                                            <%=user.getEmail() %>
                                                        </td>

                                                    </tr>
                                                    <tr>
                                                        <th scope="row">gender</th>
                                                        <td>
                                                            <%=user.getGender() %>
                                                        </td>

                                                    </tr>
                                                    <tr>
                                                        <th scope="row">join date</th>
                                                        <td>
                                                            <%=user.getDateTime() %>
                                                        </td>

                                                    </tr>
                                                    <tr>
                                                        <th scope="row">details </th>
                                                        <td>
                                                            <%=user.getAbout() %>
                                                        </td>


                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>

                                        <!-- this is edit profile.. -->
                                        
                                        <div id="profile-edit-details" style="display:none;">


                                            <h3 class="mt-2">please edit care fully</h3>
                                            
                                            <form action="ServletEdit" method="post" enctype="multipart/form-data">

                                                <table class="table">

                                                    <tr>
                                                        <td> ID:</td>
                                                        <td>
                                                            <%=user.getId() %>
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td> Email:</td>
                                                        <td> <input type="email" class="form-control" name="user_email"
                                                                value="<%= user.getEmail()%>"></td>
                                                    </tr>

                                                    <tr>
                                                        <td> Name:</td>
                                                        <td> <input type="text" class="form-control" name="user_name"
                                                                value="<%= user.getName()%>"></td>
                                                    </tr>



                                                    <tr>
                                                        <td> Password:</td>
                                                        <td> <input type="password" class="form-control"
                                                                name="user_password" value="<%= user.getPassword()%>">
                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td> choose pic:</td>
                                                        <td> <input type="file" class="form-control" name="user_image">
                                                        </td>
                                                    </tr>

                                                </table>
                                                <button type="submit" class="btn btn-outline-primary">save</button>




                                            </form>


                                        </div>

                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                    <button id="edit-profile-button" type="button" class="btn btn-primary">Edit</button>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- this is end of profile model -->

				<!-- this is for post modal  -->
				
				
				

<!-- Modal -->
<div class="modal fade" id="add-post-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Provide the post details..</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       <form id="add-post-form" action="AddPostServlet" method="post">
       <div class="form-group">
       <select class="form-control" name="c_id">
       <option selected >---select category---</option>
       <option>ritik</option>
       <!-- fetch the category from PostDao which take data from database.... -->
      <%
        PostDao postd = new PostDao(ConnectionProvider.getConnection());
		ArrayList<category> list = postd.getAllcategories();
		
		for(category c:list)
		{
		%>
		
		<option value="<%=c.getCategory_id() %>" ><%= c.getName() %> </option>
		<%
		}
       
       %>
       
       
      
       <option>sharma</option>
       </select>
       </div>
       
       
       <div class="form-group">
       <input type="text" name="pTitle" placeholder="enter post Title" class="form-control"/>
       </div>
       
       <div class="form-group">
       <textarea name="pContent" class="form-control" style="height:150px;" placeholder="enter your content"></textarea>
       </div>
       
       <div class="form-group">
       <textarea name="pCode" class="form-control" style="height:150px;" placeholder="enter your program(if any)"></textarea>
       </div>
       
       <div class="form-group">
       <label>Select your pic..</label>
       <br>
       <input type="file"  name="pic"/>
       </div>
       
      <div class="container text-center">
      <button type="submit" class="btn btn-outline-primary">Post</button>
      
      </div>
       
       
       
       </form>
      </div>
      
    </div>
  </div>
</div>
				
				<!-- this is end of post modal -->





                    <!-- java script bootstrap libraries -->
                    <script src="https://code.jquery.com/jquery-3.7.0.min.js"
                        integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g="
                        crossorigin="anonymous"></script>
                    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
                        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
                        crossorigin="anonymous"></script>
                    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
                        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
                        crossorigin="anonymous"></script>
                    <script src="js/myjs.js" type="text/javascript"></script>
                    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
                    <script>

                        $(document).ready(function () {

                            let editStatus = false;

                            $('#edit-profile-button').click(function () {
                                //		alert("button clicked to edit profile")

                                if (editStatus == false) {
                                    $("#profile-details").hide()
                                    $("#profile-edit-details").show();
                                    editStatus = true;
                                }
                                else {
                                    $("#profile-details").show()
                                    $("#profile-edit-details").hide();
                                    editStatus = false;

                                }


                            });


                        });

                    </script>
	   <!-- now add post js  -->
	   <script>
	   // using the zquery to display the page loaded..
	   $(document).ready(function(e){
		   //alert("loaded..")
		   // applying a listener..
		   $("#add-post-form").on("submit",function(event){
			   // this code gets called when form is submitted..
			   event.preventDefault();
			   
			   console.log("you have submitedd..")
			   // fetching the data
			   let form = new FormData(this);
			   // sending the daata to servlet thorw ajex
			   // now requesting to server
			   $.ajax({
				   url:"AddPostServlet",
				   type:'POST',
				   data:form,
				   contentType: false, // Important for FormData
		            processData: false, // Important for FormData
		            success: function(data) {
		                // Success. Log the response.
		                console.log(data);
		                // to display the sms after post the post
		                if(data.trim() == "data done"){
		                	
		                	swal("Good job!", "You clicked the button!", "success");
		                }else{
		                	swal("try again!", "Error on post servelt", "error");
		                }
		            },
				   error:function(jqXHR,textStatus,errorThrown){
					   // error sms....
					   swal("try again!", "somthing went wrong", "error");
				   }
			   })
			   
		   })
	   })
	   </script>

                </body>

                </html>