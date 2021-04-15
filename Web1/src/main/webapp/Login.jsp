<%@ page language="java" contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@include file="CommonHeader.jsp" %>


<form action="LoginCheck" method="post" style="text/css">

  	<div class="container">
    <h1>Sign In</h1>

    <label for="text"><b>User Name</b></label>
    <input type="text" placeholder="Enter User Name" name="username" required>
    
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="passwd" required>
    
    <input id="chkRememberMe" type="checkbox" class="eventtrack" 
    data-event-track="sign_rememberme"><span>Remember me</span>
    
 	<div class="clearfix">
      <button type="reset" class="cancelbtn1">Reset</button>
      <button type="submit" class="signupbtn1">Sign In</button>
    </div>
    
    <div>
    <a id="forgotpassword" href="#">Forgot Password?</a>
    </div>
    
  	</div>
</form>

</body>
</html>