<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 	<%@include file = "/common/taglib.jsp"%> 
<!doctype html>
<html lang="en">
  <head>
 	<base href="${pageContext.servletContext.contextPath}/">  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.80.0">
    <title>Đăng nhập</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sign-in/">

    <!-- Bootstrap core CSS -->
<link href="resources/bootstrap/assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="resources/bootstrap/sign-in/signin.css" rel="stylesheet">
  </head>
  <body class="text-center">
<main class="form-signin">
  <form>
    <img class="mb-4" src="resources/images/logo.png" alt="" width="150" height="210">
    <h1 class="h3 mb-3 fw-normal">Ký túc xá PTITHCM</h1>
    <label for="inputEmail" class="visually-hidden">Username</label>
    <input type="email" id="inputEmail" class="form-control" placeholder="Tài khoản" required autofocus>
    <label for="inputPassword" class="visually-hidden">Password</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="Mật khẩu" required>
<!--     <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> Remember me
      </label>
    </div> -->
    <button class="w-100 btn btn-lg btn-primary" type="submit">Đăng nhập</button>
    <p class="mt-5 mb-3 text-muted">&copy; Bởi nhóm 3</p>
  </form>
</main>
  </body>
</html>
