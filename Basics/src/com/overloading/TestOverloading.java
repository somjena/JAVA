package com.overloading;

public class TestOverloading {
	static int add(int i , int j) {//With 2 argument
		return i+j;
	}
	static int add(int j,int k,int l) {//With 3 Arg
		return j+k+l;
	}

	public static void main(String[] args) {
		System.out.println(TestOverloading.add(10, 20));
		System.out.println(TestOverloading.add(10, 20, 30));

	}

}
