package com.Thread.Type;

public class Test {

	public static void main(String[] args) {
		Thread t1 = new TestProgram();
		t1.start();
		System.out.println(t1.getName());
		t1.setName("NumberThread");
		System.out.println(t1.getName());
		

	}

}
