package com.inheritance.Hierarchical;

public class HierarchicalDriver {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.m1();
		c1.m2();
		Child2 c2 = new Child2();
		System.out.println(c2.a);
		System.out.println(c2.C);
		c2.m1();
		c2.m3();

	}

}
