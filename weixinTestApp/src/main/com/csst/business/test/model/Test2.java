package com.csst.business.test.model;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(checkIn());
	}
	
	public static boolean checkIn(){
		int i=0;
		int j=8;
		while(i<10){
			if(i==j){
				return true;
			}
			i++;
		}
		return false;
	}
}
