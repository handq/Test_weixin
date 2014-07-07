package com.csst.business.test.model;

public class Test5 {
	public static void main(String[] args) throws Exception {
		String str="[ÊÐÖÐÇø]";
		System.out.println(new String(str.getBytes("utf-8"),"iso-8859-1"));
	}
}
