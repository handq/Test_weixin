<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 	<s:if test="null==#session.username">
 		[ <a href="${pageContext.request.contextPath}/toLogin.action">登录</a> | <a href="${pageContext.request.contextPath}/toReg.action">注册</a> ]
 	</s:if>
 	<s:else>
 	您好  <s:property value="#session.username"/> 欢迎来到市尚！
 		[ <a href="${pageContext.request.contextPath}/login/quit.action">安全退出</a> | <a href="${pageContext.request.contextPath}/jumpToUserSelfHome.action">我的账户</a> ]
 	</s:else>
</body>
</html>