package com.hdq.thread;

import java.io.IOException;

public class MyRunnable1 implements Runnable {
	private int i = 0 ;
	@Override
	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName() + "正在运行" + i);
			i++;
		}
	}

	
	public static void main(String[] args) {
		MyRunnable1 mr1 = new MyRunnable1();
		Thread threadDemo = new Thread(mr1,"线程1");
		threadDemo.setDaemon(true);//设置线程为守护线程
		threadDemo.start();
		System.out.println("daemon:" + threadDemo.isDaemon());
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
