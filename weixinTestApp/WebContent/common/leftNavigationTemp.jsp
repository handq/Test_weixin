<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<div class="xx3left"><h2>我的市尚</h2>
<s:iterator value="lists" status="st" id="catalog">
	<s:if test="#catalog.url==''">
			<s:if test="#catalog.name.equals('我是卖家')&&#session.loginUser.tuStatus==1">
					<!-- 如果已经申请称为商家，就不要再申请称为第二个商家了 -->
					<h4 class="itemh4"><s:property value="#catalog.name"></s:property></h4>
					<s:if test="#catalog.childCatalog.size>0"></s:if>
					<div class="item">
						<s:iterator value="#catalog.childCatalog" id="children">
					  		<p><a href="${pageContext.request.contextPath}<s:property value='#children.url'></s:property>"><s:property value="#children.name"></s:property></a></p>
						</s:iterator>
					</div>
				
			</s:if>
			<s:if test="#catalog.name.equals('做自己的老板')&&#session.loginUser.tuStatus==0||#catalog.name.equals('做自己的老板')&&#session.loginUser.tuStatus==null">
				<!-- 如果已经申请称为商家，就不要再申请称为第二个商家了 -->
					<h4 class="itemh4"><s:property value="#catalog.name"></s:property></h4>
					<s:if test="#catalog.childCatalog.size>0"></s:if>
					<div class="item">
						<s:iterator value="#catalog.childCatalog" id="children">
					  		<p><a href="${pageContext.request.contextPath}<s:property value='#children.url'></s:property>"><s:property value="#children.name"></s:property></a></p>
						</s:iterator>
					</div>
			</s:if>
			
			<s:if test="#catalog.name!='我是卖家'&&#catalog.name!='做自己的老板'">
				<h4 class="itemh4"><s:property value="#catalog.name"></s:property></h4>
				<s:if test="#catalog.childCatalog.size>0"></s:if>
				<div class="item">
					<s:iterator value="#catalog.childCatalog" id="children">
				  		<p><a href="${pageContext.request.contextPath}<s:property value='#children.url'></s:property>"><s:property value="#children.name"></s:property></a></p>
					</s:iterator>
				</div>
			</s:if>
	</s:if>
	
</s:iterator>



	</div>

</body>
</html>