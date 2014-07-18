package com.hdq.demo;

public class Demo11 {
	static void f(){
		System.out.println("call()  demo11  f(); ");
	};
	
	public static void main(String[] args) {
		/*try {
			throw new TwoDemoE();
		} catch (TwoDemoE e) {
			//System.err.println("this is a TwoDemoE!");
		} catch(OneDemoE e){
			//System.err.println("this is a OneDemoE!");
		}finally{
			System.out.println("111111111111111111111111");
		}*/
		
		System.out.println("44444444444444444");
		
		try {
			Object d3 = Class.forName("com.hdq.demo.Demo03").newInstance();
			if(d3 instanceof Demo03){
				System.out.println("==============");
				((Demo03)d3).toStrg();
			}
			
			System.out.println(Class.forName("com.hdq.demo.Demo03").newInstance());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block 
			System.out.println("111");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("222");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("333");
			e.printStackTrace();
		}
	}
}
