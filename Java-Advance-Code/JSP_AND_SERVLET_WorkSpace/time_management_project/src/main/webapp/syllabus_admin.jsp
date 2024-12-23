<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="time.table.entities.Message_class" %>
<!DOCTYPE html>
<html>

<head>
    <!-- this is css bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous" />
    <!-- this is font icon awensome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/NewFile.css" rel="stylesheet" type="text/css">

    <!-- from here we are using the clip path for that following link -->
    <style type="text/css">
        .banaer_image {
    width: 140px;
    height: 70px;
}

#menuitem1,
#menuitem2,
#menuitem3,
#menuitem4,
#menuitem5,
#menuitem6{
    font-family: "Roboto";
}
.main-container-admin{
     height: 100vh;
  background-image: radial-gradient(#2196f3, #f44336);
    background-size: cover;
}
    </style>
    
    
</head>

<body>
<div class="main-container-admin">
<div class="container">
    <!-- this is for navbar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-white">
            <a class="navbar-brand" href="#">
                <img class="banaer_image" src="https://www.effe.in/img/customer-logos/vignan.jpg" />
            </a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav ml-auto">
                    <a class="nav-link" id="menuitem1" href="course_admin.jsp">Course <span class="sr-only">(current)</span></a>
                    <a class="nav-link" id="menuitem2" href="Faculty_admin.jsp">Faculty</a>
                    
                    <a class="nav-link" id="menuitem3" href="faculty_allocate_time.jsp">set_time_table</a>
                    <a class="nav-link" id="menuitem4" href="time_table_admin.jsp">Time-Table</a>
                    <a class="nav-link" id="menuitem5" href="Admin_page.jsp">home </a>

                </div>
            </div>
        </nav>
    </div>
    
   
        <!-- this is the Faculty_admin  body -->
        


            <div class="container mt-5">
                <div class="col-md-6 offset-md-3">
                    <div class="card ">
                        <div class="card-header text-center userdefinecolor-background">
                            <span class="fa fa-user-plus fa-3x"></span>
                            <p>Syllabus Profile Form </p>
                        </div>
                        
        <!-- to store the error sms
                        or which is send by loginservlet
                        
                         -->
                            
                     <%
                               Message_class m = (Message_class) session.getAttribute("msg");
                                if (m != null) {
                            %>
                            <div class="alert <%= m.getCssClass() %>" role="alert">
                                <%= m.getContent() %>
                            </div> 


                            <%        
                                    session.removeAttribute("msg");
                            
                            // to delete the session other wise it will show always
                                }

                            %>
                        
                        
                                        
                        
                        
                        
                        <div class="card-body">
                        
                            <form id="reg-form" action="Admin_Servlet_Syllabus" method="post">
                               
                               <div class="form-group">                                                          
                                        <label for="admin_syllabus">select operation:</label>
                                        <select id="admin_syllabus" name="admin_syllabus_operation" class="form-control" >
                                           <option value="create">Create</option>
                                           <option value="update">Update</option>
                                           <!-- how can i do this below operation -->
                        <!--                   <option value="create">display</option>
                                           <option value="update">delete</option>        -->    
                                         </select>
                                </div>
                               
                               <div class="form-group">
                                    <label for="syllabus_id">Enter ID number</label>
                                    <input name="syllabus_id" type="text" class="form-control" id="syllabus_id"
                                        placeholder="write here" required>
                                    <small id="idlHelp" class="form-text text-muted">plz. write in numeric</small>
                                </div>
                               
                                <div class="form-group">
                                    <label for="syllabus_name">Enter Syllabus Name</label>
                                    <input  name="syllabus_name" type="text" class="form-control" id="syllabus_name"
                                        placeholder="write here " required>

                                </div>


                                <div class="form-check">
                                    <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">Check me out</label>
                                </div>
                               <br>
                               
                                <button id="sumbimt-btn" type="submit" class="btn btn-primary">Submit</button>
                            </form>

                        </div>



                    </div>
                </div>
            </div>

 </div>








        <!-- java script bootstrap libraries -->
        <script src="https://code.jquery.com/jquery-3.7.0.min.js"
            integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
            integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
            crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
            integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
            crossorigin="anonymous"></script>
        <script src="js/myjs.js" type="text/javascript"></script>
    <!-- this is for sweet cdn link -->   
    <script src="js/myjs.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
       
</body >
</html >