package com.csst.business.test.model;

import java.io.UnsupportedEncodingException;

import org.loon.test.encoding.ParseEncoding;


public class Test1 {
	public static void main(String[] args) throws Exception {
		ParseEncoding parse;
        parse = new ParseEncoding();
        
		String str="asdç±ç±åé¿æ¯è¾¾";
		System.out.println(parse.getEncoding(str));
		String str1="Ó¢Óï";
		System.out.println(parse.getEncoding(str1));
	    
	}
}
