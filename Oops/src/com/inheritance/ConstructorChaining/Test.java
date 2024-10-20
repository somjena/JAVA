package com.inheritance.ConstructorChaining;

class A{
	A(int i){
		System.out.println("A class Int_Arg Constructor");
	}
}
class B extends A{
	B(){
		super(10);
		System.out.println("B class Constructor");
	}
}
public class Test {
	public static void main(String[] args) {
		new B();
	}

}
