package com.Interface;

public class FanModule {

	public static void main(String[] args) {
		Switch s = new Fan();
		s.on();
		Regulater r = new Fan();
		r.increaseSpeed();
		r.decreaseSpeed();
		s.off();
		Fan f = new Fan();
		f.on();
		f.increaseSpeed();
		f.decreaseSpeed();
		f.off();

	}

}
