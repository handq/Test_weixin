package com.hdq.thread.demo;

public class Info {
	private String name="handq";
	private int age=20;
	private boolean flag = false;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public synchronized void set(String name,int age){
		if(!flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name= name;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.age = age;
		flag = false;
		super.notify();
	}
	
	public synchronized void get(){
		if(flag){
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name+ "<==>" + this.age);
		flag=true;
		super.notify();
	}
	
}
