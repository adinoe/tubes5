<?php
	//Start session * nah ini yang urang maksud dengan session
	session_start();
	
	//Include database connection details
	require_once('config.php');
	
	//Array to store validation errors
	$errmsg_arr = array();
	
	//Validation error flag
	$errflag = false;
	
	//Connect to mysql server *penting, buat ngonekin ke database maneh
	$link = mysql_connect(DB_HOST, DB_USER, DB_PASSWORD);
	if(!$link) {
		die('Failed to connect to server: ' . mysql_error());
	}
	
	//Select database
	$db = mysql_select_db(DB_DATABASE);
	if(!$db) {
		die("Unable to select database");
	}
	
	//Function to sanitize values received from the form. Prevents SQL injection * ga gitu penting. buat security aja
	function clean($str) {
		$str = @trim($str);
		if(get_magic_quotes_gpc()) {
			$str = stripslashes($str);
		}
		return mysql_real_escape_string($str);
	}
	
	//Sanitize the POST values
	$username = clean($_POST['username']);
	$password = clean($_POST['password']);
	
	//Input Validations *mengecek klo misalnya password ato username kosong
	if($username == '') {
		$errmsg_arr = 'Username missing';
		if ($password == '')
		{
			$errmsg_arr = 'Username and Password missing';	
		}
		$errflag = true;
	}
	else
	if($password == '') {
		$errmsg_arr = 'Password missing';
		$errflag = true;
	}
	
	//If there are input validations, redirect back to the login form * buat ngedirect ke suatu page klo misalnya ada yang ga valid ( username kosong mislanya )
	if($errflag) {
		$_SESSION['ERRMSG_ARR'] = $errmsg_arr;
		session_write_close();
		header("location: index.php");
		exit();
	}
	
	//Create query * ini buat ngecek apakah username dan password yang maneh masukin ada ga di database.
	$qry="SELECT * FROM user WHERE username='$username' AND password='$password'";
	$result=mysql_query($qry);
	
	//Check whether the query was successful or not
	if($result) {
		if(mysql_num_rows($result) == 1) {
			//Login Successful
			session_regenerate_id();
			$member = mysql_fetch_assoc($result);
			// masukin ke session username dan password yang udah bener
			$_SESSION['SESS_USERNAME'] = $member["username"];
			$_SESSION['SESS_PASSWORD'] = $member["password"];
			session_write_close();
			// ngedirect ke page yang diinginkan jika login berhasil dan melempar parameter username.
			$location = sprintf("location:dashboard.php?username=%s",mysql_real_escape_string($_SESSION['SESS_USERNAME']));
			header($location);
			exit();
		}else {
			//Login failed
			$errmsg_arr = 'Username or Password didn\'t match';
			$_SESSION['ERRMSG_ARR'] = $errmsg_arr;
			session_write_close();
			header("location:index.php");
			exit();
		}
	}else {
		die("Query failed");
	}
?>