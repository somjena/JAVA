package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
	
		File file = new File("E:\\Soumitra\\java.txt");
		try(FileInputStream f = new FileInputStream(file)){
		
		if(file.canRead()) {
			int n = f.read();
			while(n!=-1) {
				System.out.print((char)n);
				n=f.read();
			}
		}else
			System.out.println("Cant Read The Data");

	
		}
	}
	

}
