package com.Thread.ThreadClass;


	
public class PrintNumber {

	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		Thread t1 = new PrintNum();
		t1.start();
		System.out.println("Main Thread Ends");

	}

}




