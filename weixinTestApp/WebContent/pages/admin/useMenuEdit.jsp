<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://www.hx.com/tags" prefix="hx" %>

<%   String path = request.getContextPath();   
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<html>
<title>无标题文档</title>
<hx:ajax jquery="true"/>

<script type="text/javascript">
	function toSubmit(){
	var murl = "<%=basePath%>userMenu/saveUserMenu.action";
	var parmers = $("#menuAddFrm").serialize();
	$.post(murl,parmers,function(boo){
		if(boo){
			window.close();
		}
		
	});
	
	}
</script>
<style type="text/css">
body{
	background-color: white;
}
form input{
	border:0px;
}

</style>
<head>
<body >
		<div style="font-size: 14px;font-weight: bold;margin-top: 10px;" align="center">自定义菜单修改</div>
		
		<form method="post" name="menuAddFrm" id="menuAddFrm" action="/userMenu/saveUserMenu.action"> 
		<s:hidden name="userMenu.id" />
		<s:hidden name="userMenu.type" value="自定义菜单"/>
		<table width="100%" border="0"  cellpadding="0" cellspacing="0"
			 style="font-size: 13px;text-align: center;margin-left: 0px;" >
			<tr onMouseOut="this.style.background='#eeeeee'"
					onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee" style="height: 35px;">
			<td valign="middle"  width="40%" >
				菜单名称
			</td>
			<td align="center" valign="middle" colspan="3" width="50%">
				<s:textfield name="userMenu.usermenuName"  required="true" style="width: 100%" requiredposition="left" />
			</td>
			
			</tr>
			<tr onMouseOut="this.style.background='#ffffff'"
					onMouseOver="this.style.background='#F4E088'" bgcolor="#ffffff">
			<td valign="middle" width="40%">
				菜单编码
			</td>
			<td align="center" valign="middle" colspan="3" width="60%">
				<s:textfield name="userMenu.usermenuCode"  required="true" style="width: 100%" requiredposition="left" />
			</td>
			</tr>
			<tr onMouseOut="this.style.background='#eeeeee'"
				onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee">
			<td valign="middle"  width="40%" >
				菜单级别
			</td>
			<td align="center" valign="middle" colspan="3" width="60%">
				<select name="userMenu.usermenuLeve"  style="width: 100%;border:0px;">
					<option  value="${userMenu.usermenuLeve}">${userMenu.usermenuLeve==1?"一级":"二级"}</option>
				</select>
			</td>
			</tr>
			<tr onMouseOut="this.style.background='#ffffff'"
				onMouseOver="this.style.background='#F4E088'" bgcolor="#ffffff">
			<td valign="middle"  width="40%" >
				菜单类型
			</td>
			<td align="center" valign="middle" colspan="3" width="60%">
				<select name="userMenu.usermenuType" style="width: 100%;border:0px;" >
					<option value="view">view</option>
					<option value="complex">complex</option>
					<option value="common">common</option>
					
				</select>
			</td>
			</tr>
			<tr onMouseOut="this.style.background='#eeeeee'"
				onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee">
			<td valign="middle"  width="40%" >
				父级菜单
			</td>
			<td align="center" valign="middle" colspan="3" width="60%">
				<select name="userMenu.fkUmid" style="width: 100%;border:0px;" >
						<option value="${userMenu.fkUmid}">${userMenu.fkUmid=='0'?"主菜单":userMenu.fkUserMenu.usermenuName}</option>
				</select>
			</td>
			</tr>
			<tr onMouseOut="this.style.background='#ffffff'"
				onMouseOver="this.style.background='#F4E088'" bgcolor="#ffffff">
			<td valign="middle" width="40%">
				菜单顺序
			</td>
			<td align="center" valign="middle" colspan="3" width="60%">
				<s:textfield name="userMenu.usermenuNo"  required="true" style="width: 100%" requiredposition="left" />
			</td>
			</tr>
			<tr onMouseOut="this.style.background='#eeeeee'"
				onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee">
			<td valign="middle" width="40%">
				菜单链接
			</td>
			<td align="center" valign="middle" colspan="3" width="60%">
				<s:textfield name="userMenu.usermenuLink"  required="true" style="width: 100%" requiredposition="left" />
			</td>
			</tr>
		</table>
		<div align="center" style="margin-top: 10px;">
			<button name="submitForm" style="width: 50px;border: 0px;" onclick="toSubmit();">保存</button> 
		</div>
		</form>
	</body>
</html>

