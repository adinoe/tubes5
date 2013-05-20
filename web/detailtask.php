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
                  <form >		    
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
                        <h3 class="title">Task 1</h3>
                    </div>
                    <div class="pin">
                    	<h4>Due Date :</h4>
                        
                        <div id="calendar" class="det_content"><h4 id="det_duedate_content" class="det_content">22 - Februari - 2012 </h4></div>
                        <button id="det_ddate" class="button_cupidblue trans_opacity" onClick="load_calendar_id('calendar',2012,2100);">Edit</button>
                    </div>
                    <div class="pin">
                    	<h4>Attachment :</h4>
                        <video width="320" height="240" controls>
                          <source src="attach/video.mp4" type="video/mp4">
                        Your browser does not support the video tag.
                        </video>
                        <br>
                    </div>
                    <div class="pin">
                    	<h4>Description :</h4>
                        <br>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
                            Sed feugiat consectetur pellentesque. Nam ac elit risus, 
                            ac blandit dui. Duis rutrum porta tortor ut convallis.
                            Duis rutrum porta tortor ut convallis.
                        </p>
                    </div>
                    <div class="pin">
                    	<h4>Comments :</h4>
                        <br>
                        <div class="det_comment">
                            <h6>Agung :</h6>
                            <p>Sed feugiat consectetur pellentesque. Nam ac elit risus, 
                                ac blandit dui. Duis rutrum porta tortor ut convallis.
                                Duis rutrum porta tortor ut convallis.</p>
                            <br>
                        </div>
                        <textarea class="det_input_comment"></textarea>
                        <button id="det_comment_but" class="button_cupidblue trans_opacity">Submit</button>
                    </div>
                    <div class="pin">
                    	<h4>Asignee :</h4>
                        <br>
                        <div id="det_asignee">
                        	<h6 id="det_asignee_content" class="det_content">Agung, Dwi, Lambang, Gito, Santosa</h6>
                        </div>
                        <button id="det_asignee_button" class="button_cupidblue trans_opacity" onClick="edit_fieldtext('det_asignee','det_asignee_content');">Edit</button>
                    </div>
                    <div class="pin">
                    	 <h4>Tags :</h4>
                         <br>
                         <div id="det_tags">
                         	<h6 id="det_tags_content" class="det_content">Matematika , Biology</h6>
                         </div>
                         <button id="det_tags_button" class="button_cupidblue trans_opacity" onClick="edit_fieldtext('det_tags','det_tags_content');">Edit</button>
                    </div>
            </div>
        </div>
      </div>
   </div>
</body>
</html>