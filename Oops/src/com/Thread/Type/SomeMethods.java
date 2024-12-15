package com.Thread.Type;

public class SomeMethods {

	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());

	}

}
