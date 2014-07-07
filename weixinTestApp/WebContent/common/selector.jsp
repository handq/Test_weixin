<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="javascript" />
<meta name="description" content="javascript" />
<title>jQuery商品属性(多选)选择器代码-素材中国一流素材网</title>
<link href="${pageContext.request.contextPath}/css/property-selector.css" type="text/css" rel="stylesheet" media="all" />
<base target="_blank" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/property-selector.js"></script>
<script type="text/javascript">
	jQuery.PropertySelector.select();
	$('#save-selected').click(function(){
		var savedValueToUrl = jQuery.PropertySelector.getSelectedValuesToURL();
		alert(savedValueToUrl);
	});
</script>

</head>
<body>	
<div class="property-md" id="property-selector">

<div class="property-bd">
	<h3 id="area">区域：</h3>
	<ul>
		<li><a href="area/shizhong">市中区</a></li>
		<li><a href="area/lixia">历下区</a></li>
		<li><a href="area/licheng">历城区</a></li>
		<li><a href="area/huiyin">槐荫区</a></li>
		<li><a href="area/gaoxin">高新区</a></li>
		<li><a href="area/changqin">长清区</a></li>
    </ul>
</div>
<div class="property-bd">
	<h3 id="coach">类别：</h3>
	<ul>
        <li><a href="coach/jianshen">健身教练</a></li>
        <li><a href="coach/baolingqiu">保龄球教练</a></li>
        <li><a href="coach/paiqiu">排球教练</a></li>
        <li><a href="coach/youyong">游泳教练</a></li>
        <li><a href="coach/wushu">武术教练</a></li>
        <li><a href="coach/taiquandao">跆拳道教练</a></li>
	 <li><a href="coach/taiji">太极拳教练</a></li>
	 <li><a href="coach/lunhua">轮滑教练</a></li>	
</ul>
</div>	
<div class="property-bd">
	<h3 id="gender">性别：</h3>
	<ul>
        <li><a href="gender/nan">男</a></li>
        <li><a href="gender/nv">女</a></li>
	</ul>
</div>	
<div class="property-bd">
	<h3 id="jibie">运动级别：</h3>
	<ul>
		<li><a href="jibie/wu">无</a></li>
		<li><a href="jibie/erji">国家二级</a></li>
		<li><a href="jibie/yiji">国家一级</a></li>
		<li><a href="jibie/jianjiang">国家健将</a></li>
		
	</ul>
</div>
<div class="property-bd">
	<h3 id="service">服务项目：</h3>
	<ul>
		<li><a href="serice/qingshaonian">青少年培训</a></li>
		<li><a href="serice/yiduiyi">一对一私教</a></li>
		<li><a href="serice/yiduiduo">一对多小班授课</a></li>
		<li><a href="serice/chuxuezhe">初学者教学</a></li>
		<li><a href="serice/guojijianjiang">国际健将</a></li>
		<li><a href="serice/tigaojinji">提高晋级</a></li>
		<li><a href="serice/peida">陪打</a></li>
		<li><a href="serice/peilian">陪练</a></li>
		<li><a href="serice/huisuodaike">会所代课</a></li>
		<li><a href="serice/caipan">裁判</a></li>
		<li><a href="serice/hanyushouke">韩语授课</a></li>
		<li><a href="serice/qiuduipeixun">球队培训</a></li>
		<li><a href="serice/yingyushouke">英语授课</a></li>
	</ul>
</div>
<div class="property-hd" id="property-header"><h2>您选择的东西（多选）：</h2><button type="button" id="save-selected">保存选择</button></div>	
</div>		


</body>
</html>