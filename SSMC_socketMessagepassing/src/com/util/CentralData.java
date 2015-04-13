package com.util;

import java.util.ArrayList;


/// created a singleton to manage all the data from the input
public class CentralData {

	public ArrayList<String> inputIP = null;	// maintain a list of IP from the server side

	public ArrayList<String> outputIP = null;	// maintain a list of IP from the client
	
	public String serverName = null;
	public String serverPort = null;
	
	public String OuputFilepath= null;
	public String InputFilepath= null;
	private static CentralData cd = null;
	
	public final String getIPcmd= "ifconfig wlan0 | grep inet| grep  inet6";
	

	private CentralData() {
	}

	public static final CentralData getInstance() {
		if (cd == null) {
			cd = new CentralData();
			return cd ;

		} else {
			return cd;
		}
	}

	

}
