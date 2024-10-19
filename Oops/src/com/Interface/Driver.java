package com.Interface;

class Drive{
	public static void ride(Vehicle v) {
		v.Start();
		v.Acc();
		v.Stop();
	}
}
public class Driver {
	public static void main(String[] args) {
		Drive.ride(new BMW());
	}

}
