<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	.msg{
	padding-left:5px;
	color: #666;
    font-weight:bold;
	font-size:12px;
}
.red{
	color:#F00;
	 font-weight:bold;
	font-size:12px;
}
.ico{
	background-image:url(images/glb_v2.png);
	background-repeat:no-repeat;
	background-position:-33px -288px;
	padding-left:20px;
}
.rigth_ico{
	background-image:url(images/glb_v2.png);
	background-repeat:no-repeat;
	background-position:0px -288px;
	padding-left:20px;
	}
.p_msg{
	color:red;
	font-size:12px;
	font-weight:bold;
	</style>
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-2.1.4.js"></script>
<script type="text/javascript" src="js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="js/select-ui.min.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
 function $(element){
	 return document.getElementById(element);
	 }
  function namefocus(){
     $("textname").value="";
	 $("name_msg").innerHTML="请输入用户名!";
	 $("name_msg").className="msg";
	  }	 
 function nameblur(){
	  var uname=$("textname").value;
	  var regname=/^[\u4e00-\u9fa5\w]+$/;
	   $("name_msg").innerHTML="";
	  if(regname.test(uname)==false){
		  $("name_msg").className="red";
		  $("name_msg").innerHTML="用户名只能是中文字符、英文字母、数字及下划线";
		  return false;
		  }
		  else{
			   $("name_msg").innerHTML="";
			   return true;
			  }
	 }
 function pwdfocus(){
    $("textpwd").value="";
	 $("pwd_msg").innerHTML="请输入密码!";
	 $("pwd_msg").className="msg";
	  }	
function pwdblur(){
	 var upwd=$("textpwd");
	 if(upwd.value.length<6||upwd.value.length>16){
		     $("pwd_msg").className="p_msg";
		    $("pwd_msg").innerHTML="密码长度为6~16字符";
		 }
		 else{
			   $("pwd_msg").innerHTML="";
			 }

	 } 	
function repwdfocus(){
	 $("repwd_msg").innerHTML="请再次输入密码!";
	 $("repwd_msg").className="msg";
	  }	 	 
	 
 function repwdblur(){
	  var  urepwd=$("repwd");
	  var  upwd=$("textpwd");
	 if(urepwd.value!= upwd.value){
		    $("repwd_msg").className="p_msg";
		    $("repwd_msg").innerHTML="两次密码不一致，请重新输入！"
		 }
		 else{
			   $("repwd_msg").innerHTML="";
			 }

	 }
function realnamefocus(){
    $("real_msg").className="msg";
    $("real_msg").innerHTML="请输入真实姓名！";
}
function realnameblur(){
   var RealName=$("realname").value;
   var regrealname=/^([\u4e00-\u9fa5]){2,4}$/;
   if(regrealname.test(RealName)==false){
          $("real_msg").className="red";
		  $("real_msg").innerHTML="请输入合法的真实姓名！";
		  return false;
		  }
		  else{
			   $("real_msg").innerHTML="";
			   return true;
			  }
   }	   
function phonefocus(){
   $("phone_msg").className="msg";
   $("phone_msg").innerHTML="请输入手机号码！";
}	
function phoneblur(){
   var Phone=$("textphone").value;
   var regPhone=/^[1][358][0-9]{9}$/;
   if(regPhone.test(Phone)==false){
     $("phone_msg").className="red";
     $("phone_msg").innerHTML="请输入合法的手机号！";
     return false;
   }else{
      $("phone_msg").innerHTML="";
      return true;
   }
} 

function qqfocus(){
$("qq_msg").className="msg";
$("qq_msg").innerHTML="请输入QQ号！";
}
function qqblur(){
   var QQ=$("textqq").value;
   var regQQ=/^[1-9][0-9]{5,10}$/;
   if(regQQ.test(QQ)==false){
     $("qq_msg").className="red";
     $("qq_msg").innerHTML="请输入合法的QQ号！";
   }else{
     $("qq_msg").innerHTML="";
   }
}
function emailfocus(){
$("email_msg").className="msg";
$("email_msg").innerHTML="请输入电子邮箱！";
}
function emailblur(){
   var Email=$("textemail").value;
   var regEmail=/^(\w)+(\.\w+)*@(\w)+((\.\w+)+)$/;
   if(regEmail.test(Email)==false){
     $("email_msg").className="red";
     $("email_msg").innerHTML="请输入合法的电子邮箱！";
   }else{
     $("email_msg").innerHTML="";
   }
}
//声明一个XMLHttpRequest对象 JS 原生态实现Ajax
var xhr;
//1.创建XMLHttpRequest 对象
function createXMLRequest(){
 	try {
			// Firefox, Opera 8.0+, Safari 
			xhr = new XMLHttpRequest();
		} catch (e) {
			// Internet Explorer 
			try {
				xhr = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xhr = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
					alert("您的浏览器不支持AJAX！");
				}
			}
		}
	}
</script>
  </head>
  
  <body>
   <div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="index.html" target="rightFrame">系统管理</a></li>
			<li><a href="#">新增用户</a></li>
		</ul>
	</div>
	<div class="formbody">
		<div id="usual1" class="usual">
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">新增用户</a></li>
					<!--<li><a href="#tab2">自定义</a></li> -->
				</ul>
			</div>
			<form action="UserEditServlet?type=addUser" method="post">
				<div id="tab1" class="tabson">
					<div class="formtext">
						Hi，<b>${sessionScope.CURRENT_USER.loginId }</b>，欢迎您试用信息发布功能！ <input
							type="hidden" name="userid" value="" />
					</div>
					<ul class="forminfo">
						<li><label>登录名<b>*</b></label> <input name="loginid"
							type="text" value="" class="dfinput"
							style="width:218px;" id="textname" onfocus="namefocus()" onblur="nameblur()" onblur="checkLogin(this)"/>
							 <span id="name_msg"></span></li>
						<li><label>密码<b>*</b></label> <input name="userpwd"
							type="password" value="" class="dfinput"
							style="width:218px;" id="textpwd" onfocus="pwdfocus()" onblur="pwdblur()" />
							 <span  id="pwd_msg"></span>
							</li>
							<li><label>确认密码<b>*</b></label> <input name="reuserpwd"
							type="password" value="" class="dfinput"
							style="width:218px;" id="repwd" onfocus="repwdfocus()" onblur="repwdblur()"/>
							 <span  id="repwd_msg"></span></li>
						<li><label>姓名<b>*</b></label> <input name="realname"
							type="text" value=""
							class="dfinput" style="width:218px;" id="realname" onfocus="realnamefocus()"onblur="realnameblur()"  />
							<span  id="real_msg"></span></li>
						<li><label>电话<b>*</b></label> <input name="phone" type="text"
							value="" class="dfinput"
							style="width:218px;" id="textphone" onfocus="phonefocus()" onblur="phoneblur()"  />
							<span id="phone_msg"></span></li>
						<li><label>生日<b>*</b></label> <input name="birthday"
							type="text"
							onFocus="WdatePicker({isShowClear:false,readOnly:true})"
							value="" class="dfinput"
							style="width:218px;" /></li>
						<li><label>性别<b>*</b></label>
							<div style="float:left;width:100px;">
								<input type="radio" id="male"
									value="男" name="gender" />男
							</div>
							<div>
								<input type="radio" id="female"
									value="女" name="gender" />女
							</div></li>
						<li><label>QQ<b>*</b></label> <input name="qq" type="text"
							value="" class="dfinput"
							style="width:218px;" id="textqq" onfocus="qqfocus()" onblur="qqblur()" />
							<span id="qq_msg"></span></li>
						<li><label>地址<b>*</b></label> <input name="address"
							type="text" value="" class="dfinput"
							style="width:218px;" /></li>
						<li><label>电邮<b>*</b></label> <input name="email" type="text"
							value="" class="dfinput"
							style="width:218px;" id="textemail" onfocus="emailfocus()" onblur="emailblur()" />
							<span id="email_msg"></span></li>


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
