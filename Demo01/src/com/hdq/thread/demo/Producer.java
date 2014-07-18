package com.hdq.thread.demo;

public class Producer implements Runnable {
	private Info info;
	public Producer(Info info) {
		this.info = info;
	}
	@Override
	public void run() {
		boolean flag =false;
		for(int i =0;i<25;i++){
			if(flag){
				this.info.set("handq", 20);
				flag=false;
			}else{
				this.info.set("licy", 30);
				flag=true;
			}
		}
	}

}
