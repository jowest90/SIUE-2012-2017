<!DOCTYPE html>
<!--
Author:      John West
File Name:   checkout.php
Date:        3/23/2014
Description: to checkout items
-->

<html>
    <head>
        <title>Checkout</title>
		<link rel="stylesheet" type="text/css" href="styleFormat.css" /> 
		<img src ="images/banner1.jpg" alt="home" align=top align=right>
    </head>
    <body>
	
	<span id= "bar2">Not logged in</span>
	<!-- navigation menu -->
    <ul>
       <li><a href="index.php">Home page</a>
	   <li><a href="login.php">Login</a>
	   <li><a href="register.php">Register</a> 
	   <li><a href="catalog.php">catalog</a>
	</ul>    
	<!-- Main page -->
	<div id="body">
	<h1>Checkout:</h1>
	<div id= "indent">
	You bought:
	<div id= "box 2">
<?php
//Database for Trains
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

if($_POST["buy"]){ //if button is selected, create table
			$sql = "";
			if( mysql_query($sql)){
			echo " Trains table updated";
			}
			else{
			echo " table not updated";
			}
		
	}

mysql_close($con);

//Cookies
if($_POST["shp1"]){ //if button is selected, create table
			setcookie("train", "USRA 0-8-0 - Tsunami(R) Sound & DCC", time()+7200);
			echo $_COOKIE["train"];
}if($_POST["shp2"]){ //if button is selected, create table
			$train2 = $_POST["shp2"];
			setcookie("train2", "Proto N Hobby Quality Diesel EMD GP60 ", time()+7200);
			echo $_COOKIE["train2"];
}
 ?>
	<form action="checkout.php" method="POST">
		<input type="submit" name="delete" value="clear cart" >
		</div>
		<form action="checkout.php" method="POST">
		<input type="submit" name="buy" value="buy" >
	</div>
	<?php
	// set the expiration date to one hour ago
	setcookie("Steam", "USRA 0-8-0 - Tsunami(R) Sound & DCC", time()-7200);
	setcookie("Diesel", "Proto N Hobby Quality Diesel EMD GP60 ", time()-7200);
	?>
	
	
    </body>
</html>