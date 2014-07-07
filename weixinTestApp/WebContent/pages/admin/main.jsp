<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%   String path = request.getContextPath();   
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理中心</title> 
<script type="text/javascript" src="/jsfiles/jQuery.js"></script>
		
		
		
		<script>
function $(_sId){
	return document.getElementById(_sId);
}
function exist(_sId){
	var oObj = $(_sId);
	return oObj != null ? oObj : false;
}
function dw(_sTxt){
	document.write(_sTxt);
}
function hide(_sId){
	$(_sId).style.display = $(_sId).style.display == "none" ? "" : "none";
	
}
function onlyShow(_sId, _iNum, _sPic, _sTxt1, _sTxt2){
	var i = 0;
	var oCurr = exist(_sId + i);
	while(oCurr){
		oCurr.style.display = "none";
		$(_sPic + i).src = _sTxt2;
		i++;
		oCurr = exist(_sId + i)
	}
	$(_sId + _iNum).style.display = "";
	$(_sPic + _iNum).src = _sTxt1;
}
function swapShow(_sId){
	var i = 0;
	var oCurr = exist(_sId + i);
	while(oCurr){
		hide(_sId + i);
		i++;
		oCurr = exist(_sId + i)
	}
}
function seekKey(_sKey){
	var i = 0;
	while(exist(_sKey + i)){
		i++;
	}
	return i;
}
function swapPic(_sId,_sAttr,_sTxt1, _sTxt2) {
	$(_sId)[_sAttr] = $(_sId)[_sAttr].indexOf(_sTxt1) > -1 ? _sTxt2 : _sTxt1;
}
function swap(_sId,_sAttr,_sTxt1, _sTxt2) {
	$(_sId)[_sAttr] = $(_sId)[_sAttr] == _sTxt1 ? _sTxt2 : _sTxt1;
}
function moveGif(_sId){
	swap(_sId,'className','marginLeft2','');
}
function moveStart(_sId){
	__tmp__time = setInterval("moveGif('" + _sId + "')",200);
}
function moveStop(_sId){
	clearInterval(__tmp__time);
	$(_sId).className = "marginLeft2";
}
function switchShow(){
	//hide('left');
	swapPic('arrow','src','/images/control_switch_up.gif','/images/control_switch_down.gif');
	if(document.getElementById("quickMenu").style.display=="none"){
		document.getElementById("quickMenu").style.display= ''; 
	}else{
		document.getElementById("quickMenu").style.display= 'none'; 
	}
	
	//alert($("#quickMenu"));
	//$("#quickMenu").slideUp("slow");
	//document.getElementById("quickMenu").slideUp("slow");
	//swapShow('hideLeft');
	//swapShow('hideBody');
}
function scroll_to_top()
{
	document.body.scrollTop=0;
}
function mainFrameRedirect(url)
{
	oo = document.getElementById("mainFrame");
	oo.url = url;
}
		</script>
	    <link href="/cssfiles/text.css" rel="stylesheet" type="text/css">
	<style type="text/css">
<!--
body {
	margin-top: 0px;
	margin-bottom: 0px;
	FILTER: progid:DXImageTransform.Microsoft.Gradient(gradientType=0,startColorStr=#cbcccd,endColorStr=#f6f6f8);/*IE6*/
background:-moz-linear-gradient(top,#cbcccd,#f6f6f8);/*非IE6的其它*/
background:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#cbcccd), to(#f6f6f8));/*非IE6的其它*/
}
.hand1 {cursor:hand;cursor:pointer}
.logo_bg {background:url("images/logo_bg.gif")}
.hand11 {cursor:hand;cursor:pointer}
.hand12 {cursor:hand;cursor:pointer}
.hand111 {cursor:hand;cursor:pointer}
-->

    </style></head>
	<body>
	<table width="960" border="0" align="center" cellpadding="0" cellspacing="0">

      <tbody><tr>
        <td width="206" align="left" valign="bottom" bgcolor="#67A7CD">
			<table width="100%" height="101" border="0" cellpadding="0" cellspacing="0">
          <tbody><tr>
            <td width="206" height="80" align="center" bgcolor="#67A7CD"><img src="/images/logo_bg.jpg" width="205" height="80"></td>
          </tr>
          <tr>
            <td height="21" align="left" class="hand12" onclick="switchShow()"><span class="hand111"><img id="arrow" src="/images/control_switch_up.gif" width="205" height="21"></span></td>
          </tr>
			 </tbody></table>
		</td>
        <td width="753" align="left" valign="bottom" bgcolor="#67A7CD"><img src="/images/banner.gif" width="540" height="101"></td>
      </tr>
    </tbody></table>
	<table width="960" border="0" align="center" cellpadding="0" cellspacing="0">
			<tbody><tr>
				<td id="left" width="205" valign="top">
					<table align="right" width="205" border="0" cellspacing="0" cellpadding="0">
						<tbody><tr>
							<td width="205" align="left" valign="top">
								<!-- 控制面板菜单 -->
								<table width="205" border="0" cellspacing="0" cellpadding="0" class="ctrl_menu">
									<tbody><tr>
									  <td height="5" align="center">&nbsp;</td>
								  </tr>
									<tr>
										<td align="center">
											<!-- 快速通道 -->
											<table width="195" id="quickMenu"  border="0" cellspacing="0" cellpadding="0" class="ctrl_menu_title_bg">
												
													<tbody><tr><td align="left" colspan="2" class="menu_box_pad"><table width="100%" border="0" cellspacing="5" cellpadding="0" class="menu_box">
                                                      <tbody>
                                                      <tr>
                                                        <th>&nbsp;</th>
                                                        <td>
                                                        <img alt=""  src="/images/to.jpg">&nbsp;&nbsp;<a href="<%=basePath%>company/getCompanyData.action" target="mainFrame" onclick="scroll_to_top()">企业信息维护</a>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th>&nbsp; </th>
                                                        <td>
                                                        <img alt=""  src="/images/to.jpg">&nbsp;&nbsp;<a href="<%=basePath%>/userMenu/findAllMenus.action" target="mainFrame" onclick="scroll_to_top()">自定义菜单管理</a>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th>&nbsp; </th>
                                                        <td>
                                                        <img alt=""  src="/images/to.jpg">&nbsp;&nbsp;<a href="list.jsp" target="mainFrame" onclick="scroll_to_top()">留言板管理</a>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th>&nbsp; </th>
                                                        <td>
                                                        <img alt=	""  src="/images/to.jpg">&nbsp;&nbsp;<a href="list.jsp" target="mainFrame" onclick="scroll_to_top()">订单管理</a>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th>&nbsp; </th>
                                                        <td>
                                                        <img alt=	""  src="/images/to.jpg">&nbsp;&nbsp;<a href="list.jsp" target="mainFrame" onclick="scroll_to_top()">用户管理</a>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th>&nbsp; </th>
                                                        <td>
                                                        <img alt=	""  src="/images/to.jpg">&nbsp;&nbsp;<a href="list.jsp" target="mainFrame" onclick="scroll_to_top()">消息管理</a>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th>&nbsp; </th>
                                                        <td>
                                                        <img alt=	""  src="/images/to.jpg">&nbsp;&nbsp;<a href="list.jsp" target="mainFrame" onclick="scroll_to_top()">权限管理</a>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        
                                                      </tr>
                                                    </tbody></table></td>
												</tr>
											</tbody></table>
											<!-- /快速通道 -->										</td>
									</tr>
									<tr height="20">
										<td></td>
									</tr>
									<tr>
										<td align="center">您好，<font color="red">${user.userName }</font>
										<a href="<%=basePath%>user/layout.action">[退出]</a>
											<!-- BLOG信息 --><!-- /BLOG信息 -->										</td>
									</tr>
									<tr height="10">
										<td></td>
									</tr>
									<tr>
										<td align="center">欢迎登录后台管理系统
											<!-- 个人服务 --><!-- /个人服务 -->										</td>
									</tr>
									<tr height="55">
										<td></td>
									</tr>
									<tr>
									  <td align="left" style="padding-left: 20px;line-height: 20px;">名称：北京实创餐饮管理有限公司
										  <!-- 个人信息 --><!-- /个人信息 -->										</td>
									</tr>
									<tr height="10">
										<td></td>
									</tr>
									<tr>
									  <td align="left" style="padding-left: 20px;line-height: 20px;">联系电话：010-391341
										  <!-- 个人信息 --><!-- /个人信息 -->										</td>
									</tr>
									<tr height="10">
										<td></td>
									</tr>
									<tr class="ctrl_menu">
									  <td align="left" style="padding-left: 20px;line-height: 20px;">邮箱：hx-jfkl@hx.mail.com</td>
								  </tr>
								  <tr height="10">
										<td></td>
									</tr>
								<tr class="ctrl_menu">
									  <td align="left" style="padding-left: 20px;line-height: 20px;">地址：北京市西直门内大街118号</td>
								  </tr>
									<tr height="30">
										<td></td>
									</tr>
									<tr height="5">
										<td >
										<img alt="" src="/images/index_phone.gif" style="margin-left: 3px;">
										</td>
									</tr>
								</tbody></table>
						  <!-- /控制面板菜单 -->						  </td>
						</tr>
				  </tbody></table>
			  </td>
			  <td width="755" align="center" valign="top">
			    <div width="100%">
						<iframe width="750" height="520" onunload="this.height=280;" onload="" frameborder="0" id="mainFrame" name="mainFrame" src="<%=basePath%>company/getCompanyData.action">您的浏览器不支持此功能，请您使用最新的版本。</iframe>
				  </div>
			  </td>
			</tr>
	</tbody></table>
		<br>
	
<!--foot-->
  <div id="box_05" align="center" style="font-size: 12px">
    <div id="link"> <b>友情链接</b></div>
    <hr width="960px;"/>
    <div id="copyright" style="margin-top: 10px;line-height: 25px;"><a href="#" target="_blank">关于我们</a>　|　<a href="#" target="_blank">常见问题</a>　|　<a href="#" target="_blank">联系我们</a>　|　<a href="#" target="_blank">京东代购</a> | <a href="#" target="_blank">积分商品</a> <br />
      版权所有 2004-2007,-SHOP 因特网信息服务业务经营许可证号：<a href="#" target="_blank">京ICP证</a>xxxxxx号 &nbsp;</div>
  </div>

</body></html>
