package com.hdq.demo;

public class Demo14<T> {
	private T name;
	private T pass;
	
	public Demo14() {
	}
	
	public Demo14(T na,T pa){  
        this.name=na;  
        this.pass=pa;  
   }  
	
	public void Str(){
		System.out.println("1111111111111111111111");
	}
	
	public static void main(String[] args) {
		Demo14 d14 = new Demo14();
		d14.Str();
		
		Demo14<String> d = new Demo14<String>("HAN", "dq");
		System.out.println(d.name+"=="+d.pass); 
	}
}
