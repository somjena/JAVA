package com.InnerClass.StaticInnerClass;

class A{
	
	static int i =10;
	static class B{
		void m1() {
			System.out.println("M1 in Inner B");
			System.out.println(i);
		}
	}
	
}

public class Test {

	public static void main(String[] args) {
		A.B b1 = new A.B() ;
		b1.m1();
		
		

	}

}
