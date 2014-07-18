package com.hdq.demo;

public class Demo03 {
   private final String a ;
   private final Demo01 demo;
   public Demo03() {
	   this.a = "1111";
	   demo = new Demo01(333);
   }
   
   public Demo03(String ss){
	   this.a = ss;
	   this.demo = new Demo01(555);
   }
   
   public final void toSay(){
	   //this.a = "sdfssijfois";//final 在方法中不能再定义
	   System.out.println("1212");
   }
   private void toAsk(){
	   System.out.println("ASK 09000");
   }
	public void toStrg(){
		System.out.println("========1111=========");
	}
	public static void main(String[] args) {
		Demo03 d3 = new Demo03();
		System.out.println(d3.a);
		System.out.println(d3.demo.i);
		Demo03 d33 = new Demo03("hello");
		System.out.println(d33.a);
		System.out.println(d33.demo.i);
	}

}
