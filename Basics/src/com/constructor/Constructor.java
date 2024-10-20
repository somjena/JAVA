package com.constructor;
class A{
	int a;
	int b;
	A(int a,int b){
		this.a =a;
		this.b = b;
	}
}
public class Constructor {
	public static void main(String[] args) {
		A a1 = new A(10,20);
		System.out.println(a1.a);
		System.out.println(a1.b);
	}
	

}
