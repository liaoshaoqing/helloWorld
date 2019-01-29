<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addYsArticle.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

 <link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-2.1.4.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>

<script type="text/javascript" src="editor/kindeditor.js"></script>
<script type="text/javascript">
	KE.show({
		id : 'content7',
		cssPath : './index.css'
	});
</script>
  </head>
  
   <body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">养生保健</a></li>
			<li><a href="#">新增文章</a></li>
		</ul>
	</div>
	<div class="formbody">
		<div id="usual1" class="usual">
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">新增文章</a></li>
					<!--<li><a href="#tab2">自定义</a></li> -->
				</ul>
			</div>
			<form action="ArticleEditServlet?type=addys" method="post">
				<div id="tab1" class="tabson">
					<div class="formtext">
						Hi，<b>${sessionScope.CURRENT_USER.loginId }</b>，欢迎您试用信息发布功能！
						
					
					</div>
					<ul class="forminfo">
						<li><label>文章编号<b>*</b></label> <input name="id" type="text"
							value="" class="dfinput"
							style="width:218px;" /></li>
						<li><label>文章标题<b>*</b></label> <input name="title" type="text"
							value="" class="dfinput"
							style="width:218px;" /></li>
						<li><label>发布时间<b>*</b></label> <input name="releasetime" type="text"
						value=""
							class="dfinput" style="width:218px;" /></li>
						<li><label>点击数<b>*</b></label> <input name="click"   type="text" 
						value=""
							class="dfinput" style="width:218px;" /></li>
						<li><label>撰稿人<b>*</b></label> <input name="operator" type="text" 
						value=""
							class="dfinput" style="width:218px;" /></li>
						<li><label>来源网站<b>*</b></label> <input name="from" type="text" 
						value=""
							class="dfinput" style="width:218px;" /></li>
						<li><label>目录编号<b>*</b></label> <input name="menuid" type="text" 
						value=""
							class="dfinput" style="width:218px;" /></li>

						<li><label>文章内容<b>*</b></label> <textarea id="content7"
								name="content"
								style="width:700px;height:250px;visibility:hidden;">
									
								</textarea></li>
						<li><label>&nbsp;</label> <input name="" type="submit"
							class="btn" value="马上提交" /></li>
					</ul>
				</div>
			</form>
		</div>
		<script type="text/javascript">
			$("#usual1 ul").idTabs();
		</script>
		<script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
	</div>

  </body>
</html>
