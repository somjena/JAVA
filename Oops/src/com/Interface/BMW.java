package com.Interface;

public class BMW implements Variant{

	@Override
	public void Start() {
		System.out.println("BMW Started.......");
		
	}

	@Override
	public void Acc() {
		System.out.println("BMW Running........");
		
	}

	@Override
	public void Stop() {
		System.out.println("BMW Stop.........");
		
	}

	@Override
	public void Model() {
		System.out.println("BMW 202D");
		
	}

}
