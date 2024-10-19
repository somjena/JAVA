package com.Interface;

public class DemoInterface implements I1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(I1.i);
		DemoInterface d1 = new DemoInterface();
		d1.m1();
	}

	@Override
	public void m1() {
		System.out.println("Implementing The Interface Method");
		
	}

}
