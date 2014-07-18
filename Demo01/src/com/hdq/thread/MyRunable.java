package com.hdq.thread;

public class MyRunable implements Runnable {
	private int tic = 20;
	private String name;
	
	public MyRunable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0 ; i <5;i++){
			if(tic>0){
				System.out.println( Thread.currentThread().getName()+"正在卖第"+tic+"张票！");
				tic--;
				try {
					Thread.sleep(2000);
					System.out.println("线程休眠完毕！");
				} catch (InterruptedException e) {
					///e.printStackTrace();
					System.out.println("线程中断！");
					return;
				}
			}else{
				System.out.println("票已卖完！");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		MyRunable mr = new MyRunable("第一个");
		Thread thread1 = new Thread(mr,"第一个窗口");
		System.out.println("目前thread1的状态为："+thread1.isAlive());
		thread1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread1.interrupt();
		System.out.println("目前thread1的状态为："+thread1.isAlive());
		/*Thread thread2 = new Thread(mr,"第二个窗口");
		for(int i =0;i<10;i++){
			if(i>5){
				try {
					thread2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("main 线程执行--》" + i);
		}*/
	}

}
