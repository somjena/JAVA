package com.Interface;
interface U1{
	void m1();
	}
interface U2{
	void m2();
}
class impl implements U1,U2{

	@Override
	public void m2() {
		System.out.println("M2 of U2");
		
	}

	@Override
	public void m1() {
		System.out.println("M1 of U1");
		
	}
	
}
public interface MultipleInheritance {
	public static void main(String[] args) {
		impl i1 = new impl();
		i1.m1();
		i1.m2();
		U1 u1 = new impl();
		u1.m1();
		// u1.m2(); CTE Because Through The Upcasted reference only Own Properties Can Be Accessible
		
	}

}
