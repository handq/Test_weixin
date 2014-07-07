package com.csst.services.util;

import java.io.BufferedReader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;




import com.csst.popular.bean.xmlmessage.XMLNewsMessage.Article;

import net.sf.json.JSONObject;

/**
 * 得到未来6天的天气(含今天)
 * @author Chewl
 *
 */
public class Common { 
    String Ctiyid; 
    URLConnection connectionData; 
    StringBuilder sb; 
    BufferedReader br;// 读取data数据流 
    JSONObject jsonData; 
    JSONObject info; 
     

    
    @SuppressWarnings("rawtypes")
    public List<Article> getWelcomPage(){
    	List<Article> articls = new ArrayList<Article>();
    	 Article article = new Article();
    	 article.setTitle("我是哆啦A梦");
    	 article.setDescription("");
    	 article.setPicurl("http://pic.159.com/desk/user/2012/5/2/Jiker20124321421915.jpg");
    	 article.setUrl("http://hdq.nat123.net/bootstrapDemo/index.html");
    	 articls.add(article);
    	 Article article2 = new Article();
    	 article2.setTitle("我会提供很多便利的服务哦~\n您可以回复?查看服务清单.");
    	 article2.setDescription("欢迎给我们留言~");
    	 article2.setPicurl("http://img.159.com/desk/user/2012/5/2/Jiker201243214236390.jpg");
    	 article2.setUrl("http://hdq.nat123.net/bootstrapDemo/index.html");
    	 articls.add(article2);
               
    	return articls;
    }
    
    
    
    public static void main(String[] args) {
    	Common w = new Common();
    	//article.setUrl("http://api.map.baidu.com/marker?location=39.916979519873,116.41004950566&title="+java.net.URLEncoder.encode("我的位置","UTF-8")+"&content="+java.net.URLEncoder.encode("百度大厦","UTF-8")+"&output=html");
	}
} 
