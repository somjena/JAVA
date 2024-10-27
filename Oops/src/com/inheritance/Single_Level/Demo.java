package com.inheritance.Single_Level;
class A{
	int i =20;
	
}
class B extends A{
	int i=30;
	

public void Display() {
	System.out.println("Child Class i = "+i);
	System.out.println("Parent Class i = "+super.i);
	
}
}
public class Demo {

	public static void main(String[] args) {
		B b1= new B();
		b1.Display();

	}

}
