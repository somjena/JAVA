package com.Thread.ThreadClass;


public class PrintAll {

	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		Thread t1 = new Alphabet();
		t1.start();
		Thread t2 = new Number();
		t2.start();
		System.out.println("Main Thread Ends");

	}

}
