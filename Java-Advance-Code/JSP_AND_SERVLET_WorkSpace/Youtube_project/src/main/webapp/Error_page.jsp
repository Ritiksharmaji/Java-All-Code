<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<title> sorry somthing went wrong!</title>
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

<div class="container text-center mt-3">
<img alt="" src="img/browser.png" class="img-fluid" style="width:250px;heigth:100px">
<h3 class="display-3"> sorry! somthing went wrong...</h3>
<br>
<a href="index.jsp" class="btn btn-lg text-white  userdefinecolor-background">HOME</a>

</div>

</body>
</html>