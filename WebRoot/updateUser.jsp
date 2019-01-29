<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'updateUser.jsp' starting page</title>

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
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>

</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">首页</a></li>
			<li><a href="#">更新用户</a></li>
		</ul>
	</div>
	<div class="formbody">
		<div id="usual1" class="usual">
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">更新用户</a></li>
					<!--<li><a href="#tab2">自定义</a></li> -->
				</ul>
			</div>
			<form action="UserEditServlet?type=doModify" method="post">
				<div id="tab1" class="tabson">
					<div class="formtext">
						Hi，<b>${sessionScope.CURRENT_USER.loginId }</b>，欢迎您试用信息发布功能！ <input
							type="hidden" name="userid" value="${requestScope.user.uid }" />
						<input type="hidden" name="userpwd"
							value="${requestScope.user.loginPwd }" />
					</div>
					<ul class="forminfo">
						<li><label>登录名<b>*</b></label> <input name="loginid"
							type="text" value="${requestScope.user.loginId }" class="dfinput"
							style="width:218px;" /></li>
						<li><label>姓名<b>*</b></label> <input name="realname"
							type="text" value="${requestScope.user.realName }"
							class="dfinput" style="width:218px;" /></li>
						<li><label>电话<b>*</b></label> <input name="phone" type="text"
							value="${requestScope.user.phone }" class="dfinput"
							style="width:218px;" /></li>
						<li><label>生日<b>*</b></label> <input name="birthday"
							type="text"
							onFocus="WdatePicker({isShowClear:false,readOnly:true})"
							value="${requestScope.user.birthday }" class="dfinput"
							style="width:218px;" /></li>
						<li><label>性别<b>*</b></label>
							<div style="float:left;width:100px;">
								<input type="radio" id="male"
									<c:if test="${requestScope.user.gender eq '男' }">checked="checked"</c:if>
									value="男" name="gender" />男
							</div>
							<div>
								<input type="radio" id="female"
									<c:if test="${requestScope.user.gender eq '女' }">checked="checked"</c:if>
									value="女" name="gender" />女
							</div></li>
						<li><label>QQ<b>*</b></label> <input name="qq" type="text"
							value="${requestScope.user.qq }" class="dfinput"
							style="width:218px;" /></li>
						<li><label>地址<b>*</b></label> <input name="address"
							type="text" value="${requestScope.user.address }" class="dfinput"
							style="width:218px;" /></li>
						<li><label>电邮<b>*</b></label> <input name="email" type="text"
							value="${requestScope.user.email }" class="dfinput"
							style="width:218px;" /></li>


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
