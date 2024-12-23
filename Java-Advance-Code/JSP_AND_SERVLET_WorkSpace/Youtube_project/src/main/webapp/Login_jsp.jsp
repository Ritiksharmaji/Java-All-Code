<%@page import="com.tech.blog.entities.Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.tech.blog.entities.Message.*" %>
    
    
<!DOCTYPE html>
<html>

<head>
    <title>login page</title>
    <!-- this is css bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous" />
    <!-- this is font icon awensome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/NewFile.css" rel="stylesheet" type="text/css">

    <!-- from here we are using the clip path for that following link -->
    <style>
        .banner-background {

            clip-path: polygon(50% 0%, 100% 0, 100% 35%, 100% 92%, 80% 88%, 49% 96%, 20% 92%, 0 93%, 0% 35%, 0 0);
        }
    </style>
</head>

<body>


    <!-- this is for navbar -->
    <%@include file="normal_navbar.jsp" %>

        <!-- this is a login container -->
        <main class="d-flex align-items-center userdefinecolor-background banner-background" style="height:80vh">
            <div class="container">
                <div class="row">
                    <div class="col-md-4 col-lg-4 col-xl-4 offset-md-4">
                        <div class="card">
                            <div class="card-header userdefinecolor-background text-white text-center">
                                <span class="fa fa-user-plus fa-3x"></span>
                                <p>login here</p>

                            </div>
                        
                        <!-- to store the error sms
                        or which is send by loginservlet
                        
                         -->
                            
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
                            
                            <div class="card-body">
                                <form action="LoginServlet" method="post">
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input type="email" name="email" required class="form-control" id="exampleInputEmail1"
                                            aria-describedby="emailHelp" placeholder="Enter email">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email
                                            with
                                            anyone else.</small>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input type="password" name="password" required class="form-control" id="exampleInputPassword1"
                                            placeholder="Password">
                                    </div>
                                    
                                    <div class="container text-center">
                                    <button type="submit" class="btn btn-primary">Submit</button>
                                    </div>
                                    
                                </form>

                            </div>

                        </div>


                    </div>


                </div>



            </div>

        </main>







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
        <script type="text/javascript">

</body >
</html >