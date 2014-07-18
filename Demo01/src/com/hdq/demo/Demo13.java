package com.hdq.demo;

public class Demo13 {
	public static void main(String[] args) throws Exception {
		try {
			int s= 0;
			System.out.println(100/s);
		} catch (Exception e) {
			e.printStackTrace();
			//throw new Exception("这里发生了异常！");
		}finally{
			System.out.println("异常finally也执行了！");
		}
		
		System.out.println("异常之后也执行了！");
	}
}
