package com.InnerClass.NonstaticInnerClass;

public class Car {
	int num;
	private static int x = 1000;
	Car(){
		num=x++;
	}
	
	
	void start() {
		System.out.println(num+" Car Started");
	}
	void acc() {
		System.out.println(num + " Car accelerate");
	}
	void stop() {
		System.out.println(num + " car Stop");
	}
	
		
	

}
