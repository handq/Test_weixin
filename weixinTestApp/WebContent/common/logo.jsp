<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body>
<div class="wide">
  <div class="logo"><a href="${pageContext.request.contextPath}/toIndex.action"><img src="${pageContext.request.contextPath}/images/logo1.jpg"  alt="" /></a></div><div class="city">
  
  <%-- <form action="" method="get"><select name="">
    <option>济南</option>
    <option>深圳</option>
  </select>
   --%>
  </form></div><div class="search"><div class="inp">
  
  <form id="searchform" action="searchDetailsByName.action" method="post" >
  	<input type="submit" name="Submit" class="inp_2"  value="" />
  	<input type="text" name="searchName" id="searchName" size="50" class="inp_1"/>
  </form>
  </div>
  <p>
  		<s:if test="null!=hotSearchLists">
	  		热门搜索：
			<s:iterator value="hotSearchLists" id="searchVar">
					<a href="${pageContext.request.contextPath}/searchDetailsByNameStrEncodingChange.action?searchName=${searchVar['searchName']}">${searchVar["searchName"]}&nbsp;</a>	
			</s:iterator>  
  		</s:if>
  </p>
</div></div>

</body>
</html>