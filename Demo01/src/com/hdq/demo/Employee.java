package com.hdq.demo;

import java.io.Serializable;

public class Employee implements Serializable {
		 private String name; 
	    Employee(String n){  
	        this.name=n;  
	    }  
	    public String getName(){  
	        return this.name;  
	    }  
}
