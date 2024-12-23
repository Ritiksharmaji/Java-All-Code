<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="time.table.entities.Message_class" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous" />
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

<!-- this is font icon awensome -->
            <link rel="stylesheet"
                href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
            <link href="css/NewFile.css" rel="stylesheet" type="text/css">


<style type="text/css">
/* this is for header part  */
.banaer_image {
    width: 140px;
    height: 70px;
}

#menuitem1,
#menuitem2,
#menuitem3,
#menuitem4 {
    font-family: "Roboto";
}


.main-container {
    background-color: green;
}

.detailed-view-bg-container {
    height: 100vh;
    background-image: radial-gradient(#2196f3, #f44336);
    background-size: cover;
}

/* this is for body part  */
.containerr {
    width: 400px;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
}

body {

    font-family: Arial, sans-serif;

}

.containerr {

    width: 440px;

    background-color: mediumspringgreen;
    border: 1px solid #ccc;
    padding: 20px;
}

input[type="text"],
input[type="text"],
select {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type="submit"] {
    background-color: #4CAF50;
    color: #fff;
    padding: 10px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #45a049;
}



/* this is footer section css code  */
.footer-section {
    background-color: #0d2436;
}

.footer-section-mail-id {
    color: #959ead;
    font-family: "Roboto";
    font-weight: bold;
    font-size: 16px;
    margin-top: 20px;
}

.footer-section-address {
    color: #959ead;
    font-family: "Roboto";
    font-size: 14px;
}



</style>

</head>



<body>
    <!--  this is for header part  -->
    <div class="main-container">
        <div class="container">
            <nav class="navbar navbar-expand-lg navbar-light bg-white fixed-top">
                <a class="navbar-brand" href="#">
                    <img class="banaer_image" src="https://www.effe.in/img/customer-logos/vignan.jpg" />
                </a>

                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav ml-auto">
                        <a class="nav-link" id="menuitem1" href="course_admin.jsp">Course <span class="sr-only">(current)</span></a>
                    <a class="nav-link" id="menuitem2" href="syllabus_admin.jsp">Subject</a>
                    
                    <a class="nav-link" id="menuitem3" href="Faculty_admin.jsp">set_time_table</a>
                    <a class="nav-link" id="menuitem4" href="time_table_admin.jsp">Time-Table</a>
                    <a class="nav-link" id="menuitem5" href="Admin_page.jsp">home </a>
                    </div>
                </div>
            </nav>


            <!-- this is body part of home -->

            <div class="detailed-view-bg-container d-flex flex-column justify-content-center">

                <div class="containerrr d-flex flex-row justify-content-center mt-5">

                    <div class="containerr mt-5" style="width:50%">

                        <form action="Admin_Servlet_Faculty" method="post">
                          
                            
                             <div class="card-header text-center">
                                    <span class="fa fa-user-plus fa-2x"></span>
                                    <p>Faculty Profile Form </p>
                                </div>
                                
                                 <!-- to store the error sms
                        or which is send by loginservlet
                        
                         -->

                                <% Message_class m=(Message_class) session.getAttribute("msg"); if (m !=null) { %>
                                    <div class="alert <%= m.getCssClass() %>" role="alert">
                                        <%= m.getContent() %>
                                    </div>


                                    <% session.removeAttribute("msg"); // to delete the session other wise it will show
                                         } %>
                                         
                                         <!-- this is card-body..  -->
                                


                            <table>

                                <tr>
                                    <td> <label for="timing">select operation:</label> </td>
                                    <td class="pl-5" style="width: 350px; height: 40px;">
                                    
                                     <select id="admin_faculty" name="admin_faculty_operation"
                                                        class="form-control">
                                                        <option value="create">Create</option>
                                                        <option value="update">Update</option>
                                                    </select>
                                     
                                     </td>

                                </tr>
                                <tr>
                                    <td> <label for="faculty_id">Enter ID number</label>  </td>
                                    <td class="pl-5"> 
                                    
                                   <input name="faculty_id" type="text" class="form-control"
                                                        id="faculty_id" placeholder="Enter ID number" required>
                                    
                                    
                                    
                                    </td>
                                </tr>

                                <tr>
                                    <td> <label for="faculty_name">Enter Faculty Name</label>   </td>
                                    <td class="pl-5">
                                    
                                     <input name="faculty_name" type="text" class="form-control"
                                                        id="faculty_name" placeholder="Enter Faculty Name " required>
 
                                     
                                     </td>
                                </tr>

                                <tr>
                                    <td> <label for="faculty_Email1">Email address</label> </td>
                                    <td class="pl-5">
                                     <input name="faculty_email" type="email" class="form-control"
                                                        id="faculty_Email1" aria-describedby="emailHelp"
                                                        placeholder="Enter email" required>
                                                    <small id="emailHelp" class="form-text text-muted">We'll never share
                                                        your email with
                                                        anyone
                                                        else.</small> 
                                     
                                     </td>
                                </tr>
                                
                                
                                <tr>
                                    <td> <label for="timing_day">select gender:</label> </td>
                                    <td class="pl-5"> <select id="timing_day" name="gender">
                                            <option value="none">Select Day</option>
                                            <option value="monday">male</option>
                                            <option value="tuesday">female</option>
                                            <option value="wednesday">other</option>

                                        </select> </td>
                                </tr>
                                
                                <tr>
                                    <td> <label for="faculty_Password">Password</label> </td>
                                    <td class="pl-5"> 
                                    
                                    <input name="faculty_password" type="password" class="form-control"
                                                        id="faculty_Password1" placeholder=" enter Password" required>
                                    
                                     </td>
                                </tr>
                                

                               

                                <tr>
                                    <td> <label for="facultJoin">Faculty joining Date:</label> </td>
                                    <td class="pl-5"> 
                                    <input type="date" id="faculty_date" name="faculty_join_date"
                                                        placeholder="yyyy-mm-dd" required>
                                     </td>
                                </tr>
                            </table>
                            <div class="bootmo">
                                <div class="form-check">
                                    <input name="check" type="checkbox" class="form-check-input"
                                                        id="exampleCheck1">
                                                    <label class="form-check-label" for="exampleCheck1">Check me
                                                        out</label>
                                </div>

                                <div class="button-card mt-3 text-center">
                                    <input type="submit" value="Submit">
                                </div>

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--  this is footer section -->

        <div class="footer-section pt-5 pb-5 mt-5">
            <div class="container-foot">
                <div class="row">
                    <div class="col-12 text-center">
                        <img src="https://www.effe.in/img/customer-logos/vignan.jpg" class="banaer_image" />
                        <h1 class="footer-section-mail-id">vignanguntur@gmail.com</h1>
                        <p class="footer-section-address">
                            pin-code:522213,guntur , vadlamundi
                        </p>
                    </div>
                </div>
            </div>
        </div>


    </div>

</body>

</html>

</body>
</html>