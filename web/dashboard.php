<?php 
	include_once 'config.php';
 /*?>session_start();
	if ( $_SESSION['SESS_USERNAME'] == null )
	{
		header("location:index.php");
	}<?php */
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
                	<a class="list_active trans_all" href="#" >
                	<span class="icon_category"></span>
                    <span>Category A</span>
                    </a>
                </li>
                <li>
                	<a href="#" class="trans_all">
                	<span class="icon_category"></span>
                    <span>Category B</span>
                    </a>
                </li>
                <li>
                	<a href="#" class="trans_all">
                	<span class="icon_category"></span>
                    <span>Category C</span>
                    </a>
                </li>
                <li>
                	<a href="#openModal" class="trans_all">
                	<span class="icon_new_category"></span>
                    <span>Add New Category</span>
                    </a>
                </li>
            </ul>
        </nav>
        </div>
        <div class="sidebar_left">
        	<a href="createtask.html" class="button_cupidblue trans_opacity new_task">New Task</a>
        	<div id="wrapper">
                    <div class="pin">
                    	<a href="detailtask.php">
                        <h3 class="title">Task 1</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                        </a>
                    </div>
                    <div class="pin">
                    	<a href="detailtask.php">
                    	<h3 class="title">Task 2</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                         </a>
                    </div>
                    <div class="pin">
                    	<a href="detailtask.php">
                    	<h3 class="title">Task 3</h3><h6 class="date">22 - Februari - 2012</h6>
                         <h6 class="tag">Tag : Matematika , Biology</h6>
                         </a>
                    </div>
                    <div class="pin">
                    	<a href="detailtask.php">
                        <h3 class="title">Task 4</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                        </a>
                    </div>	
                    <div class="pin">
                    	<a href="detailtask.php">
                        <h3 class="title">Task 5</h3><h6 class="date">22 - Februari - 2012</h6>
                       <h6 class="tag">Tag : Matematika , Biology</h6>
                       </a>
                    </div>
                    <div class="pin">
                    	<a href="detailtask.php">
                    	<h3 class="title">Task 6</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                        </a>
                    </div>
                    <div class="pin">
                    	<a href="detailtask.php">
                    	<h3 class="title">Task 7</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                        </a>
                    </div>
                    <div class="pin">
                    	<a href="detailtask.php">
                    	<h3 class="title">Task 8</h3><h6 class="date">22 - Februari - 2012</h6>
                        <h6 class="tag">Tag : Matematika , Biology</h6>
                        </a>
                    </div>
            </div>
        </div>
      </div>
      
   </div>
<div id="openModal" class="modalDialog trans_all">
	<div class="trans_all">
		<a href="#close" title="Close" class="close">X</a>
        <form action="catch.php?param=1" method="post">
            <input type="text" placeholder="Category Title" name="title">
            <input type="text" placeholder="Add Assignee" name="assignee">
            <input type="submit" value="Submit">
        </form>
	</div>
</div>
</body>
</html>
<?php
	mysql_close($link);
?>