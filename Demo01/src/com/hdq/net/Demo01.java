package com.hdq.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		/* if(args.length != 1) {
		      System.err.println(
		        "Usage: WhoAmI MachineName");
		      System.exit(1);
		    }
		    InetAddress a;
			try {
				a = InetAddress.getByName(args[0]);
				System.out.println(a);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/
		
//		try {
//			InetAddress addr = InetAddress.getByName("127.0.0.1");
//			System.out.println(addr);
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			ServerSocket socket = new  ServerSocket();
			Socket s = new  Socket();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
