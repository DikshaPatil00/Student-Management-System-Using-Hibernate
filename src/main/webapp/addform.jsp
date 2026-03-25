<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="base.html" %>
</head>
<body>

<div class="container text-centre" >
<%@include file="navbar.html" %>
</div>

<div class="container" style=" padding: 50px 30px; text-align: center; border-radius: 4px; box-shadow: 0 30px 10px 20px rgba(0, 0, 0, 0.1); margin: 30px auto; max-width: 900px;">
<h2 class="text-center" style="font-family: 'Georgia', serif; word-spacing: 9px; font-size: 2.5em; margin-bottom: 20px; font-weight: 12px; text-transform: title;">Add the Student Information Here</h2>
 <form action="add" method="POST">
 
  <div style="padding:7px; width:700px" class="form-group container">
    <label for="Input name">Student Name</label>
    <input style="text-align:center;" type="text" name="sname" class="form-control mt-1" id="Input name" aria-describedby="emailHelp" placeholder="Enter Student Name">
   </div> 
   
   <div style="padding:7px; width:700px" class="form-group container">
    <label for="Input marks">Student Marks</label>
    <input style="text-align:center;" type="text" name="smarks" class="form-control mt-1 " id="Input marks" aria-describedby="emailHelp" placeholder="Enter Student Marks">
  </div> 
   
  <div style="padding:7px; width:700px" class="form-group container">
    <label for="Input rollnum">Student RollNumber</label>
    <input style="text-align:center;" type="text" name="srollnum" class="form-control mt-1" id="Input rollnum" aria-describedby="emailHelp" placeholder="Enter Student RollNumber">
   </div>
   
    <div style="padding:7px; width:700px" class="form-group container">
    <label for="Input grade">Student Grade</label>
    <input style="text-align:center;" type="text" name="sgrade" class="form-control mt-1" id="Input grade" aria-describedby="emailHelp" placeholder="Enter Student Grade">
   </div>
   
    <div style="padding:7px; width:700px" class="form-group container">
    <label for="Input city">Student City</label>
    <input style="text-align:center;" type="text" name="scity" class="form-control mt-1" id="Input city" aria-describedby="emailHelp" placeholder="Enter Student City">
   </div>
   
  <div>
  <div class="text-center"> <button type="submit" class="btn btn-success" style="font-family: 'Arial', sans-serif; font-weight: 5px;">Save</button> </div>
  </div>
  
  </form>
  </div>
</body>
</html>