package com.util;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesRW {

	private String pathProperties = "client.properties";
	private InputStream is;

	private Properties prop;
	private String serverAddr;
	private String serverPort;

	// setting up the properties connection
	public PropertiesRW() {
		prop = new Properties();
		// First try loading from the current directory

		try {
			if (is == null) {
				// Try loading from classpath
				is = getClass().getResourceAsStream(pathProperties);
			}

			// Try loading properties from the file (if found)
			prop.load(is);
		} catch (Exception e) {
		}

		read();
	}

	private void read() {
		
		// setting into the central data
		CentralData cd = CentralData.getInstance();
		cd.serverName = prop.getProperty("ServerAddress", "192.168.0.1");
		cd.serverPort = prop.getProperty("ServerPort", "8080");
		cd.OuputFilepath = prop.getProperty("OuputFilepath");
		cd.InputFilepath = prop.getProperty("OuputFilepath");
	
		System.out.println("server address is\t:" + serverAddr
				+ "\tserverport:" + serverPort);

	}

	public static void main(String[] args) {
	//	PropertiesRW prw = new PropertiesRW();
	}

}
