package com.hdq.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		try {
			//--------------------------------------------------------------------------------//
			//字节流的操作
			//使用纯粹的输入输出流
			/*FileInputStream input = new FileInputStream(new File("E://a.txt"));
			FileOutputStream output = new FileOutputStream(new File("E://b.txt"));
			byte[] len = new byte[1024];
			int s = -1;
			while((s = input.read(len))!=-1){
				output.write(len);
			}
			input.close();
			output.close();*/
			//使用缓冲区
			/*BufferedInputStream  input =new  BufferedInputStream(new FileInputStream(new File("E://a.txt")));
			BufferedOutputStream output = new  BufferedOutputStream(new FileOutputStream(new File("E://b.txt")));
			byte[] bufer = new byte[1024];
			int len = -1;
			while((len = input.read(bufer))!=-1){
				output.write(bufer,0,len);
				System.out.println(new String(bufer,0,len));
			}
			input.close();
			output.close();*/
			//--------------------------------------------------------------------------------//
			//字符流的操作
			//使用单纯的字符流操作
			/*FileReader reader = new FileReader(new File("E://aa.txt"));
			FileWriter writer = new FileWriter(new File("E://bb.txt"));
			char[] c = new char[1024];
			int len = -1 ;
			while((len = reader.read(c))!=-1){
				writer.write(c,0,len);
				System.out.println(new String(c,0,len));
			}
			reader.close();
			writer.close();*/
			//使用缓冲区读取字符流操作
			/*BufferedReader bread = new BufferedReader(new FileReader(new File("E://aaa.txt")));
			BufferedWriter bwriter = new BufferedWriter(new FileWriter(new File("E://bbb.txt")));
			char[] c = new char[1024];
			int len = -1 ;
			while((len = bread.read(c))!=-1){
				bwriter.write(c,0,len);
				System.out.println(new String(c,0,len));
			}
			bread.close();
			bwriter.close();*/
			//使用缓冲区读取字符  一行
			BufferedReader bread = new BufferedReader(new FileReader(new File("E://aaa.txt")));
			BufferedWriter bwriter = new BufferedWriter(new FileWriter(new File("E://bbb.txt")));
			String bu;
			while((bu = bread.readLine())!=null){
				bwriter.write(bu);
				bwriter.newLine();
			}
			bread.close();
			bwriter.close();
			
			//-------------------------------------------------------------------------------//
			//最后解决的一个问题是字节流和字符流的转化，使用的是InputStreamReader和OutputStreamWriter
			FileInputStream fileInputStream  = new FileInputStream("e://input.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
			FileOutputStream fileOutputStream = new FileOutputStream("e://output.txt");
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
			String buftoByte;
			while((buftoByte =reader.readLine())!=null){
				writer.write(buftoByte);
				writer.newLine();
				System.out.println(buftoByte);
			}
			reader.close();
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			System.out.println("读取完毕！");
		}
	}

}
