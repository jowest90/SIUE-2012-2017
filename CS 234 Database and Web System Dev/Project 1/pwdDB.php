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
if($_POST["u6"]){ //if button is selected, delete all items in table
$uID = rand(1,999999999);
	
			$sql = "INSERT INTO User (uID, uType, uName, uPwd, uEmail )
					VALUES ('$uID', 'user', '$_POST[uName]', '$_POST[uPwd]', '$_POST[uEmail]')";
					
			if (!mysql_query($sql,$con)) 
			die('Error: ' . mysql_error()); 
			echo "1 record added";
	}
	
	mysql_close($con);
	header('Location: index.html');
?>