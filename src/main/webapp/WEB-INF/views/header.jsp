<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Header page</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap Core CSS -->
<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
<!-- Custom CSS -->
<link rel="stylesheet" href="resources/css/stylish-portfolio.css" />
<!-- Custom Fonts -->
<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" />
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<script src="resources/js/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>
<body>
	<!-- Navbar -->
	<nav class="navbar navbar-transparent">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#myNavbar">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="http://localhost:8085/monespace/"><i>Mon
					Espace</i></a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav">
				<li class="active"><a
					href="http://localhost:8085/monespace/home">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Mumbai <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="">Delhi</a></li>
						<li><a href="">Kolkata</a></li>
						<li><a href="">Chennai</a></li>
					</ul></li>
				<li><a href="#">About Us</a></li>
				<li><a href="#">Contact us</a></li>
			</ul>
			<!-- 			<form class="form-inline center"> -->
			<!-- 				<input class="form-control" type="text" placeholder="Search"> -->
			<!-- 				<button class="btn btn-outline-success" type="submit">Search</button> -->
			<!-- 			</form> -->

			<ul class="nav navbar-nav navbar-right">
				<li><a href="http://localhost:8085/monespace/registerForm"><span
						class="glyphicon glyphicon-user"></span> Register</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</div>
	</nav>
	<!-- Navbar Closed-->
</body>
</html>