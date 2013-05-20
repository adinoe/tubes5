<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lisio</title>
<link href="css/main.css" rel="stylesheet" type="text/css">
<link rel="icon" href="img/icon.png" sizes="32x32">
<script type="text/javascript" src="js/custom.js"></script>
</head>
<body class="dashboard_page">
	<div id="container">
      <header class="header">
          	  <a class="logo_wrapper" href="dashboard.php">
              	<span class="icon_logo"></span>
                <h3 class="trans_all">Lisio</h3>
              </a>
              <section class="search_eng">
                  <form>		    
                      <input type="search" placeholder="Search...">		    	
                      <button>Search</button>
                  </form>
              </section>
              <nav>
              	<ul id="top_nav" >
                	<li><a class="trans_all" href="dashboard.php">Home</a></li>
                    <li><a class="trans_all" href="profil.php">Profil</a></li>
                    <li><a class="trans_all" href="index.php">Log Out</a></li>
                </ul>
              </nav>
      </header>
      <div class="dashboard_main">
      	<div class="sidebar_right">
        <nav id="list">
        	<ul>
            	<li>
                	<a class="" href="#general" >
                	<span class="icon_geni"></span>
                    <span>General Account Setting</span>
                    </a>
                </li>
                <li>
                	<a class="" href="#password">
                	<span class="icon_genp"></span>
                    <span>Password Setting</span>
                    </a>
                </li>
                <li>
                	<a class="" href="#completed">
                	<span class="icon_taskc"></span>
                    <span>Completed Task</span>
                    </a>
                </li>
                <li>
                	<a class="" href="#uncompleted">
                	<span class="icon_task"></span>
                    <span>Uncompleted Task</span>
                    </a>
                </li>
            </ul>
        </nav>
        </div>
        <div class="sidebar_left">
        	<div id="wrapper">
            	<span id="general" class="anchor"></span>
           		<div class="pin">
                	<h2 class="gen_title">General Account Settings</h2>
                    <hr>
                    <img class="gen_avatar" src="img/avatar.jpg" alt="avatar">
                    <div class="general_info">
                    	<div>
                    	<span class="gen_label">Username :</span><span class="gen_username">comeokuhibiuap</span>
                        </div>
                        <div>
                        <span class="gen_label">Fullname :</span><span class="gen_fullname">Steven Gerrard</span>
                        </div>
                        <div>
                        <span class="gen_label">Email :</span><span class="gen_email">steven_gerrard@liverpool.com</span>
                        </div>
                        <div>
                        <span class="gen_label">Date of Birth :</span><span class="gen_dateofbirth">1980 - January - 20</span>
                        </div>
                        <div>
                        <span class="gen_label">Upload Avatar :</span><span><input type="file"></span>
                        </div>
                        <div>
                        	<button class="button_cupidblue edit_button trans_opacity" >Edit Profil</button>
                        </div>
                    </div>
                </div>
                <span id="password" class="anchor" ></span>
                <div class="pin">
                	<h2><a name="password">Password Settings</a></h2>
                    <hr>
                    <div class="password_info">
                    	<div>
                    	<span class="gen_label">Current Password :</span><span class="gen_pass"><input type="text"></span>
                        </div>
                        <div>
                        <span class="gen_label">New Password :</span><span class="gen_npass"><input type="text"></span>
                        </div>
                        <div>
                        <span class="gen_label">Re-Type Password :</span><span class="repass"><input type="text"></span>
                        </div>
                        <div>
                        	<button class="button_cupidblue edit_button trans_opacity" >Edit Password</button>
                        </div>
                    </div>
                </div>
                <span id="completed" class="anchor">aaa</span>
                <h2>Completed Task List</h2>
                <br>
                	 <div class="pin">
                        <h3 class="title">Task 1</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                    	<h3 class="title">Task 2</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                
                    <div class="pin">
                    	<h3 class="title">Task 3</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                        <h3 class="title">Task 4</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>	
                    <div class="pin">
                        <h3 class="title">Task 5</h3><h6 class="date">22 - Februari - 2012</h6>
                       <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                    	<h3 class="title">Task 6</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                    	<h3 class="title">Task 7</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                    	<h3 class="title">Task 8</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div id="uncompleted" class="anchor">aaa</div>
					<h2>Uncompleted Task List</h2>
                    <br>
                     <div class="pin">
                        <h3 class="title">Task 1</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                    	<h3 class="title">Task 2</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                
                    <div class="pin">
                    	<h3 class="title">Task 3</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                        <h3 class="title">Task 4</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>	
                    
                    <div class="pin">
                        <h3 class="title">Task 5</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                    	<h3 class="title">Task 6</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                    	<h3 class="title">Task 7</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
                    <div class="pin">
                    	<h3 class="title">Task 8</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                    </div>
            </div>
                   
        </div>
      </div>
   </div>
</body>
</html>