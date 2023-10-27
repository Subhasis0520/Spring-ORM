<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
<link  rel="stylesheet" href="webapp/resources/css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

   <!--====== ERROR PART START ======-->
<section class="error-area error-one">
   <div class="container">
      <div class="row justify-content-center">
         <div class="col-xxl-7 col-xl-8 col-lg-8">
            <div class="error-content text-center">
               <span class="error-404">Something Went Wrong</span>
               <h5 class="sub-title">Input data is not valid</h5>
               <p class="text">
                  You can redirect to home page
               </p>
               <div class="error-form">
                  <form action="form.jsp">
                     <i class="lni lni-search-alt"></i>
                     <button> Go To Home </button>
                     
                  </form>
               </div>
            </div>
            <!-- error content -->
         </div>
      </div>
      <!-- row -->
   </div>
   <!-- container -->
</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
  </body>
</html>