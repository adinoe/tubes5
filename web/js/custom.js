// JavaScript Document
var isemail = false;
var isusername = false;
var ispassword = false;
var iscpassword = false;
var isdate = false;
var isfullname = false;
var isavatar = false;
function popup(id)
{
	document.getElementById(id).style.opacity = 1;
	document.getElementById(id).style.zIndex = 9999;	
}
function close_popup(id)
{
	document.getElementById(id).style.opacity = 0;
	document.getElementById(id).style.zIndex = -1;	
}
function godash()
{
	window.location("dashboard.html")	
}
function hasClass(ele,cls) {
	return ele.className.match(new RegExp('(\\s|^)'+cls+'(\\s|$)'));
}
 
function addClass(ele,cls) {
	if (!this.hasClass(ele,cls)) ele.className += " "+cls;
}
 
function removeClass(ele,cls) {
	if (hasClass(ele,cls)) {
    	var reg = new RegExp('(\\s|^)'+cls+'(\\s|$)');
		ele.className=ele.className.replace(reg,' ');
	}
}
function submit_val()
{
	if(isemail && isusername && ispassword && iscpassword && isfullname && isdate && isavatar)
	{
		document.getElementById('register_button').disabled = false;	
		removeClass(document.getElementById('register_button'),"button_bluegrad_dis");
		addClass(document.getElementById('register_button'),"button_bluegrad");
	}
	else
	{
		document.getElementById('register_button').disabled = true;
		removeClass(document.getElementById('register_button'),"button_bluegrad");
		addClass(document.getElementById('register_button'),"button_bluegrad_dis");	
	}
}
function date_val(entered)
{
    var isyear = (document.getElementById('d_year').value != '');
	var ismonth = (document.getElementById('d_month').value != '');
	var isday = (document.getElementById('d_day').value != '');
	if ( isyear && ismonth & isday )
	{
		document.getElementById('date_error').style.opacity = 0;
		document.getElementById('date_okay').style.opacity = 0.9;
		isdate = true;
	}
	else
	{
		document.getElementById('date_error').style.opacity = 0.9;
		document.getElementById('date_okay').style.opacity = 0;
		isdate = false;
	}
}
function email_val(entered)
{
	var email = entered;
	
	apos=email.value.indexOf("@"); 
	dotpos=email.value.lastIndexOf(".");
	lastpos=email.value.length-1;
	if (apos<1 || dotpos-apos<1 || lastpos-dotpos>3 || lastpos-dotpos<2) 
	{
		document.getElementById('email_error').style.opacity = 0.9;
		document.getElementById('email_okay').style.opacity = 0;
		isemail = false;
	}
	else 
	{
		document.getElementById('email_error').style.opacity = 0;
		document.getElementById('email_okay').style.opacity = 0.9;
		isemail = true;
	}
} 
function username_val(entered)
{
	var username = entered.value;
	var temppass = document.getElementById('password').value;
	ulength = username.length;

	if ( (ulength > 4 ) && ( username.toLowerCase() != temppass.toLowerCase()))
	{
		document.getElementById('username_error').style.opacity = 0;
		document.getElementById('username_okay').style.opacity = 0.9;
		isusername = true;
	}
	else 
	{
		document.getElementById('username_error').style.opacity = 0.9;
		document.getElementById('username_okay').style.opacity = 0;
		isusername = false;
	}
}
function password_val(entered)
{
	var password = entered.value;
	var tempusername = document.getElementById('username').value;
	var tempemail = document.getElementById('email').value;
	var plength = password.length;
	
	if ( (plength > 7 ) && ( password.toLowerCase() != tempusername.toLowerCase()) && ( password.toLowerCase() != tempemail.toLowerCase()))
	{
		document.getElementById('password_error').style.opacity = 0;
		document.getElementById('password_okay').style.opacity = 0.9;
		ispassword=true;
	}
	else 
	{
		document.getElementById('password_error').style.opacity = 0.9;
		document.getElementById('password_okay').style.opacity = 0;
		ispassword=false;
	}
}
function cpassword_val(entered)
{
	var cpassword = entered.value;
	var temppass = document.getElementById('password').value;
	
	if ( cpassword.toLowerCase() == temppass.toLowerCase())
	{
		document.getElementById('cpassword_error').style.opacity = 0;
		document.getElementById('cpassword_okay').style.opacity = 0.9;
		iscpassword =true;
	}
	else 
	{
		document.getElementById('cpassword_error').style.opacity = 0.9;
		document.getElementById('cpassword_okay').style.opacity = 0;
		iscpassword =false;
	}	
}
function avatar_val(entered)
{
	var avatar = entered.value;
	var isempty = (avatar == '');
	
	if (isempty)
	{
		document.getElementById('avatar_error').style.opacity = 0.9;
		document.getElementById('avatar_okay').style.opacity = 0;
		isavatar =false;	
	}
	else
	{
		document.getElementById('avatar_error').style.opacity = 0;
		document.getElementById('avatar_okay').style.opacity = 0.9;
		isavatar =true;	
	}
}
function fullname_val(entered)
{
	var posspace = entered.value;
	var temp = 0;
	var counter = 0;
	var countnearspace = 0;
	var morethan1 = false;
	var space2char = false;
	var hasspace = (posspace.indexOf(' ')!= -1);
	var flength = posspace.length-1;
	if (hasspace && (posspace.indexOf(' ') != flength))
	{
		while((counter < posspace.length) && (!morethan1)){
			temp = counter;
			if(posspace.charAt(temp) == ' '){
				temp++;
				if(posspace.charAt(temp) == ' '){
					morethan1 = true;
				}
			}
			counter++;
		}
		counter = 0;
		temp = 0;
		
		var n = posspace.split(" ");
		if(posspace.length <= 1){
			document.getElementById('fullname_error').style.opacity = 0.9;
			document.getElementById('fullname_okay').style.opacity = 0;
			isfullname = false;
		}
		else if(morethan1 == false){
			document.getElementById('fullname_error').style.opacity = 0;
			document.getElementById('fullname_okay').style.opacity = 0.9;
			isfullname = true;
		}
		else{
			document.getElementById('fullname_error').style.opacity = 0.9;
			document.getElementById('fullname_okay').style.opacity = 0;
			isfullname = false;
		}	
	}
	else
	{
		document.getElementById('fullname_error').style.opacity = 0.9;
		document.getElementById('fullname_okay').style.opacity = 0;
		isfullname = false;
	}
}
function load_calendar()
{
	var TheStartYear = 1955;
	var TheCurrentDate = new Date();
	var Month = ["January","February","Maret","April","Mei","Juni","July","August","September","October","November","Desember"];
	TheCurrentDate = new Date(TheCurrentDate.getUTCFullYear(), TheCurrentDate.getMonth(), 2);
	
	var TheHTML = '<label><select id=\"d_year\" class=\"combo_year\" onChange=\"check_calendar();\">';
	
	var selisih = TheCurrentDate.getUTCFullYear() - TheStartYear;
	var current = TheStartYear;
	while (selisih != -1)
	{
		TheHTML = TheHTML + '<option>' + current + '</option>';
		selisih--;
		current = TheCurrentDate.getUTCFullYear() - selisih;
		
	}
	TheHTML = TheHTML + '</select></label> / <label><select id=\"d_month\" class=\"combo_month\" onChange=\"check_calendar();\">';
				 var i = 0;
	while (i != 12)
				 {
					TheHTML = TheHTML + '<option>'  + Month[i] + '</option>' ;         
					 i++;
				}
				 TheHTML = TheHTML + '</select></label> / <label><select id=\"d_day\" class=\"combo_day\">';
	var j = 1;
	while(j <= 31)
	{
		TheHTML = TheHTML + '<option>'  + j + '</option>' ;        
		++j;
	}
				 TheHTML = TheHTML + '</select></label>';
				 
	document.getElementById('calendar').innerHTML = TheHTML;

}
function title_val(entered)
{
	var title = entered.value;
	var	tlength = title.length;
	var ismaxlength = (title.length < 25);
	var isnull = (title == '');
	var patt1=new RegExp("^([A-Za-z0-9]+ ?)*$");
	var isvalidin = patt1.test(title);
	if (ismaxlength && isvalidin && !isnull)
	{
		document.getElementById('title_error').style.opacity = 0;
		document.getElementById('title_okay').style.opacity = 0.9;
	}
	else
	{
		document.getElementById('title_error').style.opacity = 0.9;
		document.getElementById('title_okay').style.opacity = 0;
	}
}
function load_calendar_range(start,end)
{
	var Month = ["January","February","Maret","April","Mei","Juni","July","August","September","October","November","Desember"];
	
	var TheHTML = '<label><select id=\"d_year\" class=\"combo_year\" onChange=\"check_calendar();\">';
	
	var selisih = end - start;
	var current = start;
	while (selisih != -1)
	{
		TheHTML = TheHTML + '<option>' + current + '</option>';
		selisih--;
		current = end - selisih;
		
	}
	TheHTML = TheHTML + '</select></label> / <label><select id=\"d_month\" class=\"combo_month\" onChange=\"check_calendar();\">';
				 var i = 0;
	while (i != 12)
				 {
					TheHTML = TheHTML + '<option>'  + Month[i] + '</option>' ;         
					 i++;
				}
				 TheHTML = TheHTML + '</select></label> / <label><select id=\"d_day\" class=\"combo_day\">';
	var j = 1;
	while(j <= 31)
	{
		TheHTML = TheHTML + '<option>'  + j + '</option>' ;        
		++j;
	}
				 TheHTML = TheHTML + '</select></label>';
				 
	document.getElementById('calendar').innerHTML = TheHTML;

}
function edit_fieldtext(id,idvalue)
{
	var value = document.getElementById(idvalue).innerHTML;
	var html = "<input type=\"text\" id=\""+idvalue+"\" class=\"det_content\" value=\""+value+"\">";
	document.getElementById(id).innerHTML = html;
}
function load_calendar_id(id,start,end)
{
	var Month = ["January","February","Maret","April","Mei","Juni","July","August","September","October","November","Desember"];
	
	var TheHTML = '<label><select id=\"d_year\" class=\"combo_year\" onChange=\"check_calendar();\">';
	
	var selisih = end - start;
	var current = start;
	while (selisih != -1)
	{
		TheHTML = TheHTML + '<option>' + current + '</option>';
		selisih--;
		current = end - selisih;
		
	}
	TheHTML = TheHTML + '</select></label> / <label><select id=\"d_month\" class=\"combo_month\" onChange=\"check_calendar();\">';
				 var i = 0;
	while (i != 12)
				 {
					TheHTML = TheHTML + '<option>'  + Month[i] + '</option>' ;         
					 i++;
				}
				 TheHTML = TheHTML + '</select></label> / <label><select id=\"d_day\" class=\"combo_day\">';
	var j = 1;
	while(j <= 31)
	{
		TheHTML = TheHTML + '<option>'  + j + '</option>' ;        
		++j;
	}
				 TheHTML = TheHTML + '</select></label>';
				 
	document.getElementById(id).innerHTML = TheHTML;
}
function print_day(day)
{
		var j = 1;
		var  TheHTML = '';
		while(j <= day)
	{
		TheHTML = TheHTML + '<option>' + j + '</option>' ;        
		++j;
	}
				 
	document.getElementById('d_day').innerHTML = TheHTML;
}
function iskabisat()
{
	var currYear = document.getElementById('d_year').value;	
	if((currYear%4)==0)
	{ return true; }
	else
	{ return false; }
}
function isfebruary()
{
	var currMonth = document.getElementById('d_month').value;
	if(currMonth == 'February')
	{ return true;	}
	else
	{ return false;	}
}
function isodmonth()
{
	var currMonth = document.getElementById('d_month').value;
	if(currMonth == 'April' || currMonth == 'Juni' || currMonth == 'September' || currMonth == 'November')
	{ return true;	}
	else
	{ return false;	}
}
function check_calendar()
{
	date_val(this);
	iskabisat();
	isodmonth();
	isfebruary();
	var TheHTML = '<select>';
	if( isodmonth() )
	{
		print_day(30);
	}
	else if (isfebruary())
	{
		if(iskabisat())
		{
			print_day(29);	
		}	
		else
		{
			print_day(28);	
		}
	}
	else
	{
		print_day(31);	
	}
}

