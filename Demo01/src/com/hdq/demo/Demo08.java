package com.hdq.demo;

public class Demo08 {
	private class InnerDemo01 implements Contants{
		private String i="aa";
		public String readLine() {
			System.out.println(i);
			return i ;
		}
	}
	
	public InnerDemo01 desc(String s){
		return new InnerDemo01();
	}
}
