<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="市尚">
<title>市尚 做自己的老板</title>
<link href="${pageContext.request.contextPath}/css/div.css" rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath}/js/jquery-1.4.2.min.js" type=text/javascript></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/coin-slider.min.js"></script>

<script>
$(document).ready(function() {
	$('#games').coinslider({ hoverPause: false });
});
</script>
</head>

<body>
<div id="head">
<p id="login_right">
	<%@include file="/common/header.jsp"%></p>
	<span  class="fav" style="CURSOR: hand" onclick="window.external.addFavorite('http://xxxxx/','市尚')" title="市尚">收藏市尚</span>
</div>

<%@include file="/common/logo.jsp" %>
 <div class="clear"></div>
<div class="wide"> 
	<%@include file="/common/navigation.jsp" %>
</div>

<div class="wide">
  <div id="t_left"><img src="images/qie_22.jpg" width="317" height="217" alt="" /><img src="images/qie_28.jpg" width="317" height="75" alt="" /></div><div id="t_right"><div id="page">
  <div id="gamesHolder">
		<div id="games">
			<a href="#" target="_blank">
			<img src="images/01.jpg" alt="Mini Ninjas" /></a>
			<a href="#" target="_blank">
				<img src="images/02.jpg" alt="Price of Persia" />
			</a>
            	<a href="#" target="_blank">
			<img src="images/01.jpg" alt="Mini Ninjas" /></a>
			<a href="#" target="_blank">
				<img src="images/03.jpg" alt="Spiderman: Shattered Dimensions" />
			</a>
				<a href="#" target="_blank">
				<img src="images/02.jpg" alt="Price of Persia" />
			</a>
		</div>

  </div>
</div>
</div>
</div>
 <div class="clear"></div>
<div class="flash tjbg">  
<div class="more"><a href="#">本周推荐 更多</a></div>
<div class="box_k">
   <p> <a  href="${pageContext.request.contextPath}/show/show_intro.jsp"><img src="images/photo.jpg" /></a>
	</p>
  </div>
  <div class="box_k">
  <ul class="f12">
				<li>羽毛球教练：李宗伟</li>
				<li>指教时间：3年	</li>
				<li>价格：80元/小时</li>
                <li>s擅长项目：羽毛球教练多年，经验丰富，教学质量好</li>
    </ul>
  </div>
  <div class="box_k">
   <p> <a href="#"><img src="images/photo.jpg" /></a>
	</p>
  </div>
  <div class="box_k">
  <ul class="f12">
				<li>羽毛球教练：李宗伟</li>
				<li>指教时间：3年	</li>
				<li>价格：80元/小时</li>
                <li>s擅长项目：羽毛球教练多年，经验丰富，教学质量好</li>
    </ul>
  </div>
  <div class="box_k">
   <p> <a href="#"><img src="images/photo.jpg" /></a>
	</p>
  </div>
  <div class="box_k">
  <ul class="f12">
				<li>羽毛球教练：李宗伟</li>
				<li>指教时间：3年	</li>
				<li>价格：80元/小时</li>
                <li>s擅长项目：羽毛球教练多年，经验丰富，教学质量好</li>
    </ul>
  </div>
</div>
<div class="clear"></div>
<div class="flash ydbg"> 
<div class="more"><a target="_blank" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=1 ">更多</a></div>
 			
 			<s:iterator value="yundongDetails" id="detailVar">
					<li>
					<div class="box_k">
					   <p> <a target="_blank" href="${pageContext.request.contextPath}/showDetailById.action?detailId=${detailVar.id}">
					   
					   <img width="90" 
						   			src="${pageContext.request.contextPath}/upload/${detailVar['trCreateuser']}/head/${detailVar['indexImage']['trdiUrl']}"
						   			 onerror="javascript:this.src='${pageContext.request.contextPath}/images/photo.jpg'">
					   </a>
						</p>
					</div>
					<div class="box_k">
					  <ul class="f12">
					  				<li>名称：<s:property value="#detailVar.trName"/> </li>
									<li>教练：<s:property value="#detailVar.user.realName"/></li>
									<li>
										<s:if test="#detailVar.experienceTime==0">
												指教时间：小于1年
											</s:if>
											<s:elseif test="#detailVar.experienceTime==11">
												指教时间：大于10年
											</s:elseif>
											<s:else>
												指教时间：${detailVar.experienceTime}年	
											</s:else>
									</li>
									<li>价格：<s:property value="#detailVar.trPrice"/>元/小时</li>
					                <li>简介：${detailVar.trResume}</li>
					    </ul>
					</div> 
					</li>
			</s:iterator>

</div>
<div class="clear"></div>
<div class="flash jzbg">  
<div class="more"><a target="_blank"  href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=2">更多</a></div>
		<s:iterator value="jiazhengDetails" id="detailVar">
					<li>
					<div class="box_k">
					   <p> <a target="_blank" href="${pageContext.request.contextPath}/showDetailById.action?detailId=${detailVar.id}">
					   <img width="90" 
						   			src="${pageContext.request.contextPath}/upload/${detailVar['trCreateuser']}/head/${detailVar['indexImage']['trdiUrl']}"
						   			 onerror="javascript:this.src='${pageContext.request.contextPath}/images/photo.jpg'">
					   </a>
						</p>
					</div>
					<div class="box_k">
					  <ul class="f12">
					  				<li>名称：<s:property value="#detailVar.trName"/> </li>
									<li>教练：<s:property value="#detailVar.user.realName"/></li>
									<li>
										<s:if test="#detailVar.experienceTime==0">
												指教时间：小于1年
											</s:if>
											<s:elseif test="#detailVar.experienceTime==11">
												指教时间：大于10年
											</s:elseif>
											<s:else>
												指教时间：${detailVar.experienceTime}年	
											</s:else>
									</li>
									<li>价格：<s:property value="#detailVar.trPrice"/>元/小时</li>
					                <li>简介：${detailVar.trResume}</li>
					    </ul>
					</div> 
					</li>
			</s:iterator>


</div>
<div class="clear"></div>
<div class="flash enbg"> 
<div class="more"><a  target="_blank" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=3">更多</a></div>
 		<s:iterator value="englishDetails" id="detailVar">
					<li>
					<div class="box_k">
					   <p>
						   <a target="_blank" 
						   		href="${pageContext.request.contextPath}/showDetailById.action?detailId=${detailVar.id}">
						   		<img width="90" 
						   			src="${pageContext.request.contextPath}/upload/${detailVar['trCreateuser']}/head/${detailVar['indexImage']['trdiUrl']}"
						   			 onerror="javascript:this.src='${pageContext.request.contextPath}/images/photo.jpg'"></a>
						</p>
					</div>
					<div class="box_k">
					  <ul class="f12">
					  				<li>名称：<s:property value="#detailVar.trName"/> </li>
									<li>教练：<s:property value="#detailVar.user.realName"/></li>
									<li>
										<s:if test="#detailVar.experienceTime==0">
												指教时间：小于1年
											</s:if>
											<s:elseif test="#detailVar.experienceTime==11">
												指教时间：大于10年
											</s:elseif>
											<s:else>
												指教时间：${detailVar.experienceTime}年	
											</s:else>
									</li>
									<li>价格：<s:property value="#detailVar.trPrice"/>元/小时</li>
					                <li>简介：${detailVar.trResume}</li>
					    </ul>
					</div> 
					</li>
			</s:iterator>
 
</div>
<div class="clear"></div>
<div class="flash jjbg"> 
<div class="more"><a target="_blank" href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=4">更多</a></div>
 		<s:iterator value="jiajiaoDetails" id="detailVar">
					<li>
					<div class="box_k">
					   <p> <a target="_blank" href="${pageContext.request.contextPath}/showDetailById.action?detailId=${detailVar.id}">
					  <img width="90" 
						   			src="${pageContext.request.contextPath}/upload/${detailVar['trCreateuser']}/head/${detailVar['indexImage']['trdiUrl']}"
						   			 onerror="javascript:this.src='${pageContext.request.contextPath}/images/photo.jpg'">
					   </a>
						</p>
					</div>
					<div class="box_k">
					  <ul class="f12">
					  				<li>名称：<s:property value="#detailVar.trName"/> </li>
									<li>教练：<s:property value="#detailVar.user.realName"/></li>
									<li>
										<s:if test="#detailVar.experienceTime==0">
												指教时间：小于1年
											</s:if>
											<s:elseif test="#detailVar.experienceTime==11">
												指教时间：大于10年
											</s:elseif>
											<s:else>
												指教时间：${detailVar.experienceTime}年	
											</s:else>
									</li>
									<li>价格：<s:property value="#detailVar.trPrice"/>元/小时</li>
					                <li>简介：${detailVar.trResume}</li>
					    </ul>
					</div> 
					</li>
			</s:iterator>
 
</div>
<div class="clear"></div>
<div class="flash shbg">
<div class="more"><a target="_blank"  href="${pageContext.request.contextPath}/showDetailMsgByChannel.action?channelId=5">更多</a></div>
  	<s:iterator value="lifeDetails" id="detailVar">
					<li>
					<div class="box_k">
					   <p> <a target="_blank" href="${pageContext.request.contextPath}/showDetailById.action?detailId=${detailVar.id}">
					   
					   <img width="90" 
						   			src="${pageContext.request.contextPath}/upload/${detailVar['trCreateuser']}/head/${detailVar['indexImage']['trdiUrl']}"
						   			 onerror="javascript:this.src='${pageContext.request.contextPath}/images/photo.jpg'">
					   </a>
						</p>
					</div>
					<div class="box_k">
					  <ul class="f12">
					  				<li>名称：<s:property value="#detailVar.trName"/> </li>
									<li>教练：<s:property value="#detailVar.user.realName"/></li>
									<li>
											<s:if test="#detailVar.experienceTime==0">
												指教时间：小于1年
											</s:if>
											<s:elseif test="#detailVar.experienceTime==11">
												指教时间：大于10年
											</s:elseif>
											<s:else>
												指教时间：${detailVar.experienceTime}年	
											</s:else>	
									</li>
									<li>价格：<s:property value="#detailVar.trPrice"/>元/小时</li>
					                <li>简介：${detailVar.trResume}</li>
					    </ul>
					</div> 
					</li>
			</s:iterator>
  
</div>
<div class="clear"></div>
<!-- 页脚 -->
<%@include file="/common/footer.jsp" %>
</body>
</html>
