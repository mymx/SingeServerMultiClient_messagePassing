package com.sockets.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.util.CentralData;

// this is  your server 
public class ServerSock {
	//
	private CentralData cd;
	private Socket clientSocket;
	private ServerSocket serverSocket;
	ExecutorService exse;

	public ServerSock() {
		cd = CentralData.getInstance();
		exse =Executors.newFixedThreadPool(5);
	}

	public void startServer() {

		try {
		
			serverSocket = new ServerSocket(Integer.parseInt(cd.serverPort));
	
		} catch (NumberFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (true) {
			// accept a connection;
			try {
				Socket clientSocket = serverSocket.accept();
				exse.execute(new WorkerServ(clientSocket,cd));
				
				
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// create a thread to deal with the client;
		}

	}
	public static void main(String[] args) {
		
	}
	/*
	 * } while ((fromServer = in.readLine()) != null) {
	 * System.out.println("Server: " + fromServer); if
	 * (fromServer.equals("Bye.")) break;
	 * 
	 * fromUser = stdIn.readLine(); if (fromUser != null) {
	 * System.out.println("Client: " + fromUser); out.println(fromUser); } }
	 */
}
