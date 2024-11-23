package com.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {

	public static void main(String[] args) {
		System.out.println("main Executed");
		try {
			m1();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void m1() throws FileNotFoundException{
		System.out.println("M1 Executed");
		m2();
		
	}

	private static void m2() throws FileNotFoundException {
		System.out.println("m2 Executed");
		FileReader r = new FileReader("E:\JSPYDER\JAVA\basics\Sum.java");
		
	}

}
