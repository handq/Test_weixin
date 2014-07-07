package com.csst.business.util;

import java.io.UnsupportedEncodingException;

public class EncodingUtil {
	public static String exchangeStringVar(String temp) throws UnsupportedEncodingException{
		if(null==temp){
			return null;
		}else{
			return new String(temp.getBytes("iso-8859-1"),"utf-8");
		}
	}
	public static String exchangeStringVar(String[] temp) throws UnsupportedEncodingException{
		if(null==temp){
			return null;
		}else{
			return new String(temp[0].getBytes("iso-8859-1"),"utf-8");
		}
	}
	
}
