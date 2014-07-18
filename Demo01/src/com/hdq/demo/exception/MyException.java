package com.hdq.demo.exception;

public class MyException extends Exception {
	private int i ;
	public  MyException(){
		
	};
	public MyException(String msg){
		super(msg);
	};
	public MyException(String msg,int a){
		super(msg);
		this.i = a;
	};
	public 	String getMessage(){
		return "Datil message:"+this.i+"," + super.getMessage();
	}
}
