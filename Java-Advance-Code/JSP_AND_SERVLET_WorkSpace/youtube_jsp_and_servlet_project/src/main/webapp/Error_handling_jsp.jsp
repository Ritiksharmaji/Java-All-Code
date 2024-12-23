<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>something wants wrong!</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
.error-image{
weidth:100px:

}
.error-text{
font-family:robote;
}


</style>
</head>
<body>
<div class="error-container text-center">
<img class="error-image" src="https://image.freepik.com/free-vector/404-error-abstract-concept-illustration_335657-2243.jpg"/>

<h2 class="error-text">oops something wants wrong!</h2>
<p  class="error-text"><%=exception %></p>

<a class="btn btn-outline-primary" href="index.html">go to home</a>
</div>
</body>
</html>