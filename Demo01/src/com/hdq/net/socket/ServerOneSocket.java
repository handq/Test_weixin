package com.hdq.net.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class ServerOneSocket extends Thread {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public ServerOneSocket(Socket socket) throws IOException {
		this.socket = socket;
		in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new  PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
		start();										
	}		
	
	public void run(){
		try {
			while(true){
				String str = in.readLine();
				System.out.println("client-request-echoing:"+str);
				if(str.equalsIgnoreCase("end")) break;
				out.println(str+"/handq/");
			}
			System.out.println("socket is closing...");
		} catch (Exception e) {
			
		}finally{
			try {
				System.out.println("======server===============socket.close()================");
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
