package com.hdq.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static final int port = 8080;
	public static void main(String[] args) throws IOException  {
		ServerSocket ss = new ServerSocket(port);
		System.out.println("serverSocket:"+ss);
		Socket soc;
		try {
			soc = ss.accept();
			System.out.println("accept serverSocket:"+soc);
			try {
				BufferedReader in =  new BufferedReader(new InputStreamReader(soc.getInputStream()));
				PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())));
				while(true){
					System.out.println("11111111111111111111111");
					System.out.println("in:"+in.readLine());
					String str= in.readLine();
					System.out.println("2222222222222222222222");
					System.out.println("Echoing:"+str);
					if(str.equals("END")){
						System.out.println("33333333");
						break;
					}else{
						System.out.println("Echoing:"+str);
					}
				}
			}finally {
				System.out.println("closing...");
		        soc.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			ss.close();
		}
	}

}
