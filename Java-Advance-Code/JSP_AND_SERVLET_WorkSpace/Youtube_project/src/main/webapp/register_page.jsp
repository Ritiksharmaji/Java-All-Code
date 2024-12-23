<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <style>
        .banner-background {

            clip-path: polygon(50% 0%, 100% 0, 100% 35%, 100% 92%, 80% 88%, 49% 96%, 20% 92%, 0 93%, 0% 35%, 0 0);
        }
    </style>
</head>

<body>

    <!-- this is for navbar -->
    <%@include file="normal_navbar.jsp" %>

        <!-- this is the Sign up body -->
        <main class="userdefinecolor-background pt-5  banner-background" style="padding-bottom:80px;">


            <div class="container">
                <div class="col-md-6 offset-md-3">
                    <div class="card ">
                        <div class="card-header text-center userdefinecolor-background">
                            <span class="fa fa-user-plus fa-3x"></span>
                            <p>Register here</p>
                        </div>
                        <div class="card-body">
                        
                            <form id="reg-form" action="RegisterServlet" method="post">
                                <div class="form-group">
                                    <label for="use_name">enter name</label>
                                    <input  name="user_name" type="text" class="form-control" id="user_name"
                                        placeholder="enter your name" required>

                                </div>


                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input name="user_email" type="email" class="form-control" id="exampleInputEmail1"
                                        aria-describedby="emailHelp" placeholder="Enter email" required>
                                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with
                                        anyone
                                        else.</small>
                                </div>

                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input name="user_password" type="password" class="form-control" id="exampleInputPassword1"
                                        placeholder="Password" required>
                                </div>

                                <div class="form-group" >
                                    <label for="gender" >Select gender</label>
                                    <br>
                                    <input type="radio" id="gender" name="gender" value="male">male
                                    <input type="radio" id="gender" name="gender" value="female" >Female
                                    <input type="radio" id="gender" name="gender" value="other">other
                                </div>

                                <div class="form-group">
                                    <label for="about">ABOUT</label>
                                    <textarea name="about" class="form-control" rows="3" id="about_area"
                                        placeholder="enter somthing about your selph" required></textarea>
                                </div>

                                <div class="form-check">
                                    <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label" for="exampleCheck1">Check me out</label>
                                </div>
                                <br>
                                <div class="container text-center"  id="loader" style="display:none;">
                                 <span class="fa fa-refresh fa-spin fa-3x"></span>
                                 <h4>please wait....</h4>
                                </div>
                               
                                <button id="sumbimt-btn" type="submit" class="btn btn-primary">Submit</button>
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
    <!-- this is for sweet cdn link -->   
    <script src="js/myjs.js" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script>
            $(document).ready(function () {
                console.log("loaded........")

                $('#reg-form').on('submit', function (event) {
                    event.preventDefault();



                    let form = new FormData(this);

                    $("#sumbimt-btn").hide();
                    $("#loader").show();
                    //send register servlet:
                    $.ajax({
                        url: "RegisterServlet",
                        type: 'POST',
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            console.log(data)

                            $("#sumbimt-btn").show();
                            $("#loader").hide();

                            if (data.trim() === 'done')
                            {

                                swal("Registered successfully..We are going to redirect to login page")
                                        .then((value) => {
                                            window.location = "Login_jsp.jsp"
                                        });
                            } else
                            {

                                swal(data);
                            }

                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            $("#sumbimt-btn").show();
                            $("#loader").hide();
                            swal("something went wrong..try again");

                        },
                        processData: false,
                        contentType: false

                    });



                });


            });



        </script>
</body >
</html >