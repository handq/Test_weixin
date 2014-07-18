package com.hdq.thread;

public class MyRunnable2 implements Runnable {
	private int a = 0 ;
	public void run() {
		for(int i = 0 ; i <10;i++){
			synchronized (this) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在执行第"+a+"个任务！");
				a++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		MyRunnable2 m2 = new MyRunnable2();
		Thread t1 = new Thread(m2,"线程A");
		Thread t2 = new Thread(m2,"线程B");
		Thread t3 = new Thread(m2,"线程C");
		t1.setPriority(2);
		t2.setPriority(6);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}

}
