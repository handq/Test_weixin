package com.hdq.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			InetAddress iad = InetAddress.getByName(null);
			System.out.println("inetaddr:"+iad);
			socket = new Socket(iad,SocketServer.port);
			System.out.println("socket:"+socket);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out =new PrintWriter(socket.getOutputStream());
			for(int i = 0 ; i <10;i++){
				out.println("END");
				String str = in.readLine();
				System.out.println("str:"+str);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
