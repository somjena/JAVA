package com.Wrapperclass.AutoUnBoxing;

public class B {

	public static void main(String[] args) {
		Integer a = 10;
		int b = a.intValue();
		//before 1.5(AutoUnBoxing)
		System.out.println("Non-Primitive :"+a);
		System.out.println("Primitive :"+b);

	}

}
