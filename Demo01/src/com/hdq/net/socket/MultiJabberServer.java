package com.hdq.net.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class MultiJabberServer {
	static final int port = 8080;
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(port);
		System.out.println("server start,"+ss);
		try {
			while(true){
				Socket sc = ss.accept();
				System.out.println("监听到请求："+sc);
				try {
					new ServerOneSocket(sc);
				} catch (Exception e) {
					System.out.println("MultiJabberServer：sc.close();");
					sc.close();
				}
			}
		} finally{
			System.out.println("MultiJabberServer：ss.close();");
			ss.close();
		}
	}
}
