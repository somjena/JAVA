package com.PolyMorphism;
interface Sim{
	void call();
}
class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("Call Connected Through Airtel");
		
	}
	
}
class JIO implements Sim{

	@Override
	public void call() {
		System.out.println("Call Connected Through JIO");
		
	}
	
}
class Vodafone implements Sim{

	@Override
	public void call() {
		System.out.println("Call Connected Through Vodafone");
		
	}
	
}
class Phone {
	Sim s ;
	public Phone(Sim s) {
		this.s=s;
	}
	void connect() {
		s.call();
	}
}
public class PhoneCreator {
	public static void main(String[] args) {
		Phone p = new Phone(new Vodafone());
		p.connect();
		
	}

}
