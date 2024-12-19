package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Soumitra\\java.txt");
		if(f.createNewFile())System.out.println(" new File Created at - "+f.getAbsolutePath());

	}

}
