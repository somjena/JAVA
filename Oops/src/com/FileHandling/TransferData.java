package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TransferData {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("E:\\JAVA\\DataStructures\\src\\com\\ArrayList\\Integer\\IntArrayList.java");
		FileWriter fr = new FileWriter("E:\\Soumitra\\java.txt");
		int n = f.read();
		
		while(n!=-1) {
			fr.write((char)n);
			n=f.read();
		}

	}
	

}
