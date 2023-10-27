<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

    <div class="container mt-5">
        <h2 class="container text-danger text-center">User Form</h2>
      <form action="save" method="post">
     <div class="form-group">
      <label for="exampleInputEmail1" class="text-info">Email address</label>
      <input type="email" class="form-control" name="email" aria-describedby="emailHelp" placeholder="Enter email">
  </div>
  <div class="form-group">
      <label for="exampleInputEmail1" class="text-info"> User Name</label>
      <input type="text" class="form-control" name="username" aria-describedby="emailHelp" placeholder="Enter email">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1" class="text-info">Password</label>
    <input type="password" class="form-control " name="password" placeholder="Password">
  </div>
   <div class="container text-center">
     <button type="submit" class="btn btn-primary">Submit</button>
   </div>
  </form>
  <br>
  <div class="container text-center">
     <button type="submit" class="btn btn-success"> <a href="get">Get All Details</a> </button>
   </div>
    </div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>