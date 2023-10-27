<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
        <div class="card mx-auto mt-5 bg-warning" style="width: 50%">
           <div class="card-body">
           <div class="container text-center">
           <h3>Application Form</h3>
           </div>

<form action="processForm" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Your Name</label>
    <input type="text" class="form-control" name="name" aria-describedby="emailHelp" placeholder="Enter your name">
    <small id="emailHelp" class="form-text text-muted">We'll never share your name with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Your Id</label>
    <input type="text" class="form-control" name="id" placeholder="enter your id">
  </div>
  <div class="form-group">
    <label for="exampleInputDob">Birth Date</label>
    <input type="text" class="form-control" name="dob" placeholder="dd/mm/yyyy">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect2">Select Course</label>
    <select multiple class="form-control bg-secondary" id="exampleFormControlSelect2" name="courses">
      <option>java</option>
      <option>python</option>
      <option>html</option>
      <option>C++</option>
      <option>Spring Boot</option>
    </select>
  </div>
  <div class="conatiner">
  <label> Gender</label>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="male">
  <label class="form-check-label" for="inlineRadio1">Male</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="female">
  <label class="form-check-label" for="inlineRadio2">Female</label>
</div>
</div>
    <div class="form-group">
    <label for="exampleFormControlSelect1">Select Type</label>
    <select class="form-control bg-info" name="studentType">
      <option>Normal Student</option>
      <option>Old Student</option>
      <option>Teacher</option>
      <option>New Student</option>
      <option>College Stuff</option>
    </select>
  </div>
  
  <div class="container card bg-secondary mt-2">
       
           <div class="card-body ">
            <div class="form-group">
              <label for="exampleInputPassword1" class="container text-center">City</label>
              <input type="text" class="form-control" name="address.city" placeholder="enter your city name">
            </div>
            <div class="form-group">
              <label for="exampleInputPassword1" class="container text-center">State</label>
              <input type="text" class="form-control" name="address.state" placeholder="enter your state name">
            </div>
           </div>
   </div>        
  
  <div class="container text-center mt-2">
         <button type="submit" class="btn btn-success">Submit</button>
    </div>
</form>
</div>
</div>
</div>


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
  </body>
</html>