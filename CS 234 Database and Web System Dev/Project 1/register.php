<!DOCTYPE html>
<!--
Author:      John West
File Name:   register.html
Date:        3/20/2014
Description: html file to test regular exspressions.
-->
<html>
    <head>
        <title>Register</title>
		<link rel="stylesheet" type="text/css" href="styleFormat.css" /> 
		<img src ="images/banner1.jpg" alt="home" align=top align=right>
    </head>
    <body>
	
	<span id= "bar2">Not logged in</span>
		<!-- navigation menu -->
	<ul>
        <li><a href="index.html">Home page</a>
	   <li><a href="login.html">Login</a>
	   <li><a href="catalog.html">catalog</a>
	   <li><a href="checkout.php">checkout</a> 
	</ul>   
	<!-- Logn page -->
	<h1>Register</h1>
	<div id= "indent">
	<?php
//Author:      John West
//File Name:   pwdDB.php
//Date:        4/30/2014
//Description: The password database for my project

//establish connection
$host = 'home.cs.siue.edu';
$username = 'jowest';
$pwd = 'zn6TSSdZ';
$dbName= 'jowest';
$con = mysql_connect($host, $username, $pwd);

if (!$con){
die('could not connect: ' . mysql_error());
}

//select database
$db = @mysql_select_db($dbName, $con)
	or die(mysql_error());


//BUTTON CONTROLS FROM ADMIN.HTML

//register.html buttons
if($_POST["reg"]){ //if button is selected, delete all items in table
$uID = rand(1,999999999);
	
			$sql = "INSERT INTO User (uID, uType, uName, uPwd, uEmail )
					VALUES ('$uID', 'user', '$_POST[username]', '$_POST[pwd1]', '$_POST[email]')";
					
			if (!mysql_query($sql,$con)) 
			die('Error: ' . mysql_error()); 
			echo "1 record added";
	}
	
	mysql_close($con);
?>
	
	
	<script src="password.js"></script>
    <form action= "register.php" id="myForm" onsubmit="return checkForm(this);" method = "POST">
		<p>Username: 		<input id="field_username" type="text" 	   name="username"></p>
		<p>Password: 		<input id="field_pwd1" 	  type="password" name="pwd1"></p>
		<p>Confirm Password:<input id="field_pwd2"    type="password" name="pwd2"></p>
		<p>Email: 			<input id="field_email"   type="text" 	   name="email"></p>
		<p><input type="submit" name = "reg" value="Submit"></p>
	</form>
	</div>
	
	Already a member?  <a href="login.php" target="_blank">Login now!</a>
    </body>
</html>