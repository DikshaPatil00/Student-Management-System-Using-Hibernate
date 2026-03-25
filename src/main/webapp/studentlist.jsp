
<%@page import="com.entityOJO.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>Insert title here</title>
<%@include file='base.html' %>
</head>
<body>

<%
   ArrayList<Student> data = (ArrayList<Student>) request.getAttribute("data");
%>

<div class="container text-centre" >
<%@include file='navbar.html' %>
</div>

<div class="container" style=" padding: 50px 30px; text-align: center; border-radius: 4px; box-shadow: 0 30px 10px 20px rgba(0, 0, 0, 0.1); margin: 30px auto; max-width: 1200px;">
<h2 class="text-center" style="font-family: 'Georgia', serif; word-spacing: 9px; font-size: 2.5em; margin-bottom: 20px; font-weight: 12px; text-transform: title;">List Of students</h2>
<br>
<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">NAME</th>
      <th scope="col">MARKS</th>
      <th scope="col">ROLL NUM</th>
      <th scope="col">GRADE</th>
      <th scope="col">CITY</th>
      <th scope="col">EDIT</th>
      <th scope="col">DELETE</th>
    </tr>
  </thead>
  <tbody>
    <%for (Student obj : data) { %>
    <tr>
      <th scope="row"> <%= obj.getId() %></th>
      <td><%= obj.getName() %></td>
      <td><%= obj.getMarks() %></td>
      <td><%= obj.getRollnum() %></td>
      <td><%= obj.getGrade() %></td>
      <td><%= obj.getCity() %></td>
      <td> <a class="btn btn-outline-success btn-sm" href="edit?id=<%= obj.getId() %> ">Edit+</a> </td>
      <td> <a class="btn btn-outline-danger btn-sm" href="delete?id=<%= obj.getId() %> ">Delete+</a> </td>
    </tr>
    <% 
    }
    %>
  </tbody>
</table>

</div>

</body>
</html>