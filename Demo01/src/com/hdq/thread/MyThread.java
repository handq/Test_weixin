package com.hdq.thread;

public class MyThread extends Thread {
	private int tt = 5;
	private String name;
	public MyThread() {
		System.out.println("执行构造方法！");
	}
	public MyThread(String name) {
		this.name = name;
		System.out.println("执行带参数的构造方法！");
	}
	
	public void run(){
		for(int i = 0;i<20;i++){
			if(tt>0){
				System.out.println(this.name + "  现在执行第"+ tt+"个数据！");
				tt--;
			}else{
				return;
			}
		}
	}
	public static void main(String[] args) {
		MyThread mt = new MyThread("线程一");
		MyThread mt2 = new MyThread("线程二");
		mt.start();
		//mt2.start();
	}
}
