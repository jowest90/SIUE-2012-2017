<!DOCTYPE html>
<!--
Author:      John West
File Name:   login.html
Date:        3/20/2014
Description: html file to test regular exspressions.
-->
<html>
    <head>
        <title>Login</title>
		<link rel="stylesheet" type="text/css" href="styleFormat.css" /> 
		<img src ="images/banner1.jpg" alt="home" align=top align=right>
    </head>
    <body>
	
	<span id= "bar2">Not logged in</span>
	
		<!-- navigation menu -->
	<ul>
       <li><a href="index.php">Home page</a>
	   <li><a href="register.php">Register</a> 
	   <li><a href="catalog.php">catalog</a>
	   <li><a href="checkout.php">checkout</a> 
	</ul>    
	<!-- Logn page -->
	   <h1>Login</h1>
	   <!-- login form -->
	   <div id= "indent">
	<form id="myForm" action="pwdDB.php" method="post"><!-- start -->
		<p>Username: <input id="field_username" type="text" name="username"></p>
		<p>Password: <input id="field_pwd1" type="password" name="pwd1"></p>
		<p><input type="submit" name = "login" value="Submit"></p>
	</form><!-- end -->
	
	<form class="buttons" action="catalog.html" method="post">
         <input type="submit" value="unionPacific" name="username">
         <input type="submit" value="GatewayEastern" name="username">
      </form>
	  
	  <form class="buttons" action="admin.php" method="post">
         <input type="submit" value="AdminConductor" name="username">
      </form>
        Not a meber yet?  <a href="register.php" target="_blank">Join now!</a>
		</div>
    </body>
</html>