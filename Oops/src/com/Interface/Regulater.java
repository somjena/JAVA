package com.Interface;

public interface Regulater {
	void increaseSpeed();
	void decreaseSpeed();

}
interface Switch{
	void on();
	void off();
}
class Fan implements Regulater,Switch{

	@Override
	public void on() {
		System.out.println("Fan Switch On");
		
	}

	@Override
	public void off() {
		System.out.println("Fan Switch Off");
		
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Fan Speed Increased");
		
	}

	@Override
	public void decreaseSpeed() {
		System.out.println("Fan Speed Decreased");
		
	}
	
}
