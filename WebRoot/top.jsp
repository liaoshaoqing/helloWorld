<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
body{
	margin:0;
	padding:0;
}
.top{
    background-color:#FFF;
	height:119px;
}
.hls{
	font-family:'隶书';
	color:#F00;
	font-size:36px;
}
.logo{
	margin-left:20px;
	padding-top:30px;
	font-family:'微软雅黑';
	float:left;
}
.search{
	float:left;
	margin-left:210px;
	padding:30px;
	}
.search input{
	width:236px;
	height:35px;
	border:0;
	background-image:url(images/bg_inp01.gif);
	background-repeat:no-repeat;
	background-position:0px 0px;
	padding-left:5px;
	margin-top:4px;
	
		}
.search img{
	 vertical-align:middle;
	 margin-top:-1px;
		}
.topright{
	float:left;
	margin-left:160px;

}
.topright ul li{
	list-style:none;
	float:left;
	padding:10px;

}
.topright ul li a{
	text-decoration:none;
		color:#999;
	}
.gly{
	
   clear:both;
   padding-right:10px;
}
   	
</style>
</head>

<body>
<div class="top">
  <div class="logo">
   <span class="hls">欢乐颂</span>社区管理系统
  </div>
<div class="search"><img src="images/search.png"><input type="text"><a href="#"><img src="images/a_ss.gif" /></a> </div>
<div class="topright"> 
  <ul>
   <li><img src="images/help.png"><a href="#">帮助</a></li>
   <li><a href="#">关于</a></li>
   <li><a href="ExitServlet" target=_parent">退出</a></li>
  </ul>
  <div class="gly"><img src="images/gly.png"/> <img src="images/admin.png"></div>
</div>
</div>
</body>
</html>
