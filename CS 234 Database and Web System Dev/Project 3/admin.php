<!DOCTYPE html>
<!--
Author:      John West
File Name:   admin.php
Date:        3/23/2014
Description: The admin page to add/remove items, delete users, and adjust invetory
-->
<html>
    <head>
        <title>Admin</title>
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
	   <li><a href="catalog.php">Catalog</a>
	   <li><a href="checkout.php">Checkout</a> 
	</ul>
	
	<!-- Main page -->
	<h1>Administrator<br></h1>

<!-- Begin php database -->
<div id= "indent">	
<?php
//Entities:
//Trains - a locomotive.
//User - for logging in

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

//admin.php buttons

//Trains Table
/*
Attributes:
Name (tName)
Railroad Company (tRailCo)
Scale (tScale)
Locomotive (tLoc)
Quantity (tQty)
ID (tID)
price
*/
if($_POST["tr1"]){ //if button is selected, create table
			$sql = "CREATE TABLE Trains (
					tID CHAR(8) NOT NULL, CONSTRAINT train_pkey PRIMARY KEY (tID), tName CHAR(100), tRailCo CHAR(30), tScale CHAR(2), tLoc CHAR(10), tQty INT, price DOUBLE )";
			if( mysql_query($sql)){
			echo " Trains table created";
			}
			else{
			echo " table not created";
			}
		
	}if($_POST["tr2"]){ //if button is selected, drop table
			$sql2 = "DROP TABLE IF EXISTS Trains";

			if( mysql_query($sql2)){
			echo " Trains table exterminated";
			}
			else{
			echo "Trains table not deleted";
			}
		
	}if($_POST["tr3"]){ //if button is selected, add steam
			$sql = "INSERT INTO Trains 
						VALUES ('92060117', '080  Tsunami', 'Northern Pacific', 'HO', 'Steam', '10', '399.98')";
			if( mysql_query($sql)){//if query was a success
			echo " item 1 inserted to Trains table";
		}//end if
			else{
			echo " item 1 not inserted to Trains table";
		}
	} if($_POST["tr4"]){ //if button is selected, add diesel
			$sql = "INSERT INTO Trains 
						VALUES ('9207480', 'Proto N Diesel EMD GP60', 'Union Pacific', 'N', 'Diesel', '20', '99.98')";
			if( mysql_query($sql)){//if query was a success
			echo " item 2 inserted to Trains table";
		}//end if
			else{
			echo " item 2 not inserted to Trains table";
		}
	}if($_POST["tr5"]){ //if button is selected, delete all items in table
			$sql = "DELETE FROM Trains";
			if( mysql_query($sql)){
			echo " entities deleted from Trains table";
			}
			else{
			echo " entities from Trains table are still alive";
			}
	}if($_POST["tr6"]){ //if button is selected, delete all items in table
	
			$sql = "INSERT INTO Trains (tID, tName, tRailCo, tScale, tLoc , tQty , price )
					VALUES ('$_POST[tID]', '$_POST[tName]', '$_POST[tRailCo]', '$_POST[tScale]', '$_POST[tLoc]', '$_POST[tQty]', '$_POST[price]')";

			if (!mysql_query($sql,$con)) 
			die('Error: ' . mysql_error()); 
			echo "record added";
	}

/*
Attributes:
ID (uID)
type (uType)
password (uPwd)
Email (uEmail)
*/
if($_POST["u1"]){ //if button is selected, create table
			$sql = "CREATE TABLE User ( 
					uID CHAR(8) NOT NULL, CONSTRAINT train_pkey PRIMARY KEY (uID), uType CHAR(5), uName CHAR(50), uPwd CHAR(32), uEmail CHAR(100) )";
			if( mysql_query($sql)){
			echo " User table created";
			}
			else{
			echo " User table not created";
			}
		
	}if($_POST["u2"]){ //if button is selected, drop table
			$sql2 = "DROP TABLE IF EXISTS User";

			if( mysql_query($sql2)){
			echo " User table exterminated";
			}
			else{
			echo "User table not deleted";
			}
		
	}if($_POST["u3"]){ //if button is selected, add steam
			$sql = "INSERT INTO User 
						VALUES ('00000001', 'user', 'jowest', 'a9B5@c', 'test@email.com' )";

			if( mysql_query($sql)){//if query was a success
			echo " User 1 inserted to User table";
		}//end if
			else{
			echo " User 1 not inserted to User table";
		}
	} if($_POST["u4"]){ //if button is selected, add diesel
			$sql = "INSERT INTO User 
						VALUES ('00000002', 'admin', 'dbouvie', 'xyzzy', 'liger@siue.edu')";

			if( mysql_query($sql)){//if query was a success
			echo " User 2 inserted to User table";
		}//end if
			else{
			echo " User 2 not inserted to User table";
		}
	}if($_POST["u5"]){ //if button is selected, delete all items in table
			$sql = "DELETE FROM User";

			if( mysql_query($sql)){
			echo " entities from User table deleted";
			}
			else{
			echo " entities from User table are still alive";
			}
	}if($_POST["u6"]){ //if button is selected, delete all items in table
	
			$sql = "INSERT INTO User (uID, uType, uName, uPwd, uEmail )
					VALUES ('$_POST[uID]', '$_POST[uType]', '$_POST[uName]', '$_POST[uPwd]', '$_POST[uEmail]')";
					
			if (!mysql_query($sql,$con)) 
			die('Error: ' . mysql_error()); 
			echo "1 record added";
	}	
	
	mysql_close($con);
?>
</div>
<!-- end of php -->

	<!-- Trains Table -->
	<h1>Trains Table:<br></h1>
	<div id= "indent">
	<div id= "box2">
	<form action="admin.php" method="POST">
		<input type="submit" name="tr1" value="Create Trains Table" >
		<input type="submit" name="tr2" value="Drop Table" ><br>
		Insert Item:<br>
		<input type="submit" name="tr3" value="Add Steam Train" >
		<input type="submit" name="tr4" value="Add Diesiel Train" >
		<input type="submit" name="tr5" value="Delete all" >
	</form>
	<?php
$result = mysql_query($con,"SELECT * FROM Trains");
			echo "<table border='1'>
			<tr>
			<th>tID</th>
			<th>tName</th>
			<th>tRailCo</th>
			<th>tScale</th>
			<th>tLoc</th>
			<th>tQty</th>
			<th>price</th>
			</tr>";

		while($row = mysql_fetch_array($result)) {

			echo '<tr>
			<td>'.$result["tID"].'</td>
			<td>'.$result["tName"].'</td>
			<td>'.$result["tRailCo"].'</td>
			<td>'.$result["tScale"].'</td>
			<td>'.$result["tLoc"].'</td>
			<td>'.$result["tQty"].'</td>
			<td>'.$result["price"].'</td>
			</tr>
			</table>';
		}

		echo "</table>";
	?>
	</div>
	</div>
	
	<!-- User Table -->
	<h1>User Table:<br></h1>
	<div id= "indent">
	<div id= "box2">
	<form action="admin.php" method="POST">
		<input type="submit" name="u1" value="Create User Table" >
		<input type="submit" name="u2" value="Drop Table" ><br>
		Insert Item:<br>
		<input type="submit" name="u3" value="Add User 1" >
		<input type="submit" name="u4" value="Add User 2" >
		<input type="submit" name="u5" value="Delete all" >
	</form>
	<?php
$result = mysql_query($con,"SELECT * FROM Trains");
			echo "<table border='1'>
			<tr>
			<th>ID</th>
			<th>Type</th>
			<th>Name</th>
			<th>Pwd</th>
			<th>Email</th>
			</tr>";

		while($row = mysql_fetch_array($result)) {
		  echo "<tr>";
		  echo "<td>" . $row['uID'] . "</td>";
		  echo "<td>" . $row['uType'] . "</td>";
		  echo "<td>" . $row['uName'] . "</td>";
		  echo "<td>" . $row['uPwd'] . "</td>";
		  echo "<td>" . $row['uEmail'] . "</td>";
		  echo "</tr>";
		}

		echo "</table>";
	?>
	</div>
	</div>
    </body>
</html>