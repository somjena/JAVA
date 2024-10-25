package com.Wrapperclass.AutoBoxing;

public class A {

	public static void main(String[] args) {
		//Before 1.5 AutoBoxing
		int i =10;
		System.out.println("primitive :-"+i);
		Integer n=Integer.valueOf(i);
		System.out.println("AutoBoxing :-"+n);
		
		//After 1.5 
		int a = 10;
		Integer b = a;
		System.out.println("Primitive "+a);
		System.out.println("Non-Primitive "+b);

	}

}
