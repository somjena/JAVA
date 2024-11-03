package com.typecasting.Non_primitive;
class A{
	void m1() {
		System.out.println("A-M1");
	}
}
class B extends A{
	void m1() {
		System.out.println("B-M1");
	}
}
class C extends B {
	void m1() {
		System.out.println("C-M1");
	}
}

public class Demo {

	public static void main(String[] args) {
		A a1 = new C();
		a1.m1();
		B b1 = new C();
		b1.m1();
		

	}

}
