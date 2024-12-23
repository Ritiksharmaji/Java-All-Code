<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@page import="time.table.entities.Message_class" %>
        <!DOCTYPE html>
        <html>

        <head>
            <!-- this is css bootstrap -->
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
                integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
                crossorigin="anonymous" />
            <!-- this is font icon awensome -->
            <link rel="stylesheet"
                href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
                #menuitem6 {
                    font-family: "Roboto";
                }
              
              .bg-container {
                               height: 100vh; 
                              background-image: radial-gradient(#2196f3, #f44336);
                              background-size:cover;
                      }
                      .all-container-card{
                      
                      background-color:#B00020;
                      }
              
                .banner-background {

            clip-path: polygon(50% 0%, 100% 0, 100% 35%, 100% 92%, 80% 88%, 49% 96%, 20% 92%, 0 93%, 0% 35%, 0 0);
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
        
        <div class="all-container-card">
        
        
        <div class="container ">
       
            <nav class="navbar navbar-expand-lg navbar-blue bg-white fixed-top">
                <a class="navbar-brand" href="index.jsp">
                    <img class="banaer_image" src="https://www.effe.in/img/customer-logos/vignan.jpg" />
                </a>

                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    
                    <div class="navbar-nav m-auto">          
                       
                        <h1 class="HEADING" id="menuitem5" style="font-size:20px; color:red;" >VIGNAN INFORMATION MANAGMENT SYSTEM</h1>                     
                    </div>
                    
                    
                   
                </div>
            </nav>
     
        </div>     
        
        
            <div class="main-container-admin bg-container banner-background d-flex flex-column justify-content-center">
                <!-- this is the Faculty_admin  body -->
                <div class="container  mt-5 ">
                    <div class="col-md-6 offset-md-3">
                        <div class="card ">
                            <div class="card-header text-center userdefinecolor-background">
                                <span class="fa fa-user-plus fa-3x"></span>
                                <p>Login Form </p>
                            </div>

                            <!-- to store the error sms
                        or which is send by loginservlet
                        
                         -->

                            <% Message_class m=(Message_class) session.getAttribute("msg"); if (m !=null) { %>
                                <div class="alert <%= m.getCssClass() %>" role="alert">
                                    <%= m.getContent() %>
                                </div>


                                <% session.removeAttribute("msg"); // to delete the session other wise it will show  always 
                                    
                                    
                            } %>

                                    <div class="card-body">

                                        <form id="reg-form" action="LoginServlet" method="post">

                                            <div class="form-group">
                                                <label for="userType">User Type:</label>
                                                <select id="userType" name="userType" class="form-control">
                                                    <option value="student">Student</option>
                                                    <option value="admin">Admin</option>
                                                    <option value="faculty">Faculty</option>
                                                    <option value="hod">HOD</option>
                                                </select>
                                            </div>

                                            <div class="form-group">
                                                <label for="id">Enter ID number</label>
                                                <input name="id" type="text" class="form-control" id="syllabus_id"
                                                    placeholder="write here" required>
                                                <small id="idlHelp" class="form-text text-muted">plz. write in
                                                    numeric</small>
                                            </div>

                                            <div class="form-group">
                                                <label for="password">Enter password</label>
                                                <input name="password" type="password" class="form-control"
                                                    id="password" placeholder="write here " required>

                                            </div>



                                            <div class="form-group-bottom text-center">

                                            <button id="sumbimt-btn" type="submit"
                                                class="btn btn-primary mb-2">Submit</button>
                                              <br>  <a href="#"><b>forget password</b></a>
                                                
                                                </div>
                                        </form>

                                    </div>



                        </div>
                    </div>
                </div>

            </div>


<div class="footer-section pt-5 pb-5">
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

        </body>

        </html>