<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html lang="zh" > 
<head> 
<title>测试页面</title> 
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<link rel="stylesheet" href="/bootstrapDemo/bootstrap/css/bootstrap.min.css"/> 
<link rel="stylesheet" href="/bootstrapDemo/css/mystyle.css">
<style type="text/css">
	.container{
		padding-left: 0;
		padding-right: 0;
		margin-right: auto;
 		margin-left: auto;
	}
	.bottom
	{
		position:fixed;
		right:0px;
		_position:absolute;
		/*_right:17px;*/
		bottom:0px;
		background:#f1f1f1;
		color:#fff;
		border-top:1px solid #fff;
		display:block;
		width:100%;
		text-align:center;
	}
	.bottom span
	{
		position:relative;
		display:block;
		top:0;
		left:0;
		padding:1px;
	}
</style>
</head> 
<body> 
<div class="jumbotron" style="padding: 0px;">
	<!-- 轮播 -->
    <div id="myCarousel" class="carousel slide">
      <!-- Indicators -->
      <ol class="carousel-indicators" >
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner">
        <div class="item active">
          <img src="http://d.pcs.baidu.com/thumbnail/4483067964d13b62d34a0d9d05a365b1?fid=2852923105-250528-595620114049635&time=1403625600&rt=pr&sign=FDTAER-DCb740ccc5511e5e8fedcff06b081203-WAxz23hpqFMhG64KUIKJD0IYHgU%3D&expires=8h&prisign=RK9dhfZlTqV5TuwkO5ihMQzlM241kT2YfffnCZFTaEPwOxHv/XxtwRXLxDSXMBba1Ms9seOiqT9/QffwI8K2Baw0mmLABRQNl51b/oS8+InqoadADmwcypNo/dTFHAxEC4pBepMhx5G5Yk3oaKaHUoLgzh+qonpalNnA+pfMKYDycgI5A4W/Ju5XK/lbx40b+uOInJzEGY8GHCil1Zne9VFPVRVi/i9rSTA7gbivqmQ=&chkv=0&chkbd=0&size=c10000_u10000&quality=90" data-src="holder.js/100%x500/auto/#777:#7a7a7a/text:First slide" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>Example headline.</h1>
              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <p><a class="btn btn-large btn-primary" href="#">Sign up today</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="data:image/png;base64," data-src="holder.js/100%x500/auto/#777:#7a7a7a/text:Second slide" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>Another example headline.</h1>
              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <p><a class="btn btn-large btn-primary" href="#">Learn more</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img src="data:image/png;base64," data-src="holder.js/100%x500/auto/#777:#7a7a7a/text:Third slide" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>One more for good measure.</h1>
              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <p><a class="btn btn-large btn-primary" href="#">Browse gallery</a></p>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
    </div>
    
    
	<div class="container" style="width: 95%">
		<table class="table table-bordered" style="font-size: 13px; margin-top: 10px;margin-bottom:0px;" >
			<tr>
				<td>订单说明</td>		
			</tr>
			<tr style="background-color: white;">
				<td>010-8023411</td>		
			</tr>
		</table>
		<table class="table table-bordered" style="margin-top: 10px;margin-bottom:0px;font-size: 13px;" >
			<tr style="background-color: white;">
				<td style="border:0"><img  src="/images/message.jpg"></td>		
				<td>010-80841385</td>		
				<td style="border-left: 0"><img  src="/images/point.jpg"></td>		
			</tr>
			<tr style="background-color: white;">
				<td style="border-right: 0"><img  src="/images/message.jpg"></td>		
				<td>北京市东燕郊经济开发区斯普兰路南600米燕郊生态度假酒店</td>
				<td style="border-left: 0"><img alt="" src="/images/point.jpg"></td>		
			</tr>
		</table>
		<table class="table table-bordered" style="margin-top: 10px;margin-bottom:0px;font-size: 13px;" >
			<tr style="background-color: white;">
				<td>我的在线预约</td>		
			</tr>
		</table>
		
		<table class="table table-bordered"style="margin-top: 10px;margin-bottom:0px;font-size: 13px;" >
			<tr >
				<td colspan="2">请认真填写在线订单</td>		
			</tr>
			<tr style="background-color: white;border: 0">
				<td >联系人</td>		
				<td ><input type="text" class="form-control" id="inputName" placeholder="请填写名字"></td>		
			</tr>
			<tr style="background-color: white;border: 0">
				<td >联系电话</td>		
				<td ><input type="number" class="form-control" id="inputPhone" placeholder="请填写电话"></td>		
			</tr>
			<tr style="background-color: white;border: 0">
				<td >预达日期</td>		
				<td ><input type="date" class="form-control" id="inputFromDate" placeholder="请选择日期"></td>		
			</tr>
			<tr style="background-color: white;border: 0">
				<td >预离日期</td>		
				<td ><input type="date" class="form-control" id="inputTodate" placeholder="请选择日期"></td>		
			</tr>
			<tr style="background-color: white;border: 0">
				<td >入住人数</td>		
				<td ><input type="number" class="form-control" id="inputNumber" placeholder="请填写入住人数"></td>		
			</tr>
			<tr style="background-color: white;border: 0">
				<td >房间类型</td>		
				<td ><input type="text" class="form-control" id="inputType" placeholder="标间、大床房"></td>		
			</tr>
			<tr style="background-color: white;border: 0">
				<td >备注</td>		
				<td ><textarea rows="1" cols="2" class="form-control" id="inputRemark" placeholder="备注信息"></textarea> </td>		
			</tr>
		</table>
		<button type="button" class="btn btn-primary" style="width: 100%">提交</button>
	</div>
	<div class="btn-group" style="width: 100%">
	  <button type="button" class="btn btn-default" style="width: 33%">Left</button>
	  <button type="button" class="btn btn-default" style="width: 33%">Middle</button>
	  <button type="button" class="btn btn-default" style="width: 33%">Right</button>
	</div>
	<div class="bottom" style="background-color: black;">
		<span class="style4" style="color: red；;height: 15px;">
		<button type="button" class="btn btn-default" style="width: 30%">预订酒店</button>
	  	<button type="button" class="btn btn-default" style="width: 30%">预约菜单</button>
	  	<button type="button" class="btn btn-default" style="width: 30%">关于这里</button>
		</span><br />
	</div>
 </div>  
</body>
    
<script src="/bootstrapDemo/js/jquery.js"></script> 
<script src="/bootstrapDemo/bootstrap/js/bootstrap.min.js"></script> 


<script>

</script>
    
    
</html>