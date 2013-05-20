<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lisio</title>
<link href="css/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/custom.js" ></script>
<link rel="icon" href="img/icon.png" sizes="32x32">
</head>
<body class="dashboard_page" onLoad="load_calendar_range(2013,2100);">
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
                	<a class="list_active" href="#">
                	<span class="icon_category"></span>
                    <span>Category A</span>
                    </a>
                </li>
                <li>
                	<a href="#">
                	<span class="icon_category"></span>
                    <span>Category B</span>
                    </a>
                </li>
                <li>
                	<a href="#">
                	<span class="icon_category"></span>
                    <span>Category C</span>
                    </a>
                </li>
                <li>
                	<a href="#" onClick="creatediv()">
                	<span class="icon_new_category"></span>
                    <span>Add New Category</span>
                    </a>
                </li>
            </ul>
        </nav>
        </div>
        <div class="sidebar_left">
        	<div id="wrapper">
                    <div class="pin">
                   <form onKeyDown="ct_val();" onClick="ct_val();" onKeyUp="ct_val();" onKeyPress="ct_val();" onReset="ct_val();">
                    	<h3>Create New Task</h3>
                        <br><hr>
                        <div class="create_task">
                            <div>
                            	<span class="ct_label">Title :</span>
                                <span class="ct_username"><input type="text" class="ct_in_text" id="ct_title" onKeyDown="title_val(this);" onClick="title_val(this);" onChange="title_val(this);" onKeyUp="title_val(this);" onFocus="title_val(this);"></span>
                                <span id="title_error" class="ct_message_er message_er">error</span>
			                    <span id="title_okay" class="ct_message_ok message_ok">valid</span>
                            </div>
                            <div>
                                <span class="ct_label">Due Date :</span>
                                <span id="calendar" class="ct_fullname">
                                </span>
                                <span id="date_error" class="message_er ct_message_er ">error</span>
	                  			<span id="date_okay" class="message_ok ct_message_ok ">valid</span>
                            </div>
                            <div>
                            	<span class="ct_label">Attachment :</span>
                                <span class="gen_email"><input type="file" class="ct_in_text" accept="image/*,video/*,application/*" ></span>
                            </div>
                            <div>
                            	<span class="ct_label">Description :</span>
                                <span class="gen_dateofbirth"><textarea class="ct_in_textarea" id="ct_description"></textarea></span>
                            </div>
                            <div>
                            	<span class="ct_label">Asignee :</span>
                                <span class="gen_dateofbirth"><input type="text" class="ct_in_text" id="ct_asignee"></span>
                            </div>
                            <div>
                            	<span class="ct_label">Tags :</span>
                                <span><input type="text" class="ct_in_text" id="ct_tags"></span>
                            </div>
                        </div>
                    </div>
                    <button class="button_cupidblue edit_button trans_opacity" onClick="create_task()">Submit</button>
                </form>
            </div>
        </div>
      </div>
   </div>
</body>
</html>