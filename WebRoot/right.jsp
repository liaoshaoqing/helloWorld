<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'right.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
span {
	vertical-align:middle;
	}
.welinfo{
	padding-left:20px;
	padding-top:8px;
	padding-bottom:10px;
}

</style>
<link href="css/Rototer.css" rel="stylesheet" type="text/css" />
<link href="css/scroll.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
 <div class="welinfo">
    <span><img src="images/sun.png" alt="天气" /></span>
    <b>${sessionScope.CURRENT_USER.loginId }早上好，欢迎使用信息管理系统</b>(${sessionScope.CURRENT_USER.email })
    </div>
<div class="adver"><a href="javascript:onclick=showxw('201600010')" class="tablelink"><img src="images/adRotator_1.jpg" alt="广告图片" id="Rotator"/></a>
  <div class="Rotator_bg">
    <div class="number" id="fig_1" onclick="show(1)">1</div>
    <div class="number" id="fig_2" onclick="show(2)">2</div>
    <div class="number" id="fig_3" onclick="show(3)">3</div>
    <div class="number" id="fig_4" onclick="show(4)">4</div>
    <div class="number" id="fig_5" onclick="show(5)">5</div>
  </div>
</div>
<script type="text/javascript">
var title=new Array();
title[0]="1.习近平：坚持依规治党和以德治党相统一";
title[1]="2.李克强：去钢煤产能不能出现大规模失业潮";
title[2]="3.儿童游乐场欢乐多 宝宝应该这么玩";
title[3]="4.宝爸宝妈别烦恼 一岁前宝宝应该这么教";
title[4]="5.湖南“镉大米”流入广东，食品安全需关注";
var NowFrame=1;
var MaxFrame=5;
 function show(dl){
   if(Number(dl)){
	   clearTimeout(theTimer);
	   NowFrame=dl;
	   } 	
	   for(var i=1;i<(MaxFrame+1);i++){
		 if(i==NowFrame){
		  document.getElementById("Rotator").src="images/adRotator_"+i+".jpg";
		  document.getElementById("fig_"+i).innerHTML=title[i-1];
		  document.getElementById("fig_"+i).className="numberOver"; 	//获取id是fig_i的class名字是numberOver 设计它的css
			 } 
			 else{
               document.getElementById("fig_"+i).innerHTML=i;
               document.getElementById("fig_"+i).className="number";
                }
		   } 
		   if(NowFrame == MaxFrame){
              NowFrame = 1;
              }
          else{
          NowFrame++;
          }
 }
 var theTimer=setInterval("show()",3000);
 window.onload=show();
</script>
<!-----11111111111111------------------------------------>
<div class="domes">
  <div class="dome_top">最新发布</div>
  <div id="dome">
    <div id="dome1">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
       
        <tr>
          <td><img src="images/new_1.jpg" alt="scroll" /></td>
          <td><div class="title">超越“京”：日本开始研制新型超级计算机</div>
        </tr>
         <tr>
          <td><img src="images/new_02.jpg" alt="scroll" /></td>
          <td><div class="title">儿童出生半年 需做视力筛查</div>
           
        </tr>
        <tr>
          <td><img src="images/new_03.jpg" alt="scroll" /></td>
          <td><div class="title">美报告预计商用无人机将让超400万美国人失业</div>
            
        </tr>
        <tr>
          <td><img src="images/new_04.jpg" alt="scroll" /></td>
          <td><div class="title">超级高铁今晚公开测试 商业化前途遥遥无期</div>
         
        </tr>
        <tr>
          <td><img src="images/new_05.jpg" alt="scroll" /></td>
          <td><div class="title">虚拟心脏可更准确评估心律失常风险</div>
       
        </tr>
        <tr>
          <td><img src="images/new_6.jpg" alt="scroll" /></td>
          <td><div class="title">宇宙中的冰箱：你绝对想不到的低温度！</div>
       
        </tr>
        <tr>
          <td><img src="images/new_7.jpg" alt="scroll" /></td>
          <td><div class="title">神秘物体撞歪月球 NASA猜测或是火星人所为</div>
        
        </tr>
         <tr>
          <td><img src="images/new_8.jpg" alt="scroll" /></td>
          <td><div class="title">世界岛屿造就奇特动物 马恩岛猫没有尾巴</div>
        
        </tr>
         <tr>
          <td><img src="images/new_9.jpg" alt="scroll" /></td>
          <td><div class="title">太空里都是老家伙？土星光环比恐龙还年轻</div>
        
        </tr>
         <tr>
          <td><img src="images/new_10.jpg" alt="scroll" /></td>
          <td><div class="title">中国科学家造太阳探测卫星:全景记录"太阳风暴"</div>
        
        </tr>
      </table>
    </div>
    <div id="dome2"></div>
  </div>
</div>
<script type="text/javascript">
function $(element){
	return document.getElementById(element);
}
var dome=$("dome");
var dome1=$("dome1");
var dome2=$("dome2");
var speed=100;
dome2.innerHTML=dome1.innerHTML;
function moveTop(){
	if(dome2.offsetTop-dome.scrollTop<=0)
		dome.scrollTop-=demo1.offsetHeight;
		
	else{
dome.scrollTop++;
}
}
var MyMar=setInterval(moveTop,speed);
dome.onmouseover=function() {
	clearInterval(MyMar);
	}
dome.onmouseout=function() {
	MyMar=setInterval(moveTop,speed);
	}
</script>
</body>
</html>
