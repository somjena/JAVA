package com.inheritance.Overriding;
class A{
	
	void m1() {
		System.out.println("M1-A");
	}
}
class B extends A{
	void m1() {
		System.out.println("M1-B");
	}
	
}
public class Demo {
	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		
	
		
	}

}
