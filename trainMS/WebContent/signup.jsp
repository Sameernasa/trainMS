<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/1d1e89cd34.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
 
</head>
<body class="text-center">
	<form class="form-signin" action="index.html" method="post" style="max-width:800px;">
      <i class="fas fa-train fa-5x"></i>
      <h1 class="h3 mb-3 font-weight-normal">Sign up for free</h1>
      <div class="row mar" style="padding:10px;">
        <div class="col-6">
          <label for="inputEmail" class="sr-only">First Name</label>
          <input type="text" class="form-control" placeholder="First Name" required autofocus>
        </div>
        <div class="col-6 ">
          <label for="inputPassword" class="sr-only">Last Name</label>
          <input type="text" class="form-control" placeholder="Last Name" required>
        </div>
      </div>
      <div class="row mar" style="padding:10px;">
        <div class="col-6">
          <label for="inputPassword" class="sr-only">Date of birth</label>
          <input type="date" class="form-control" placeholder="DOB(dd/mm/yyyy)" required>
        </div>
        <div class="col-6 ">
          <label for="inputEmail" class="sr-only">Email address</label>
          <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        </div>
      </div>
      <div class="row mar" style="padding:10px;">
        <div class="col-6 ">
          <label for="inputPassword" class="sr-only">Password</label>
          <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        </div>
        <div class="col-6 ">
          <input type="password" id="inputPassword" class="form-control" placeholder="Confirm-Password" required>
        </div>
      </div>
      <div class="row" style="padding:10px;">
        <div class="col-6">
          <label for="inputPassword" class="sr-only">Gender</label>
          <select class="form-control" name="">
            <option value="">Gender</option>
            <option value="">Male</option>
            <option value="">Female</option>
          </select>
          <!-- Gender <input type="radio" name="gender" value="Male" > Male
          <input type="radio" name="gender" value="Female" > Female -->
        </div>
        <div class="col-6" >
          <label for="inputPassword" class="sr-only">Security question</label>
          <input type="text" name="" value="" class="form-control" placeholder="What is your nickname?">
        </div>
      </div>
      <div class="" style="padding:10px;">
        <label for="inputPassword" class="sr-only">Address</label>
        <textarea name="name" rows="4" cols="70" placeholder="Address" class="form-control"></textarea>
      </div>
  <button class="btn btn-lg btn-primary " type="submit">Sign up</button>
  <p class="mt-5 mb-3 text-muted">&copy; 2020</p>
    </form>
	
</body>
</html>