package com.sockets.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import com.util.CentralData;

public class ClientSock {
	
	private CentralData cd ;
	private Socket sock;
	public ClientSock() {
		cd = CentralData.getInstance();
		
	}
	public void startCleint(){
	
		
		try {
			
			sock = new Socket(cd.serverName, Integer.parseInt(cd.serverPort));
			// this is for messaage
			PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			// this is for objects
			ObjectOutputStream outToServer = new ObjectOutputStream(sock.getOutputStream());
			ObjectInputStream inFromServer = new ObjectInputStream(sock.getInputStream());

			//send the ip of the machine
			
			//get array list object and remove the local ip 
			
			// copy to the central data
			
		
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public static void main(String[] args) {
		
	}

}
