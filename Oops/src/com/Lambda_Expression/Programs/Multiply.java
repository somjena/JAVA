package com.Lambda_Expression.Programs;
@FunctionalInterface
interface I1 {
	void m1(int a);
}

public class Multiply {

	public static void main(String[] args) {
		
		
		I1 i1 = i -> System.out.println(i*i);
		i1.m1(10);
		

	}

}
