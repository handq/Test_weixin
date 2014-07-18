package com.hdq.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class Manager extends Employee implements Serializable {
	  private static final long serialVersionUID = 3487495895819393L;
	private int id;  
	Manager(String name, int id) {
		  super(name);  
	      this.id=id;  
	}
	
	public Manager(String n) {
		super(n); 
	}
	
	public static void main(String[] args) throws Exception {
		try {
			File file=new File("E:/aaa.txt");  
	    	ObjectOutputStream oout;
			oout = new ObjectOutputStream(new FileOutputStream(file));
			oout.writeObject(new Manager("amao",123));  
			oout.close();  
			System.out.println("序列化成功");  
			long serialVersionUID=ObjectStreamClass.lookup(Class.forName("com.hdq.demo.Manager")).getSerialVersionUID();  
			System.out.println(serialVersionUID);  
			//总结一下：如果当前类的所有超类中有一个类即不能序列化，也没有无参构造器。那么当前类将不能反序列化。如果有无参构造器，那么此超类反序列化的数据域将会是null或者0，false等等。 
			ObjectInputStream oin=new ObjectInputStream(new FileInputStream(file));  
			Object o=oin.readObject();  
			oin.close();  
			System.out.println("反序列化成功:"+((Manager) o).getName());  
			System.out.println("反序列化成功:"+((Manager) o).id);  
			long serialVersionUID2=ObjectStreamClass.lookup(Class.forName("com.hdq.demo.Manager")).getSerialVersionUID();  
			System.out.println(serialVersionUID2);  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
