package com.Binding.Early_Binding;
class A{
	void m1() {
		System.out.println("N arg m1");
		
	}
	void m1(int i) {
		System.out.println( i +" 1 arg m1");
		
	}
	void m1(int i,int j) {
		System.out.println(i +"+"+j+" 2 arg m1");
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();//Method With No Arg
		a1.m1(10);// Method With One Argument
		a1.m1(10, 20);// Method With Two arg

	}

}
