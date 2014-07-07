<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>404错误提示页</title>
	<meta name="description" content="">
	<meta name="author" content="">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<!-- CSS: implied media=all -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/404style.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/404blue.css">
	<script src="${pageContext.request.contextPath}/js/jquery-404.js"></script>
	<script src="${pageContext.request.contextPath}/js/404script.js"></script>
    <style type="text/css">
<!--
.STYLE1 {color: #FF0000}
-->
    </style>
</head>
<body>
	<div id="error-container">
		<div id="error">
			<div id="pacman"></div>
		</div>		
		<div id="container">
			<div id="title">
				<h1>对不起, 你访问的页面不存在!</h1>
			</div>
			<div id="content">
				<div class="left">
					<p class="no-top">&nbsp;&nbsp;&nbsp;可能是如下原因引起了这个错误:</p>
					<ul>
						<li>&nbsp;&nbsp;&nbsp;URL输入错误</li>
						<li>&nbsp;&nbsp;&nbsp;链接已失效</li>
						<li>&nbsp;&nbsp;&nbsp;其他原因...</li>
					</ul>
                    <div class="clearfix"></div>
				</div>
				<div class="right">					
					<p class="no-top">推荐您通过以下链接继续访问本站：</p>
					<ul class="links">
						<li><a href="${pageContext.request.contextPath}/toIndex.action">»返回市尚首页</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
				<div align="center"><span class="STYLE1">你找不到的只是网页，他们找不到的却是家和亲人！爱心公益，需要你我...                </span>									</br>
			  </div>
				<iframe scrolling='no' frameborder='0' src='http://yibo.iyiyun.com/js/yibo404/key/7611' width='640' height='462' style='display:block;'></iframe>
			</div>
		
		</div>
	</div>
</body>
</html>