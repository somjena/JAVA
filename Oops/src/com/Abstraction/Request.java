package com.Abstraction;
interface Payable{
	void pay();
}
class SBI implements Payable{

	@Override
	public void pay() {
		System.out.println("Paid By SBI");
		
	}
	
}
class HDFC implements Payable{

	@Override
	public void pay() {
		System.out.println("Pay By HDFC");
		
	}
	
}
class ICIC implements Payable{

	@Override
	public void pay() {
		System.out.println("Pay By ICIC");
	}
	
}
class BandhanBank implements Payable{

	@Override
	public void pay() {
		System.out.println("Paid By Bandhan Bank");
		
	}
	
}
class User {
	static void Payment(Payable p) {
		p.pay();
	}
}

public class Request {

	public static void main(String[] args) {
		User.Payment(new SBI());
		User.Payment(new ICIC());
		User.Payment(new BandhanBank());

	}

}
