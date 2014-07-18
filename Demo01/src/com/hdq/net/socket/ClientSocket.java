package com.hdq.net.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSocket extends Thread {
	private Socket socket; 
	private BufferedReader in;
	private PrintWriter  out;
	private static int count=0;
	private int id = count++;
	private static int threadcount=0;
	public static int threadcount(){
		return threadcount;
	}
	
	public ClientSocket(InetAddress addr) {
		System.out.println("making client:" + id);
		threadcount++;
		try {
			this.socket = new Socket(addr,MultiJabberServer.port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			start();
		} catch (IOException e) {
			try {
				socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void run(){
		try {
			for(int i = 0; i <5;i++){
				System.out.println("进入client循环" + i);
				out.println("client " + id + ":" + id);
				String str = in.readLine();
				System.out.println("server-reqonse-echo:"+str);
			}
			
			//out.println("END");
			out.println("END ......");
			System.out.println("========client============");
		} catch (Exception e) {
		} finally{
			try {
				System.out.println("=====client===socket.close();============");
				socket.close();
			} catch (IOException e) {
				System.out.println("=====client===threadcount--;============");
				threadcount--;
			}
		}
		
	}
	
	
}
