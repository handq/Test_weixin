package com.hdq.thread;
/**
 * 同步代码块
 * @author handaquan
 *
 */
public class TicketRunn implements Runnable {
	private   int tickets = 20;
	public void run() {
		for(int i = 0 ; i <10 ;i++){
			synchronized (this) {
				System.out.println("当前剩余票数为：" + tickets);
				if(tickets>0){
					try {
						System.out.println(Thread.currentThread().getName() + "正在卖第"+tickets + "张票！");
						Thread.sleep(2000);
						tickets--;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					
					System.out.println("车票已经全部卖完！");
					return;
				}
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		TicketRunn tr = new TicketRunn();
		Thread t1  = new Thread(tr,"窗口1"); 
		Thread t2  = new Thread(tr,"窗口2"); 
		Thread t3  = new Thread(tr,"窗口3"); 
		t1.start();
		t2.start();
		t3.start();
    }

}
