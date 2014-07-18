package com.hdq.demo;

import com.hdq.demo.exception.MyException;

public class Demo10 {
	public static void f() throws MyException{
		System.out.println("throws myException from f();");
		throw new MyException();
	};
	
	public static void m()throws Throwable{
		System.err.println("throws myException from m();");
		///throw new MyException("这是个异常啊~",8232);
		try{
			f();
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
	};
	
	public static void main(String[] args) throws Throwable {
		try {
			//f();
			m();
			
		} catch (MyException e) {
			// TODO Auto-generated catch block
			///new MyException("这是个异常啊~",8232).getMessage();
			System.err.println("getmessage():"+e.getMessage());
			System.err.println("getloallizedMessaege():"+e.getLocalizedMessage());
			System.err.println("tostring():"+e.toString());
			//System.err.println("printStackTrace():"+ e.printStackTrace());
			e.printStackTrace(); 
			
		}
	}
}
