package com.Binding.LateBinding;
class A{
	void m1() {
		System.out.println("M1-A");
		
	}
}
class B extends A{
	@Override
	void m1() {
		System.out.println("M1-B");
		
	}
}
class C extends B{
	@Override
	void m1() {
		System.out.println("M1-C");
		
	}
}
public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a= new B();
		a.m1();
		a= new C();
		a.m1();
		
		/*it connecting to its method implementation to its method call Based on the instance creation
		 * We Achieve runtime-polymorphism through override method
		 * */
		

	}

}
