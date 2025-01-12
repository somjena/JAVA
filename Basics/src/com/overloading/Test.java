package com.overloading;
class A{
	
	void m1(int i) { // With One Arg
			System.out.println("Int Arg Method");
		
	}
	void m1() {
		System.out.println("No Arg Method");
		
	}
	void m1(String name){
		System.out.println("String Arg Methods");
		
	}
}
public class Test {
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1("Soumitra");
		a1.m1(10);
		a1.m1();
	}

}
