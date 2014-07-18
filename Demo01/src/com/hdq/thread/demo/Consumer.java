package com.hdq.thread.demo;

public class Consumer implements Runnable {
	private Info info;
	
	public Consumer(Info info) {
		this.info = info;
	}
	public void run() {
		for(int i = 0 ;i <25;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.info.get();
		}
	}

}
