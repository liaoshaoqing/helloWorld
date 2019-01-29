<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userShow.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
		.right{
		width:300px;
			
		}
		ul,li{
		margin:0px;
			list-style:none;
			font-size:12px;
			font-family: '微软雅黑';
			line-height:35px;
		}
	
	li{
		border-bottom:1px dashed #ccc;

	}
	</style>
  </head>
  
  <body>
   <div class="right">
    	<ul>
    		<li>登录名：${user.loginId }</li>
    		<li>姓名：${user.realName }</li>
    		<li>电话：${user.phone }</li>
    		<li>生日：${user.birthday }</li>
    		<li>性别：${user.gender }</li>
    		<li>QQ：${user.qq }</li>
    		<li>电邮：${user.email }</li>
    		<li>地址：${user.address }</li>
    	</ul>
    </div>
  </body>
</html>
