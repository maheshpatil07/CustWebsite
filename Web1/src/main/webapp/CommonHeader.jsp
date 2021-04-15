<%@ page language="java" contentType="text/html"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link rel="stylesheet" href="SignUp.css" type="text/css"/>
<style>

ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #332;
}

li 
{
  float: left;
}

li a 
{
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}


li a:hover,.active 
{
  background-color: orange;
}

.active
{
	background-color: #333;
}
.user
{
 	padding-top : 50px;
    padding-bottom: 300px;
}
.user h2
{
	color : white;
	text-align : center;
	font-weight: 800;
}
.product h1
{
	color : #1c8adb;
}

.container h1 
{
	color : #1c8adb;
}

.index
{
padding : 10px;
color : aliceblue;
padding-bottom: 500px;
}

</style>

</head>
<body>


<ul>
  <li><a href="index.jsp">Home</a></li>
  <li><a href="Login.jsp">Sign In</a></li>
  <li><a href="Register.jsp">Sign Up</a></li>
  <li><a href="Product.jsp">Product</a></li>
  <li><a href="#about">About Us</a></li>
</ul>


</body>
</html>