package com.hdq.net.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MultiJabberClient {
	static final int MAX_THREADS = 40;
	public static void main(String[] args) throws IOException, InterruptedException {
		InetAddress address = InetAddress.getByName("localhost");
		while(true){
			if(ClientSocket.threadcount()<MAX_THREADS){
				System.out.println("MultiJabberClient:请求");
				new ClientSocket(address);
				Thread.sleep(2000);
			}
		}
		
	}

}
