package com.hdq.demo;

import java.util.List;

public class Demo07 {
	private String name;
	private Demo07(String name){
		System.out.println(name);
	}
	public static final Demo07 
		JAN = new Demo07("january"),
		FBY = new Demo07("fabrary");
	
	public 	static final Demo07[] month = {
		JAN,FBY
	};
	
	public static void main(String[] args) {
		Demo07 d7 = Demo07.JAN;
		//System.out.println(d7);
		Demo07[] list = Demo07.month;
		for(Demo07 d :list){
			System.out.println(d);
		}
	}
}
