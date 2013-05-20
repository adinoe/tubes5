<?php 
	include_once 'config.php';
	session_start();
	error_reporting(E_ERROR|E_WARNING);
?>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lisio</title>
<link href="css/main.css" rel="stylesheet" type="text/css">
<meta name="viewport" content="width=device-width,minimum-scale=1.0, maximum-scale=1.0" />
<link rel="stylesheet" type="text/css" media="only screen and (max-device-width: 480px) and (orientation:portrait) " href="css/small-device-320.css" />
<link rel="stylesheet" type="text/css" media="only screen and (max-device-width: 480px)  and (orientation:landscape) " href="css/small-device-480.css" />
<script type="text/javascript" src="js/custom.js" ></script>
<link rel="icon" href="img/icon.png" sizes="32x32">
</head>
<body class="login_page">
	<div id="container">
      <header class="login_header">
          <div class="logo_title">
              <a class="logo_full" href="index.php"><img src="img/Lisio.png" alt="Lisio"></a>
              <a href="index.php"><h2>Lisio</h2></a>
          </div>
          <a class="feature_button button_trans" href="#feature">Feature</a>
          
      </header>
      
      <div class="login_main">
        <div class="login_box box_blue trans_all">
        	<?php if ($_SESSION['ERRMSG_ARR'] != '') { ?>
		    <div id="message" class="message_er lgn_msg_er trans_all"> <?php echo $_SESSION['ERRMSG_ARR']; ?></div><?php } ?>
            <div class="login_wrapper box_white trans_all">
                <form method="post" action="login-exec.php">
                    <div class="separator">
                    <span class="icon_username"></span><input type="text" class="transparent" placeholder="Username" name="username" id="username">
                    </div>
                    <div class="separator">
                    <span class="icon_password"></span><input type="password" class="transparent" placeholder="Password" name="password" id="password" >
                    </div>
                    <input class="login_button trans_opacity button_bluegrad" type="submit" value="Login" id="sign_in_button">
                </form>
                <p>Don't have account ? <span><a href="register.php">Register Here</a></span></p>           
            </div>
        </div>
        <div class="line"></div>
      	<div  id="feature" class="feature">
        	<div class="feature_title">
            	<h2 >Welcome to <b>Lisio</b></h2>
                <h3>provide simple and userfriendly to-do list is our main objective</h3>
            </div>
            <div class="intro box_white trans_all">
                <img src="img/bg3.jpg" alt="Simple">
                <h2>Simple to-do List</h2>
            </div>
            <div class="intro box_white trans_all">
                <img src="img/bgred1.jpg" alt="Interactive">
                <h2>Interactive Design</h2>
            </div>
        </div>
      </div>
      <footer class="login_footer">
          <h2>Copyright @ Lisio 2013</h2>
      </footer>
      </div>
</body>
</html>
<?php
	mysql_close($link);
	session_destroy();
?>