package com.initializer.SingleLine;

public class Test {
	static int i = 10;   // Single Line Static Variable initializing  
	int j =20;           // Single Line NonStatic Variable Initializing
	public static void main(String[] args) {
		int i =20;
		System.out.println("Single Line InitiaLizer Static"+i);
		System.out.println("Local Variable Local "+ Test.i);
		Test t1 = new Test();
		System.out.println("Non Static Single Line Initializing "+t1.j);
		
	}

}
