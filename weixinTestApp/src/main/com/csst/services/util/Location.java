package com.csst.services.util;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.csst.popular.bean.xmlmessage.XMLNewsMessage.Article;


public class Location {
	public List<Article> getLocation(String x,String y,String scale,String label) throws Exception{
		List<Article>  locations = new ArrayList<Article>();
		 Article article1 = new Article();  
         article1.setTitle("欢迎使用小H位置服务\n点击地图进入");  
         article1.setDescription("小H位置提供了地图展示、周边搜索、线路查询，为您的出行带来了很大便利。");  
         article1.setPicurl("http://api.map.baidu.com/staticimage?width=400&height=300");  
         article1.setUrl("http://api.map.baidu.com/marker?location="+x+","+y+"="+java.net.URLEncoder.encode("我的位置","UTF-8")+"&content="+java.net.URLEncoder.encode("百度大厦","UTF-8")+"&output=html"); 
         locations.add(article1);
		return locations;
	}
}
