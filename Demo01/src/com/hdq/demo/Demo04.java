package com.hdq.demo;

public class Demo04 extends Demo03 implements Demo05,Demo06{

	/*public void toSay(){
		父类方式是final
	}*/
	
	public void toStrg(){
		System.out.println("=====================2222===");
	}
	
	
	public static void main(String[] args) {
		Demo04 d = new Demo04();
		Demo03 d1 = new Demo04();//多态中的后期绑定机制。所以会被正确的调用demo04的方法。
		d1.toStrg();
	}


	@Override
	public void toA01() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void toB01() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void to01() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void to02() {
		// TODO Auto-generated method stub
		
	}
}
