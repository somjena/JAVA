package com.Exception;

public class Account {
	int bal;

	public Account(int bal) {
		this.bal = bal;
	}
	public void withdraw(int amount) throws InsufficientBalException{
		if(amount>bal) {
			throw new InsufficientBalException();
			
		}
		bal-=amount;
		System.out.println("Withdraw Done : "+amount);
		System.out.println("Available bal : "+bal);
	}
	
	

}
