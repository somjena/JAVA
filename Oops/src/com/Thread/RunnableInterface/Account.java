package com.Thread.RunnableInterface;

public class Account {
	private int balance=1000;
	
	
	
	synchronized void deposit(int amt) {
		balance+=amt;
		System.out.println("SuccessFully Deposited "+amt);
		
	}
	
	
   synchronized void display() {
    	System.out.println("balance -"+balance);
    }
}
