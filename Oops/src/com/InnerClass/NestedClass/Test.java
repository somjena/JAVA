package com.InnerClass.NestedClass;

class A{
	class B{
		void m1() {
			System.out.println("Nonstatic A.B M1()");
		}
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		A.B  a1= a.new B();
		a1.m1();
		
	}

}
