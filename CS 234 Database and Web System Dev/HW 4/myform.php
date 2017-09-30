<!DOCTYPE html>
<!--
Author:      John West
File Name:   myform.php
Date:        2/1/2014
Description: php file to store the info.
-->
<html>
<body>
<?php
if($_POST["submit"]){ //if button is selected, create cookie
			echo "cookie successful"
			setcookie("name", "$_POST[name]", time()+7200);
			echo $_COOKIE["name"];
}else{
			echo "failed to make cookie"
}
?>
</body>
</html>