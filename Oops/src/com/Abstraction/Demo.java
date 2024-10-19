package com.Abstraction;

abstract class A{
	abstract void m1();
	abstract void m2();
	
}
abstract class B extends A{
	abstract void m3();
	@Override
	void m1(){
		System.out.println("B Class M1");
		
	}
}
class C extends B{
	@Override
	void m2() {
		System.out.println("C Class M2");
	}
	void m3() {
		System.out.println("C class M3");
	}
}
public class Demo {

	public static void main(String[] args) {
		A a = new C();
		a.m1();
		a.m2();
		//a.m3(); can't access Because it is a Child Class Property
        B b = new C();
        b.m1();
        b.m2();
        b.m3();
	}

}
