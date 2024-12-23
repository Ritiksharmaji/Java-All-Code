<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.*" %>
<%@page import="com.tech.blog.helper.*" %>
<!DOCTYPE html>
<html>
<head>
<!-- this is css bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous" />
 <!-- this is font icon awensome --> 
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
   <link href="css/NewFile.css" rel="stylesheet" type="text/css">
 
 <!-- from here we are using the clip path for that following link -->
   <style>
   .banner-background{
   
   clip-path: polygon(50% 0%, 100% 0, 100% 35%, 100% 92%, 80% 88%, 49% 96%, 20% 92%, 0 93%, 0% 35%, 0 0);
   }
    
   
   </style>
</head>
<body>
  <!-- this is for navbar -->
       <%@include file="normal_navbar.jsp" %>

<!-- this is for //banner -->

     <div class="container-fluid p-0 m-0">
     
     <div class="jumbotron userdefinecolor-background  banner-background text-white">
     <div class="container">
     <h3 class="display-3">welcome Tech Blog</h3>
     <h3></h3>
     <p>
     
     A programming language is a system of notation for writing computer programs.
     [1] Most programming languages are text-based formal languages, but they may also be graphical. 
     They are a kind of computer language.
     
     </p>
     <p>
     The description of a programming language is usually split into the two components of syntax (form) and semantics (meaning),
      which are usually defined by a formal language. Some languages are defined by a specification 
      document (for example, the C programming language is specified by an ISO Standard) 
      while other languages (such as Perl) have a dominant implementation that is treated as a 
      reference. S
     
     </p>
     <button class="btn btn-outline-light btn-lg"> <span class="fa fa-external-link"></span> start! itts Free</button>
     <a href="Login_jsp.jsp" class="btn btn-outline-light btn-lg"> <span class="fa fa-user-circle-o fa-spin"></span> login</a>
     </div>
     </div>
    </div> 
     
     <!--  this is card -->
   <div class="container">
     <div class="row mb-4">
     <!-- this is first column -->
      <div class="col-md-4 col-lg-4 col-xl-4">     
       <div class="card" style="width: 18rem;">
          <img class="card-img-top" src="..." alt="Card image cap">
          <div class="card-body">
          <h5 class="card-title">JAVA PROGRAMMING LANGUAGE</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
           <a href="#" class="btn userdefinecolor-background text-white">Read More..</a>
         </div>
       </div>
       </div>
       <!-- this is second column -->
      <div class="col-md-4 col-lg-4 col-xl-4">
       <div class="card" style="width: 18rem;">
          <img class="card-img-top" src="..." alt="Card image cap">
          <div class="card-body">
          <h5 class="card-title">JAVA PROGRAMMING LANGUAGE</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
           <a href="#" class="btn userdefinecolor-background text-white">Read More..</a>
         </div>
       </div>
       </div>
       <!-- this is third column -->
      <div class="col-md-4 col-lg-4 col-xl-4">
       <div class="card" style="width: 18rem;">
          <img class="card-img-top" src="..." alt="Card image cap">
          <div class="card-body">
          <h5 class="card-title">JAVA PROGRAMMING LANGUAGE</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
           <a href="#" class="btn userdefinecolor-background text-white">Read More..</a>
         </div>
        </div>
      </div>  
    
     </div>
     
     <!-- this is second row -->
     
     <div class="row mb-4">
     <!-- this is first column -->
      <div class="col-md-4 col-lg-4 col-xl-4">     
       <div class="card" style="width: 18rem;">
          <img class="card-img-top" src="..." alt="Card image cap">
          <div class="card-body">
          <h5 class="card-title">JAVA PROGRAMMING LANGUAGE</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
           <a href="#" class="btn userdefinecolor-background text-white">Read More..</a>
         </div>
       </div>
       </div>
       <!-- this is second column -->
      <div class="col-md-4 col-lg-4 col-xl-4">
       <div class="card" style="width: 18rem;">
          <img class="card-img-top" src="..." alt="Card image cap">
          <div class="card-body">
          <h5 class="card-title">JAVA PROGRAMMING LANGUAGE</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
           <a href="#" class="btn userdefinecolor-background text-white">Read More..</a>
         </div>
       </div>
       </div>
       <!-- this is third column -->
      <div class="col-md-4 col-lg-4 col-xl-4">
       <div class="card" style="width: 18rem;">
          <img class="card-img-top" src="..." alt="Card image cap">
          <div class="card-body">
          <h5 class="card-title">JAVA PROGRAMMING LANGUAGE</h5>
          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
           <a href="#" class="btn userdefinecolor-background text-white">Read More..</a>
         </div>
        </div>
      </div>  
    
     </div>
     
       
 </div>




  












<!-- java script bootstrap libraries -->
     <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
     <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
     <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<script src="js/myjs.js" type="text/javascript"></script>
<script type="text/javascript">




</script>

</body>
</html>