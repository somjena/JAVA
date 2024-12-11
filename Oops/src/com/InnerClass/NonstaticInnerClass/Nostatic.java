package com.InnerClass.NonstaticInnerClass;


class A{
	class B{
		void m1() {
			System.out.println("Nonstatic A.B M1()");
		}
	}
}
public class Nostatic {
	public static void main(String[] args) {
		A a = new A();
		A.B  a1= a.new B();
		a1.m1();
		
	}

}
