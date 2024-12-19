package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Soumitra\\java.txt");
		if(f.createNewFile())System.out.println(" new File Created at - "+f.getAbsolutePath());
		System.out.println(f.canExecute());
		System.out.println(f.canWrite());
		//f.delete();

		File f2 = new File("E:\\Soumitra\\javadev.txt");
		System.out.println(f.renameTo(f2));
		f2.delete();
		System.out.println(f.canExecute());
		System.out.println(f.canWrite());
		
	}

}

