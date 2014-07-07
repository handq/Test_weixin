<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://www.hx.com/tags" prefix="hx" %>

<%   String path = request.getContextPath();   
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<hx:ajax jquery="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>登录</title>
<javaScript language="javaScript" src="js/CancelIntercept.js">
</javaScript>
<style type="text/css">
<!--
body {
	margin-top: 0px;
	margin-bottom: 0px;
	background-image: url(/images/login_p_bg.jpg);
}
-->
</style>
<script type="text/javascript">
	function toLogin(){
		var username = document.getElementById("userName").value;
		var userPass = document.getElementById("userPass").value;
		if(username==""){
			alert("请输入用户名！");
			return;
		}else if(userPass==""){
			alert("请输入密码！");
			return;
		}else{
			$hx.service("usa.volidate",[username,userPass],function(result){
		        if(result){
		        	$("#form1").submit();
		        }else{
		        	alert("验证失败");
		        }
		    });
		}
	}
</script>
<link href="/cssfiles/css.css" rel="stylesheet" type="text/css" />
</head>

<body>
<table width="980" border="0" align="center" cellpadding="4" cellspacing="0">
  <tr>
    <td align="left"><img src="/images/login_logo.jpg" width="244" height="128" /></td>
  </tr>
  <tr>
    <td height="79" align="left">&nbsp;</td>
  </tr>
  <tr><form id="form1" name="form1" method="post" action="/user/login.action" target="_self">
    <td align="center">
      <table width="432" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><img src="/images/login_top.jpg" width="432" height="25" /></td>
        </tr>
        <tr>
          <td height="152" align="center" background="/images/login_center.jpg"><table width="422" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="147" align="center"><img src="/images/login_ico.gif" width="93" height="140" /></td>
              <td width="13" align="center">&nbsp;</td>
              <td width="262" align="left" valign="top"><table width="100%" border="0" cellpadding="4" cellspacing="0" class="text">
                <tr>
                  <td align="center"><img src="/images/login_ico01.gif" width="196" height="29" /></td>
                </tr>
                <tr>
                  <td align="center" valign="middle">用户名：
                    
                    <s:textfield name="user.userName"  value=""  id="userName"  required="true" size="25" requiredposition="left" />
                    </td>
                </tr>
                <tr>
                  <td align="center" valign="middle">密&nbsp;&nbsp;码：
                   
                    <s:password name="user.userPass"  value="" id="userPass"  required="true" size="25" requiredposition="left" />
                    </td>
                </tr>
                <tr>
                  <td height="8" align="center"></td>
                </tr>
                
                <tr>
                  <td align="center">
                  <img src="/images/login_button01.gif" alt=""  onclick="toLogin();"/>
                    &nbsp;&nbsp;
                    <img src="/images/login_button02.gif" alt=""  onclick=""/>
                    </td>
                </tr>
              </table></td>
            </tr>
          </table></td>
        </tr>
        <tr>
          <td><img src="/images/login_down.jpg" width="432" height="25" /></td>
        </tr>
        <tr>
          <td><img src="/images/login_image.jpg" width="432" height="73" /></td>
        </tr>
      </table>
           </td> 
       </form>  
  </tr>
</table>
</body>
</html>
