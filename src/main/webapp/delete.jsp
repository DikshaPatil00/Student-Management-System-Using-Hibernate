
<%@page import="com.entityOJO.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file='base.html' %>
</head>
<body>

<%
 Student s =(Student) request.getAttribute("obj");
%>>

<div class="container text-centre" >
<%@include file='navbar.html' %>
</div>

<div class="container" style=" padding: 60px 30px; text-align: center; border-radius: 8px; box-shadow: 0 30px 10px 20px rgba(0, 0, 0, 0.1); margin: 50px auto; max-width: 1200px;">
   <h3> Are you sure you want to delete :" <%= s.getName() %>"?</h3>
   <br>
   <div class="text-center container">
   <form action="delete?id=<%= s.getId() %>" method="POST">
       <input type="submit" value="YES" class="btn btn-danger btn-sm" style="font-family: 'Arial', sans-serif; font-weight: 5px;">
   </form>
   <br>
   <a href="list" class="btn btn-info btn-sm " style="font-family: 'Arial', sans-serif; font-weight: 5px;">NO</a>
   </div>
   
</div>

</body>
</html>