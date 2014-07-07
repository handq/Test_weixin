<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://www.hx.com/tags" prefix="hx" %>

<%   String path = request.getContextPath();   
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
}

</script>
</head>
<body onload="window.location = <%=basePath%>/userMenu/findAllMenus.action">
<center style="font-size: 20px;font-weight: bold;text-align: center">自定义菜单管理</center>
<br/>


<button onclick="toExceute()">更新菜单</button>
<table border="1" cellpadding="0" cellspacing="0" width="100%" style="font-size: 12px; text-align:center;">
	<tr  style="height: 30px;font-size: 14px;font-weight: bold;">
		<td>菜单类型</td>
		<td>菜单名称</td>
		<td>菜单编码</td>
		<td>菜单级别</td>
		<td>菜单顺序</td>
		<td>链接地址</td>
		<td>操作</td>
	</tr>
	<s:iterator var="ent" value="#request.userMenus" status="statu">
	<s:if test="%{#ent.usermenuLeve==1}">
	<tr style="background-color: #cccccc;height: 30px;">
		<td>
		${ent.usermenuType}
		</td>
		<td>${ent.usermenuName}</td>
		<td>${ent.usermenuCode}</td>
		<td>
		<s:if test="%{#ent.usermenuLeve==1}">
			一级菜单
		</s:if>
		<s:elseif test="%{#ent.usermenuLeve==2}">
			二级菜单
		</s:elseif>
		<s:else>
			字符菜单
		</s:else>
		</td>
		<td>${ent.usermenuNo}</td>
		<td>${ent.usermenuLink}</td>
		<td><a>修改</a> <a>新增</a></td>
	</tr>
		<s:iterator var="ent2" value="#request.userMenus" status="statu2">
			<s:if test="%{#ent.id==#ent2.fkUmid}">
			<tr>
			<td colspan="7">
				<table border="0" cellpadding="0" cellspacing="0" width="100%" style="font-size: 10px; text-align:center;">
					<tr style="height: 30px;">	
						<td>|-</td>
						<td>
						${ent2.usermenuType}
						</td>
						<td>${ent2.usermenuName}</td>
						<td>${ent2.usermenuCode}</td>
						<td>
						<s:if test="%{#ent2.usermenuLeve==1}">
							一级菜单
						</s:if>
						<s:elseif test="%{#ent2.usermenuLeve==2}">
							二级菜单
						</s:elseif>
						<s:else>
							字符菜单
						</s:else>
						</td>
						<td>${ent2.usermenuNo}</td>
						<td>${ent2.usermenuLink}</td>
						<td><a>修改</a> <a>删除</a></td>
					</tr>
				</table>
			</td>
		</tr>
			</s:if>
		</s:iterator>
		
		
	</s:if>
	<s:else>
	<%-- <tr style="height: 30px;">
		<td>
		${ent.usermenuType}
		</td>
		<td>${ent.usermenuName}</td>
		<td>${ent.usermenuCode}</td>
		<td>
		<s:if test="%{#ent.usermenuLeve==1}">
			一级菜单
		</s:if>
		<s:elseif test="%{#ent.usermenuLeve==2}">
			二级菜单
		</s:elseif>
		<s:else>
			字符菜单
		</s:else>
		</td>
		<td>1</td>
		<td>www.baidu.com</td>
	</tr> --%>
	</s:else>	
	
</s:iterator>
</table>
</body>
</html>