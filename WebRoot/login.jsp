<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400' rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
 <script type="text/javascript" src="js/jquery-2.1.4.js"></script>
 
  </head>
  
  <body>
   <div class="login">
	<h2>Acced Form</h2>
	<div class="login-top">
		<h1>LOGIN FORM</h1>
		<form action="LoginServlet" method="post">
			<input type="text" value="User Id" name="userid" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Id';}">
			<input type="password" value="password" name="userpwd" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}">
	   
	    <div class="forgot">
	    	<a href="#">forgot Password</a>
	    	<input type="submit" value="Login" >
	    </div>
	     </form>
	</div>
	<div class="login-bottom">
		<h3>New User &nbsp;<a href="addUser.jsp">Register</a>&nbsp Here</h3>
	</div>
</div>	
<div class="copyright">
</div>
  </body>
</html>
