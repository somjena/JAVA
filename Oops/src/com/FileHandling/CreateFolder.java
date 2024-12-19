package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFolder {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Soumitra");
		if(f.mkdir()) System.out.println(f.getClass().getSimpleName() +" Created a File");
		
		

	}

}
