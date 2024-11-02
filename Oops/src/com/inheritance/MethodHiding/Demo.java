package com.inheritance.MethodHiding;

class Bank{
	public static void CC() {
		System.out.println("Bank Provided The Feature");
	}
}
class HDFC extends Bank{
	 public static void CC() {
		 System.out.println("Used By HDFC BANK");
		
	}
}
public class Demo {

	public static void main(String[] args) {
          
		Bank b1 = new Bank();
		b1.CC();
		HDFC hc = new HDFC();
		hc.CC();
		
		
		/*Bank b2 = new HDFC();
		b2.CC();   -------> Based on the Creation of the Reference
		*/  


	}

}
