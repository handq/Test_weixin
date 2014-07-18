package com.hdq.demo;

import java.util.Random;

public class Demo02 {
	private static Random rand = new Random();
	private String id;
	public Demo02(String id){
		this.id = id;
	}
	private final int VAL_ONE = 9;
	private static final int VAL_TWO=99;
	public final int VAL_THREE=21;
	public static final int VAL_FORE = 98;
	private final int i4 = rand.nextInt(20);
	static final int i5 = rand.nextInt(20);
	private Demo01 demo00 = new Demo01(22);
	private final Demo01 demo01 = new Demo01(1);
	private static 	final Demo01 demo = new Demo01(12);
	private final int[] a = {1,2,3,4};
	
	public String toString(){
		System.out.println(id + ":" +"i4 = "+i4 + ",i5 = " + i5);
		return id + ":" +"i4 = "+i4 + ",i5 = " + i5;
	}
	
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02("hello");
		demo02.toString();
		System.out.println(demo02.i4);
		System.out.println(Demo02.i5);
		System.out.println("============");
		demo02.demo01.i++;
		System.out.println(demo02.demo01.i);
		demo02.demo.i++;
		System.out.println(demo02.demo.i);
		demo02.demo00 = new Demo01(45);
		
	}

}
