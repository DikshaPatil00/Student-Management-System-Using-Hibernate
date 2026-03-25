<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file='base.html' %>
<link href="include file='CSS/STYLE.css" rel="stylesheet">
</head>
<body>

<div class="container text-centre" >
<%@include file='navbar.html' %>
</div>
    
  <div class="container mt-5" style="background-color: #779ECB; color: #333;    padding: 60px 30px; text-align: center; border-radius: 8px; box-shadow: 0 30px 10px 20px rgba(0, 0, 0, 0.1); margin: 50px auto; max-width: 1200px;">
   <div class="jumbotron">
   <img alt="" src="IMAGES/student.jpg" width="400px" height="200px">
   <br>
  <h2 class="display-4" style="font-family: 'Georgia', serif; word-spacing: 9px; font-size: 2.5em; margin-bottom: 30px; font-weight: 12px; text-transform: title;">Student Management System Project </h2>
 <hr>
  
 <div class="text-centre">
    <a class="btn btn-dark btn-lg" href="list" role="button" style="font-family: 'Arial', sans-serif; font-weight: 5px;"> Show Student</a>
 
 </div>
 
</div>
</div>
    
</body>
</html>