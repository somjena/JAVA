package com.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Soumitra\\java.txt");
		
		try(FileWriter fw = new FileWriter(f,true)){
		if(f.canWrite()) {
			fw.write("Jspiders"+"\n"+"Pyspiders");
		}else {
			System.out.println("Can Write into this file");
		}
		fw.write("hello");
		}
	}

}
