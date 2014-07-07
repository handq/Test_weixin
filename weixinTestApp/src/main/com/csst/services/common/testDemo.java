package com.csst.services.common;

import java.io.UnsupportedEncodingException;

public class testDemo {

	private static String getMsgContent() {  
	    StringBuffer buffer = new StringBuffer();  
	    // 每行70个汉字，共682个汉字加1个英文的感叹号  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵你的手走过风风雨雨有什么困难我都陪你");  
	    buffer.append("不知道什么时候开始喜欢这里每个夜里都会来这里看你你长得多么美丽叫我不能不看你看不到你我就迷失了自己好想牵!");  
	    return buffer.toString();  
	}  
	
	/** 
	 * xiaoqrobot的主菜单 
	 *  换行
	 * @return  
	 */  
	public static String getMainMenu() {  
	    StringBuffer buffer = new StringBuffer();  
	    buffer.append("您好，我是小q，请回复数字选择服务：").append("\n\n");  
	    buffer.append("1  天气预报").append("\n");  
	    buffer.append("2  公交查询").append("\n");  
	    buffer.append("3  周边搜索").append("\n");  
	    buffer.append("4  歌曲点播").append("\n");  
	    buffer.append("5  经典游戏").append("\n");  
	    buffer.append("6  美女电台").append("\n");  
	    buffer.append("7  人脸识别").append("\n");  
	    buffer.append("8  聊天唠嗑").append("\n\n");  
	    buffer.append("回复“?”显示此帮助菜单");  
	    return buffer.toString();  
	} 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // 采用gb2312编码方式时占1365个字节  
	    try {
			System.out.println(getMsgContent().getBytes("gb2312").length);
			System.out.println(getMsgContent().getBytes("utf-8").length);  
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	    // 采用utf-8编码方式时占2047个字节  
	  
	}

}
