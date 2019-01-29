<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'qzShow.jsp' starting page</title>
    
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
		width:450px;
			
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
    		<li>文章编号：${qz.nId }</li>
    		<li>文章标题：${qz.nTitle }</li>
    		<li>发布时间：${qz.nReleaseTime }</li>
    		<li>点击量：${qz.nClick }</li>
    		<li>撰稿人：${qz.nOperator }</li>
    		<li>来源网站：${qz.nFrom }</li>
    		<li>目录编号：${qz.menuId }</li>
    		<li>文章内容：${qz.nContent }</li>
    	</ul>
    </div>
  </body>
</html>
