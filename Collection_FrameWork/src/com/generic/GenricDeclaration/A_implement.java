package com.generic.GenricDeclaration;

public class A_implement {

	public static void main(String[] args) {
		A <Integer>a = new A<Integer>();
		a.add(2);
		int e=a.get();
		System.out.println(e);

	}

}
