package com.hdq.thread.demo;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}

}
