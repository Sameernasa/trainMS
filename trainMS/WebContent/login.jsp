<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script src="https://kit.fontawesome.com/1d1e89cd34.js" crossorigin="anonymous"></script>
<link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/sign-in/">
!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
<meta name="theme-color" content="#563d7c">
<title>Insert title here</title>
<style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body class="text-center">
<%String s=""; %>
	<form class="form-signin" action="Mainservlet" method="post">
      <i class="fas fa-train fa-5x"></i>
  <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
  <label for="inputEmail" class="sr-only">Email address</label>
  <input type="email" id="inputEmail" class="form-control" name="user_name" placeholder="Email address" required autofocus>
  <label for="inputPassword"  class="sr-only" >Password</label>
  <input type="password" id="inputPassword" name="pass" class="form-control" placeholder="Password" required>
  <button class="btn btn-lg btn-primary btn-block" type="submit" name="action" value="login">Sign in</button>
  <%s=(String)request.getAttribute("notfound"); %>
  <%=s %><br>
  <a href="home.jsp">home</a>  <a href="signup.jsp">sign up</a>
  <p class="mt-5 mb-3 text-muted">&copy; 2020</p>
 
</form>
</body>
</html>