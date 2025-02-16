package com.javaProgram.java8;

public class Operation_Class {

	public static void main(String[] args) {
		Math<Integer> add =(i, j)->{return i+j;};
		Math<Integer> sub =(i, j)->{return i-j;};
		System.out.println(add.calc(10, 20));
		System.out.println(sub.calc(10, 20));

	}

}
