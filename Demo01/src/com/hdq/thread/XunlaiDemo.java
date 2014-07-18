package com.hdq.thread;

/**
 * 这是迅雷的一道面试题，顺序打印ABC十次。
 * @author handaquan
 *
 */
public class XunlaiDemo {
	public static Boolean isThreadA = true;
	public static Boolean isThreadB = false;
	public static Boolean isThreadC = false;
	public static void main(String[] args) {
		final XunlaiDemo abc = new XunlaiDemo();
		new Thread(new Runnable(){
			public void run() {
				for(int i = 0 ; i <10;i++){
					synchronized (abc) {
						while(!isThreadA){
							try {
								abc.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println("A");
						isThreadA = false;
						isThreadB = true;
						isThreadC = false;
						abc.notifyAll();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable(){
			public void run() {
				for(int j = 0 ; j <10;j++){
					synchronized (abc) {
						while(!isThreadB){
							try {
								abc.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println("B");
						isThreadA = false;
						isThreadB = false;
						isThreadC = true;
						abc.notifyAll();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable(){
			public void run() {
				for(int a =0 ; a<10;a++){
					synchronized (abc) {
						while(!isThreadC){
							try {
								abc.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						System.out.println("C");
						isThreadA = true;
						isThreadB = false;
						isThreadC = false;
						abc.notifyAll();
					}
				}
			}
			
		}).start();
	}
}
