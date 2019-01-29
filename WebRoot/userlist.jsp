<%@page import="com.zwx.entity.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userlist.jsp' starting page</title>
    
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
	function to_del(id,name){
	   var isdel=confirm("你确定要删除编号是【"+id+"姓名是【"+name+"】的用户吗？")
	   if(isdel){
	      //到servlet 中去删除
	      location.href="deleteServlet?userId="+id;
	   }
	}
	function showuser(uid){
	
		layer.open({
			  type: 2,
			  title: '用户详细信息',
			  shadeClose: true,
			  shade: 0.5,
			  area: ['640px', '450px'],
			  content: 'ShowUser?uId='+uid //iframe的url
			}); 
	}
</script>
  </head>
  
  <body>
    	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">系统管理</a></li>
			<li><a href="#">用户管理</a></li>
		</ul>
	</div>
	<div class="rightinfo">
		<div class="tools">
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">用户管理</a></li>
					<!--<li><a href="#tab2">自定义</a></li> -->
				</ul>
			</div>

		</div>
		<table class="tablelist">
			<thead>
				<tr>
					<!-- <th><input name="" type="checkbox" value="" checked="checked"/></th>-->
					<th>用户编号<i class="sort"><img src="images/px.gif" /></i></th>
					<th>登录名</th>
					<th>姓名</th>
					<th>手机</th>
					<th>生日</th>
					<th>性别</th>
					<th>QQ</th>
					<th>电邮</th>
					<th>地址</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
			
			<%
          List<User> userlist=(List<User>)request.getAttribute("ulist");
				for(int i=0;i<userlist.size();i++)
			{
			 %>
				<tr>
					<td><%=userlist.get(i).getUid() %></td>
					<td><%=userlist.get(i).getLoginId() %></td>
					<td><%=userlist.get(i).getRealName() %></td>
					<td><%=userlist.get(i).getPhone()%></td>
					<td><%=userlist.get(i).getBirthday() %></td>
					<td><%=userlist.get(i).getGender() %></td>
					<td><%=userlist.get(i).getQq() %></td>
					<td><%=userlist.get(i).getEmail() %></td>
					<td><%=userlist.get(i).getAddress() %></td>
					<td><a href="javascript:onclick=showuser('<%=userlist.get(i).getUid() %>')"  class="tablelink">查看</a> 
					<a href="UserEditServlet?userId=<%=userlist.get(i).getUid() %>&type=modify" class="tablelink">更新</a>
					<a href="javascript:onlick=to_del('<%=userlist.get(i).getUid() %>','<%=userlist.get(i).getRealName() %>')" class="tablelink"> 删除</a></td>
				</tr>
				<%} %>
			</tbody>

		</table>

		 <div class="pagin">
    	<div class="message">
    	共<i class="blue">${requestScope.ucount }</i>条记录，当前显示第&nbsp;<i class="blue">${requestScope.PageIndex }</i>页&nbsp;
    	共<i class="blue">${requestScope.pcount-1 }</i>页</div>
        <ul class="paginList">
        <li class="paginItem current"><a href="javascript:onclick=skipPage(1);" class="pagepre">首页</a></li>
        <li class="paginItem"><a href="javascript:onclick=skipPrev('${requestScope.PageIndex-1 }');">上一页</a></li>
        <li class="paginItem"><a href="javascript:onclick=skipNext('${requestScope.PageIndex+1 }','${requestScope.pcount-1 }');">下一页</a></li>
        <li class="paginItem"><a href="javascript:onclick=skipPage('${requestScope.pcount-1 }');"class="pagenxt" >尾页</a></li>
        </ul>
    </div>

		
	</div>
	<script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	
	function skipPage(PageIndex){
	  location.href="UserListServlet?pIndex="+PageIndex;
	}
	function skipPrev(PageIndex){
	  if(PageIndex==0){
	     alert('当前已经是第一页！');
	  }else{
	    location.href="UserListServlet?pIndex="+PageIndex;
	  }
	  
	}
	function skipNext(PageIndex,pageCount){
	    if(PageIndex>pageCount){
	      alert('当前是最后一页！');
	    }else{
	      location.href="UserListServlet?pIndex="+PageIndex;
	    }
	    
	}
	
	</script>
  </body>
</html>
