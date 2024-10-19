package com.Interface;

public interface Vehicle {
	void Start();
	void Acc();
	void Stop();

}
interface Variant extends Vehicle{
	void Model();
	
}
