package com.Interface.FunctionalInterface;
@FunctionalInterface
interface i {
	void m1();
	default void m2() {
		System.out.println("i m2");
	}
	static void m3() {
		System.out.println("Static i ");
	}
	private void m4() {
		System.out.println("M4 Nochangeble");
		
	}
}
class A implements i{

	@Override
	public void m1() {
		System.out.println("Inherited Method");
		
	}
	
}
public class main {

	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
		a1.m2();
		i i1 = new A();
		i1.m1();
		i1.m2();
		
		

	}

}
