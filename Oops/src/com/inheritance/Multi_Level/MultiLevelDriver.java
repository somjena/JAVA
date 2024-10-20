package com.inheritance.Multi_Level;

public class MultiLevelDriver {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		c.m1();
		c.m2();
		c.m3();
	}

}
