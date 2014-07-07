package com.csst.services.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONObject;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


public class Bus {
	URLConnection connectionData; 
    StringBuilder sb; 
    BufferedReader br;// 读取data数据流 
    JSONObject jsonData; 
    JSONObject info; 
	@SuppressWarnings("rawtypes")
    public String getAibangBus(String city,String bus){
    	String buffer = "";
		List listname=new ArrayList();  //用来存放name
	    List listinfo =new ArrayList();  //用来存放info
	    List liststats=new ArrayList();  //用来存放stats 
    	//公交线路API接口
    	try { 
    		String apiurl = "http://openapi.aibang.com/bus/lines?app_key=f41c8afccc586de03a99c86097e98ccb&city="+java.net.URLEncoder.encode(city,"UTF-8")+"&q="+java.net.URLEncoder.encode(bus,"UTF-8");
    		URL url = new URL(apiurl); 
            connectionData = url.openConnection(); 
            connectionData.setConnectTimeout(1000); 
            try { 
                br = new BufferedReader(new InputStreamReader( 
                        connectionData.getInputStream(), "UTF-8")); 
                sb = new StringBuilder(); 
                String line = null; 
                while ((line = br.readLine()) != null) 
                    sb.append(line); 
            } catch (SocketTimeoutException e) { 
                System.out.println("连接超时"); 
            } catch (FileNotFoundException e) { 
                System.out.println("加载文件出错"); 
            } 
                String xmldatas = sb.toString();
             Document doc = DocumentHelper.parseText(xmldatas);
             Element rootElt = doc.getRootElement(); // 获取根节点    
             Iterator iter = rootElt.elementIterator("lines");// 获取根节点下的子节点results
             String resultNum=rootElt.elementText("result_num"); //获取结果数量
             if(!resultNum.equalsIgnoreCase("0")){
            	 while (iter.hasNext()) {
            		 Element recordEle = (Element) iter.next();
            		 Iterator iters = recordEle.elementIterator("line");
            		 while(iters.hasNext()){
            			 Element itemEle = (Element) iters.next(); 
            			 //取出时间date
            			 List date = itemEle.elements("name");
            			 Element eledate=(Element)date.get(0);
            			 listname.add(eledate.getText());
            			 //取出白天图片地址dayPictureUrl
            			 List dayUrl = itemEle.elements("info");
            			 Element eledayurl=(Element)dayUrl.get(0);
            			 listinfo.add(eledayurl.getText());
            			 //取出晚上图片地址nightPictureUrl
            			 List nightUrl = itemEle.elements("stats");
            			 Element elenighturl=(Element)nightUrl.get(0);
            			 liststats.add(elenighturl.getText());
            		 }
            	 }
             }
              
             if(listname!=null){
            	 buffer += "/礼物一共有"+resultNum+"条相关线路\n";
            	 for(int i = 0;i<listname.size();i++){
            		 buffer +=i+1+"、 线路"+i+listname.get(i)+"\n"+listinfo.get(i)+"\n \ue159"+liststats.get(i)+"\n\n";
            	 } 
             }
         } catch (Exception e) {
			e.printStackTrace();
		} 
    	buffer = buffer.replace("线路0", "上行");
		 buffer = buffer.replace("线路1", "下行");
    	return buffer;
    }
}
