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
<hx:ajax jquery="true"/>
<link href="css/style.css" rel="stylesheet" type="text/css">
<style type="text/css">
body{
	background-color: white;
}
</style>
<script type="text/javascript">
	function submitCompany(){
		var murl = "<%=basePath%>company/saveCompany.action";
		var parmers = $("#companyAddFrm").serialize();
		$.post(murl,parmers,function(boo){
			if(boo){
				top.document.getElementById("mainFrame").src="<%=basePath%>company/getCompanyData.action";
			}
			
		});
	}
</script>
	</head>
	<body>
		<div style="font-size: 12px;line-height:25px;color: red ">当前位置：企业信息维护</div>
		<div align="center">
			<h3>企业基本信息</h3>
			<hr/>
		</div>
		<div align="center">
			
		</div>
		<s:form method="post" name="companyAddFrm" id="companyAddFrm" action="/company/saveCompany.action">
		<s:hidden name="company.id"/>
			<table width="100%" border="0"  cellpadding="0" cellspacing="0"
			style="font-size: 13px;margin-top: 10px;text-align: center;" >
				<tr onMouseOut="this.style.background='#eeeeee'"
						onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee" style="height: 35px;">
				<td valign="middle"  width="10%">
					企业名称
				</td>
				<td align="center" valign="middle" colspan="3" width="90%">
					<s:textfield name="company.CName"  style="width: 100%" requiredposition="left" />
				</td>
				
				</tr>
				<tr onMouseOut="this.style.background='#ffffff'"
						onMouseOver="this.style.background='#F4E088'" bgcolor="#ffffff">
				<td valign="middle" width="10%">
					企业编码
				</td>
				<td align="center" valign="middle" width="40%">
					<s:textfield name="company.CCode"  style="width: 100%" requiredposition="left" />
				</td>
				<td align="center" valign="middle" width="10%">
					网址
				</td>
				<td align="center" valign="middle" width="40%">
					<s:textfield name="company.CLink"  style="width: 100%" requiredposition="left" />
				</td>
				</tr>
				<tr onMouseOut="this.style.background='#eeeeee'"
						onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee">
				<td valign="middle">
					传真
				</td>
				<td align="center" valign="middle">
					<s:textfield name="company.CFax"  style="width: 100%" requiredposition="left" />
				</td>
				<td align="center" valign="middle">
					邮箱
				</td>
				<td align="center" valign="middle">
					<s:textfield name="company.CEmail"  style="width: 100%" requiredposition="left" />
				</td>
				</tr>
				<tr onMouseOut="this.style.background='#ffffff'"
						onMouseOver="this.style.background='#F4E088'" bgcolor="#ffffff">
				<td valign="middle">
					地址
				</td>
				<td align="center" valign="middle" >
					<s:textfield name="company.CAddress"  style="width: 100%" requiredposition="left" />
				</td>
				<td valign="middle">
					地理位置
				</td>
				<td align="center" valign="middle" >
					<s:textfield name="company.CLocation"  style="width: 100%" requiredposition="left" />
				</td>
				</tr>
				<tr onMouseOut="this.style.background='#eeeeee'"
					onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee">
				<td valign="middle">
					路线
				</td>
				<td align="center" valign="middle" colspan="3">
					<s:textfield name="company.CBusline"  style="width: 100%" requiredposition="left" />
				</td>
				</tr>
				<%-- <tr onMouseOut="this.style.background='#ffffff'"
					onMouseOver="this.style.background='#F4E088'" bgcolor="#ffffff">
				<td valign="middle">
					联系方式
				</td>
				<td align="center" valign="middle" colspan="3">
					<s:textfield name="company.Relations"  style="width: 100%" requiredposition="left" />
				</td>
				</tr> --%>
				<tr onMouseOut="this.style.background='#ffffff'"
					onMouseOver="this.style.background='#F4E088'" bgcolor="#ffffff">
				<td valign="middle">
					简介
				</td>
				<td align="center" valign="middle" colspan="3">
					<s:textarea name="company.CInfomation" rows="4" cols="3" style="width: 100%" requiredposition="left" />
				</td>
				</tr>
				<tr onMouseOut="this.style.background='#eeeeee'"
					onMouseOver="this.style.background='#F4E088'" bgcolor="#eeeeee">
				<td valign="middle">
					备注
				</td>
				<td align="center" valign="middle" colspan="3">
					<s:textarea name="company.CDesc" rows="4" cols="3" style="width: 100%" requiredposition="left" />
				</td>
				</tr>
			</table>
			<div align="center" style="margin-top: 20px;">
				<button onclick="submitCompany()" >保存</button>
			</div>
		</s:form>
		
	</body>
</html>

