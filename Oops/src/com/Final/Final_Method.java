package com.Final;
class A{
	 final void m1() {
		System.out.println("M1-A");
	}
	
}
class B extends A{
	/*void m1() {
		Error Because We can not Access Final Methods In Sub Class
	}*/
}
class C extends B{
	/* void m1(){
	 Error because parent class m1 is Finalized or Constraint so No Child Class Can override that method
	 }
	 */
}
public class Final_Method {

	public static void main(String[] args) {
		A a1 =new A();
		a1.m1();
		B b1 = new B();
		b1.m1();
		C c1 = new C();
		c1.m1();

	}

}
