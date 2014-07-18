package com.hdq.thread;

public class Demo01  extends Thread{
	private static int a=1;
	private String bb;
	
	public Demo01() {
	}
	
	public void run(){
		System.out.println("进入run(),当前a="+a);
		while(true){
			a++;
			if(a % 2==0){
				System.out.println("执行了第" + a + "次");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}else{
				System.out.println("这个是奇数！" + a);
				this.stop();
			}
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		Demo01 d1 =new Demo01();
		for(int a = 0; a<10;a++){
				d1.start();
		}
		
	}
	
}
