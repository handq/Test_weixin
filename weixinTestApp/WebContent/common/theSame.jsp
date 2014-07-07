<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>人气教练</title>
</head>
<body>
<ul>
	<!-- 点击这个商品详细的按钮时，同时选出来和该教练相似的教练 -->
	<s:iterator value="theSameDetailsOrderByCount"  id="detailVal">
		<li>
			<div>
			  <a target="_blank" href="${pageContext.request.contextPath}/showDetailById.action?detailId=${detailVal.id}" >
					<img src="${pageContext.request.contextPath}/upload/${detailVal['trCreateuser']}/head/${detailVal['indexImage']['trdiUrl']}" 
						onerror="javascript:this.src='${pageContext.request.contextPath}/images/photo.jpg'" width="76" height="76" border="0"/>
				</a>
			</div>
			<p>
				<a href="#">${detailVal["user"]["realName"]}</a>
			</p>
			<p>价格：<b class="red">${detailVal["trPrice"]}</b></p>
			<p>人气指数：${detailVal.trCount}</p>				
		</li>
   </s:iterator>     
</ul>
</body>
</html>