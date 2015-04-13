package com.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunProcess implements Runnable {

	private String cmd;

	public RunProcess(String cmd) {
		this.cmd= cmd;
		/*System.out.println(cmd);
		try {
			System.out.println("  you are executing the commad");
			String line;
			Process p = Runtime.getRuntime().exec(cmd);
			// (System.getenv("windir") +"\\system32\\"+"tree.com /A");
			BufferedReader input = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			System.out.println("  you are executing the commad");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception err) {
			err.printStackTrace();
		}*/
	}

	//@Override
	public void run() {
		try {
			System.out.println("  you are executing the commad");
			String line;
			Process p = Runtime.getRuntime().exec(cmd);
			// (System.getenv("windir") +"\\system32\\"+"tree.com /A");
			BufferedReader input = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			//System.out.println("  you are executing the commad");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
	public String singleExec() {
		String line = null;
		
		try {
			Process p = Runtime.getRuntime().exec(cmd);
			// (System.getenv("windir") +"\\system32\\"+"tree.com /A");
			BufferedReader input = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			//System.out.println("  you are executing the commad");
			/*while ((line = input.readLine()) != null) {
				System.out.println(line);
			}*/
			line= input.readLine();
			input.close();
			
		} catch (Exception err) {
			err.printStackTrace();
		}
		return line;
	}
	
	public static void main(String[] args) {
		/*RunProcess rp = new RunProcess("ls -lart");
		rp.run();*/
	}
}
