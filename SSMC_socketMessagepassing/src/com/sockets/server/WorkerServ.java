package com.sockets.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import com.util.CentralData;

public class WorkerServ implements Runnable {

	Socket sock;
	CentralData cd;

	public WorkerServ(Socket sock, CentralData cd) {
		this.sock = sock;
		this.cd = cd;
	}

	public void run() {
		try {
			PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			ObjectOutputStream outToServer = new ObjectOutputStream(sock.getOutputStream());
			ObjectInputStream inFromServer = new ObjectInputStream(sock.getInputStream());
			
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
