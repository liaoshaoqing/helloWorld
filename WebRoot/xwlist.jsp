<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xwlist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-2.1.4.js"></script>
<script type="text/javascript" src="layer/layer.js"></script>
 <script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip").fadeIn(200);
		});

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
	function to_del(nid){
	   var isdel=confirm("你确定要删除编号是【"+nid+"】的新闻吗？")
	   if(isdel){
	      //到servlet 中去删除
	      location.href="DeleteXwServlet?nId="+nid;
	   }
	}
		function showxw(nid){
	
		layer.open({
			  type: 2,
			  title: '新闻详细信息',
			  shadeClose: true,
			  shade: 0.5,
			  area: ['640px', '450px'],
			  content: 'ShowXw?nId='+nid //iframe的url
			}); 
	}
</script>
  </head>
  
  <body>
    	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">热点新闻</a></li>
			<li><a href="#">新闻管理</a></li>
		</ul>
	</div>
	<div class="rightinfo">
		<div class="tools">
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">新闻管理</a></li>
					<!--<li><a href="#tab2">自定义</a></li> -->
				</ul>
			</div>

		</div>
		<table class="tablelist">
			<thead>
				<tr>
					<!-- <th><input name="" type="checkbox" value="" checked="checked"/></th>-->
					<th>新闻编号<i class="sort"><img src="images/px.gif" /></i></th>
					<th>新闻标题</th>
					<th>新闻内容</th>
					<th>发布时间</th>
					<th>点击数</th>
					<th>撰稿人</th>
					<th>来源网站</th>
					<th>菜单编号</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			
		  <c:forEach items="${requestScope.xwlist }" var="xw">
				<tr>
					<td>${xw.nId }</td>
					<td>${xw.nTitle }</td>
					<td>${xw.nContent }</td>
					<td>${xw.nReleaseTime }</td>
					<td>${xw.nClick }</td>
					<td>${xw.nOperator }</td>
					<td>${xw.nFrom }</td>
					<td>${xw.menuId }</td>
					<td><a href="javascript:onclick=showxw('${xw.nId }')" class="tablelink">查看</a> 
					<a href="ArticleEditServlet?nId=${xw.nId }&type=modifyxw" class="tablelink">更新</a>
					<a href="javascript:onlick=to_del('${xw.nId }')" class="tablelink"> 删除</a></td>
				</tr>
				</c:forEach>
			</tbody>

		</table>

		<!-- <div class="pagin">
    	<div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <ul class="paginList">
        <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
        <li class="paginItem"><a href="javascript:;">1</a></li>
        <li class="paginItem current"><a href="javascript:;">2</a></li>
        <li class="paginItem"><a href="javascript:;">3</a></li>
        <li class="paginItem"><a href="javascript:;">4</a></li>
        <li class="paginItem"><a href="javascript:;">5</a></li>
        <li class="paginItem more"><a href="javascript:;">...</a></li>
        <li class="paginItem"><a href="javascript:;">10</a></li>
        <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
    </div>-->

		<div class="tip">
			<div class="tiptop">
				<span>提示信息</span><a></a>
			</div>
			<div class="tipinfo">
				<span><img src="images/ticon.png" /></span>
				<div class="tipright">
					<p>是否确认对信息的修改 ？</p>
					<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
				</div>
			</div>
			<div class="tipbtn">
				<input name="" type="button" class="sure" value="确定" /> &nbsp; <input
					name="" type="button" class="cancel" value="取消" />
			</div>
		</div>
	</div>
	<script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
  </body>
</html>
