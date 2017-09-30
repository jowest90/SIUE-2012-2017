<!DOCTYPE html>
<!--
Author:      John West
File Name:   register.html
Date:        3/20/2014
Description: html file to test regular exspressions.
-->
<html>
    <head>
        <title>test</title>
		<link rel="stylesheet" type="text/css" href="styleFormat.css" /> 
		<img src ="images/banner1.jpg" alt="home" align=top align=right>
    </head>
    <body>
	
	<span id= "bar2">Not logged in</span>
		<!-- navigation menu -->
	<ul>
        <li><a href="index.php">Home page</a>
	   <li><a href="login.php">Login</a>
	   <li><a href="catalog.html">catalog</a>
	   <li><a href="checkout.php">checkout</a> 
	</ul>   
	<!-- Logn page -->
	<h1>Welcome!</h1>
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
if($_POST["login"]){ //if button is selected, delete all items in table
$name = $_POST[username];

$name = stripslashes($name);
$name = mysql_real_escape_string($name);
	
			$sql = "SELECT * FROM User WHERE uName = '$_POST[username]' and uPwd = '$_POST[pwd1]'";
					
			if (!mysql_query($sql,$con)) 
			die('Error: ' . mysql_error()); 
			echo "password recieved";
			
			$result = mysql_query($sql);

echo $row['uPwd'];
			
$hashAndSalt = $result;
echo $hashAndSalt;			
if (password_verify($login, $hashAndSalt)) {
   echo "login success!";
}else {
echo "login failed!";
}
}
	
	mysql_close($con);
?>
    </body>
</html>