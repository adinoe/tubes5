<?
include_once 'function.php';
include_once 'config.php';

$param = $_GET['param'];
$no = $_GET['no'];


$fcatch = new functionPool;
switch ($param)
{
	case "register":
	{
		$username = $_POST["username"];
		$password = $_POST["password"];
		$fullname = $_POST["fullname"];
		$email = $_POST["email"];
		$fcatch->register();
		break;
	}
	case "1":
	{
		$title = $_POST["title"];
		$assignee = $_POST["assignee"];
		$fcatch->addCategory($title,$assignee);
		break;
	}
	default:
	{
		echo "ada yang salah cuy";
		break;
	}
}
?>