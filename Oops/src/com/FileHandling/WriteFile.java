package com.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		File file = new File("E:\\Soumitra\\java.txt");
		try(FileOutputStream f = new FileOutputStream(file)){
		//f.write("hello");--->CTE
		String s = "Hello world";
		byte [] b =s.getBytes();
		if(file.canWrite()) {
			f.write(b);
		}else {
			System.out.println("Cant Write Data into the File");
		}

	}
	}

}
