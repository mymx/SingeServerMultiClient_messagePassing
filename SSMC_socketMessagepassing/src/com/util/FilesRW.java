package com.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesRW {

	CentralData cd;

	public FilesRW(String path) {
		cd = CentralData.getInstance();
	}

	// you are reading the file and taking the input and putting that into an
	// array list
	public void Reading() {
		File ipFile = new File(cd.InputFilepath);

		try {
			ArrayList<String> al = new ArrayList<String>();
			Scanner scan = new Scanner(ipFile);
			while (scan.hasNext()) {
				al.add(scan.nextLine() + " 5000");
			}
			cd.inputIP = al;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void Writing() {
		File op = new File(cd.OuputFilepath);

		FileWriter fw;
		try {
			fw = new FileWriter(op.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for (String string : cd.outputIP) {
				bw.write(string);
				bw.newLine();
			}
			bw.close();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

	}

}
