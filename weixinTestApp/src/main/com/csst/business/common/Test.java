package com.csst.business.common;
public class Test {

	public static void main(String[] args) throws Exception {
		MD5Code md5 = new MD5Code();
		System.out.println(md5.getMD5ofStr("admin"));
	}

}
