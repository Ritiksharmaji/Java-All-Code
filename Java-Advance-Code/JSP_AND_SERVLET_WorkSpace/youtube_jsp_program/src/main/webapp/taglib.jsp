<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>example of directive page</h1>
<h2>example of tablib directive</h2>
<hr>
<c:set var="name" value="RKJ"></c:set>

<c:out="${name }"></c:out>
</body>
</html>