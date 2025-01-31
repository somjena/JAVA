package com.Lambda_Expression.Supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class Test {
	public static void main(String[] args) {
	try(Scanner sc= new Scanner(System.in)) {
		System.out.println("Enter the Values");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Supplier<A> s = ()->new A(x,y);
		A a1 = s.get();
		A a2 = s.get();
		System.out.println(a1);
		System.out.println(a2);
	}
	}

}
