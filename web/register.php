<?php 
	include_once 'config.php';
?>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lisio</title>
<link href="css/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/custom.js" ></script>
<link rel="icon" href="img/icon.png" sizes="32x32">
</head>
<body class="register_page" onLoad="load_calendar();">
	<div id="container">
      <header class="register_header">
          <div class="register_title">
              <a class="logo_full" href="index.php"><img src="img/Lisio.png" alt="Lisio"></a>
          </div>
      </header>
      <div class="register_main">
        <div class="register_box box_blue">
            <div class="register_wrapper box_white">
                <form onKeyDown="submit_val();" onClick="submit_val();" onKeyUp="submit_val();" onKeyPress="submit_val();" onReset="submit_val();" onMouseOver="submit_val()" onMouseUp="submit_val();" method="post" action="catch.php?param=register">
                    <div class="separator">
                    <span class="icon_username"></span><input type="text" class="transparent" placeholder="Username" name="username" id="username" onChange="username_val(this);" onFocus="username_val(this);" onKeyDown="username_val(this);" onKeyUp="username_val(this);" onSelect="username_val(this);">
                    <span id="username_error" class="message_er rg_msg_er trans_all">error</span>
                    <span id="username_okay" class="message_ok rg_msg_ok trans_all">valid</span>
                    </div>
                    <div class="separator">
                    <span class="icon_password"></span><input type="password" class="transparent" placeholder="Password" name="password" id="password" onChange="password_val(this);" onFocus="password_val(this);" onKeyDown="password_val(this);" onKeyUp="password_val(this);" onSelect="password_val(this);" >
                    <span id="password_error" class="message_er rg_msg_er trans_all">error</span>
                    <span id="password_okay" class="message_ok rg_msg_ok trans_all">valid</span>
                    </div>
                    <div class="separator">
                    <span class="icon_password"></span><input type="password" class="transparent" placeholder="Confirm Password" name="confirm_password" id="confirm_password" onChange=c"password_val(this);" onFocus="cpassword_val(this);" onKeyDown="cpassword_val(this);" onKeyUp="cpassword_val(this);" onSelect="cpassword_val(this);">
                    <span id="cpassword_error" class="message_er rg_msg_er trans_all">error</span>
                    <span id="cpassword_okay" class="message_ok rg_msg_ok trans_all">valid</span>
                    </div>
                    <div class="separator">
                    <span class="icon_username"></span><input type="text" class="transparent" placeholder="Fullname" name="fullname" id="fullname"  onKeyUp="fullname_val(this);" >
                    <span id="fullname_error" class="message_er rg_msg_er trans_all">error</span>
                    <span id="fullname_okay" class="message_ok rg_msg_ok trans_all">valid</span>
                    </div>
		            <div class="separator">
                        <span class="icon_calendar"></span>
                        <div id="calendar" class="calendar">  
                        </div>
                        <span id="date_error" class="message_er rg_msg_er trans_all">error</span>
	                    <span id="date_okay" class="message_ok rg_msg_ok trans_all">valid</span>
                    </div>
                    <div class="separator">
                    <span class="icon_email"></span><input type="text" class="transparent" placeholder="Email" name="email" id="email" onKeyUp="email_val(this);" onKeyDown="email_val(this);" onChange="email_val(this);" onFocus="email_val(this);" onSelect="email_value(this);">
                    <span id="email_error" class="message_er rg_msg_er trans_all">error</span>
                    <span id="email_okay" class="message_ok rg_msg_ok trans_all">valid</span>
                    </div>
                    <div class="separator">
                        <input type="file" accept="image/jpg,image/jpeg" id="avatar" onChange="avatar_val(this);" onKeyDown="avatar_val(this);" onKeyUp="avatar_val(this);" onFocus="avatar_val(this);" onSelect="avatar_val(this);" >
                        <span id="avatar_error" class="message_er rg_msg_er trans_all">error</span>
	                    <span id="avatar_okay" class="message_ok rg_msg_ok trans_all">valid</span>
                    </div>
                    <div class="register_button_wrapper">
                    	<input class="register_button button_bluegrad_dis trans_all" type="submit" value="Register" id="register_button" disabled="disabled" >
                    </div>
                </form>   
                <p>Already have account ? <span><a href="index.php">Log In Here</a></span></p> 
            </div>
        </div>
        <div class="line"></div>
        </div>
      <footer class="login_footer">
          <h2>Copyright @ Lisio 2013</h2>
      </footer>
      </div>
</body>
</html>
<?php
	mysql_close($link);
?>