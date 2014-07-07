<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<div class="xx3left"><h2>我的市尚</h2>

<h4 class="itemh4">账户中心</h4>
<div class="item">
  <p><a href="${pageContext.request.contextPath}/user/use.jsp">我的订单</a></p>
  <p><a href="${pageContext.request.contextPath}/user/use_intr.jsp">我的账户</a></p>
  <p><a href="${pageContext.request.contextPath}/user/use_pay.jsp">在线充值</a></p>
  <p><a href="${pageContext.request.contextPath}/user/use_shop.jsp">账户消费记录</a></p>
  <p><a href="${pageContext.request.contextPath}/user/use_set.jsp">账户设置</a></p>
</div>

<h4 class="itemh4">做自己的老板</h4>
<div class="item">
  <p><a href="${pageContext.request.contextPath}/user/home_boss.jsp">申请卖家</a></p>
</div>

<h4 class="itemh4">我是卖家</h4>
<div class="item">
  <p><a href="${pageContext.request.contextPath}/user/sellers.jsp">订单管理</a></p>
  <p><a href="${pageContext.request.contextPath}/user/sellers_time.jsp">时间管理</a></p>
  <p><a href="${pageContext.request.contextPath}/user/sellers_data.jsp">我的资料</a></p>
  <p><a href="${pageContext.request.contextPath}/showMyAllHeadPhotos.action">我的相册</a></p>
</div>

<h4 class="itemh4">如果是机构</h4>
<div class="item">
  <p><a href="${pageContext.request.contextPath}/user/agency.jsp">申请加盟</a></p>
</div>

	</div>

</body>
</html>