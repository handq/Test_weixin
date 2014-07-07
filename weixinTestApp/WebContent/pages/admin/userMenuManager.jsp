<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://www.hx.com/tags" prefix="hx" %>
<%   String path = request.getContextPath();   
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<html>
	<head>
	<title>无标题文档</title>
	<link href="css/style.css" rel="stylesheet" type="text/css">
	<hx:ajax/>
	<script type="text/javascript">
	function toExceute(){
		$hx.service("uma.updateUserMenusAjax",[],function(result){
	        if(result){
	        	alert("菜单更新成功！");
	        }else{
	        	alert("菜单更新失败");
	        }
	    });
	};
	
	function toAdd(num){
		$hx.service("uma.isAddMenuAjax",[num],function(result){
	        if(result){
	        	var  curl ="<%=basePath%>userMenu/getParentUserMenus.action?userMenu.id="+num;
	        	var subWin = window.showModalDialog(curl,"新增自定义菜单","dialogWidth:400px;dialogHeight:280px;dialogLeft:200px;center:yes;help:no;resizable:no;status:no;scroll=no");
	        	subWin.onunload(doload());
	        }else{
	        	alert("菜单数量已经达到上限，不能新增！");
	        }
	    });
	};
	
	function toEdit(mid){
		var  curl ="<%=basePath%>userMenu/editUserMenu.action?userMenu.id="+mid;
    	var subWin = window.showModalDialog(curl,"修改自定义菜单","dialogWidth:400px;dialogHeight:280px;dialogLeft:200px;center:yes;help:no;resizable:no;status:no;scroll=no");
    	subWin.onunload(doload());
	}
	
	function delMenu(mid){
		$hx.service("uma.checkHaveChildsById",[mid],function(result){
			if(result){
				top.document.getElementById("mainFrame").src="<%=basePath%>userMenu/deleteUserMenu.action?userMenu.id="+mid;
			}else{
				alert("存在子菜单，不允许删除！");
			}
		});
	}
	function doload(){
		top.document.getElementById("mainFrame").src="<%=basePath%>userMenu/findAllMenus.action";
	}
	</script>
	<style type="text/css">
		body{
			background-color: white;
		}
		a:HOVER {
				color: red;
			}
	</style>
	</head>
	<body>
		<div style="font-size: 12px;line-height:25px;color: red ">当前位置：自定义菜单管理</div>
		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			class="thetable" style="font-size: 13px;margin-top: 10px;">
			<thead>
				<tr>
					<td colspan="7" style="font-weight: bold;color: blue;line-height: 20px;">
					&nbsp;&nbsp;信息列表
					<a href="javascript:void(0)" onclick="toExceute()">更新线上菜单</a>
					<a href="javascript:void(0)" onclick="toAdd('0');">新增主菜单</a>
					</td>
				</tr>
				<tr>
					<td colspan="7" style="width: 100%"><hr/></td>
				</tr>
				<tr height="30px;" style="font-weight: bold;">
					<td width="15%" align="center" valign="middle">菜单名称</td>
					<td width="15%" align="center" valign="middle">菜单类型</td>
					<td width="10%" align="center" valign="middle">菜单编码</td>
					<td width="15%" align="center" valign="middle">菜单级别</td>
					<td width="10%" align="center" valign="middle">菜单顺序</td>
					<td width="15%" align="center" valign="middle">链接地址</td>
					<td width="20%" align="center" valign="middle">操作</td>
				</tr>
			</thead>
			<s:iterator var="ent" value="#request.userMenus" status="statu">
			  <s:if test="%{#ent.usermenuLeve==1}">
			  
				<tr onMouseOut="this.style.background='#eeeeee'"
					onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee">
				<td height="29" align="center" valign="middle">
					${ent.usermenuName}
				</td>
				<td align="center" valign="middle">
					${ent.usermenuType}
				</td>
				<td align="center" valign="middle">
					${ent.usermenuCode}
				</td>
				<td align="center" valign="middle">
					<s:if test="%{#ent.usermenuLeve==1}">
						一级菜单
					</s:if>
					<s:elseif test="%{#ent.usermenuLeve==2}">
						二级菜单
					</s:elseif>
				</td>
				<td align="center" valign="middle">
					${ent.usermenuNo}
				</td>
				<td align="center" valign="middle">
					${ent.usermenuLink}
				</td>
				<td align="center" valign="middle">
					<s:if test="%{#ent.usermenuType=='view'}">
						<a href="javascript:void(0)" onclick="toEdit('${ent.id}');">修改</a>
						<a href="javascript:void(0)" onClick="delMenu('${ent.id}')">删除</a>
					</s:if>
					<s:elseif test="%{#ent.usermenuType=='complex'}">
						<a href="javascript:void(0)" onclick="toAdd('${ent.id}');">新增次菜单</a>
						<a href="javascript:void(0)" onclick="toEdit('${ent.id}');">修改</a>
						<a href="javascript:void(0)" onClick="delMenu('${ent.id}')">删除</a>
					</s:elseif>
					
				</td>
				</tr>
					<s:iterator var="ent2" value="#request.userMenus" status="statu2">
						<s:if test="%{#ent.id==#ent2.fkUmid}">
							<tr onMouseOut="this.style.background='#ffffff'"
									onMouseOver="this.style.background='#F4E088'" bgcolor="#ffffff">
									<td height="29" align="left" valign="middle">
										<font style="margin-left: 20px;">|-&nbsp;&nbsp;${ent2.usermenuName}</font>
									</td>
									<td align="center" valign="middle">
										${ent2.usermenuType}
									</td>
									<td align="center" valign="middle">
										${ent2.usermenuCode}
									</td>
									<td align="center" valign="middle">
										<s:if test="%{#ent2.usermenuLeve==1}">
											一级菜单
										</s:if>
										<s:elseif test="%{#ent2.usermenuLeve==2}">
											二级菜单
										</s:elseif>
									</td>
									<td align="center" valign="middle">
										${ent2.usermenuNo}
									</td>
									<td align="center" valign="middle">
										${ent2.usermenuLink}
									</td>
									<td align="center" valign="middle">
										<s:if test="%{#ent2.usermenuType=='view'}">
											<a href="javascript:void(0)" onclick="toEdit('${ent2.id}');">修改</a>
											<a href="javascript:void(0)" onClick="delMenu('${ent2.id}')">删除</a>
										</s:if>
										
										<s:elseif test="%{#ent2.usermenuType=='common'}">
											<a href="javascript:void(0)" onclick="toEdit('${ent2.id}');">修改</a>
											<a href="javascript:void(0)" onClick="delMenu('${ent2.id}')">删除</a>
										</s:elseif>
									</td>
								</tr>
						</s:if>
					</s:iterator>
				</s:if>
				<s:else>
				</s:else>
			</s:iterator>
		</table>
	</body>
</html>

