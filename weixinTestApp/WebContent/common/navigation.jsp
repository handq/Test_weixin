<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<img src="${pageContext.request.contextPath}/images/qie_18.jpg" alt="" width="994" height="43" border="0" usemap="#Map" />
  <map name="Map" id="Map">
    <area shape="rect" coords="70,9,153,37" href="${pageContext.request.contextPath}/toIndex.action" />
    <area shape="rect" coords="214,10,299,34" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=1" />
    <area shape="rect" coords="362,11,444,37" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=2" />
    <area shape="rect" coords="500,10,552,34" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=3" />
    <area shape="rect" coords="608,10,662,34" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=4" />
    <area shape="rect" coords="712,9,804,34" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=5" />
    <area shape="rect" coords="855,11,925,32" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=6" />
  </map>

</body>
</html>