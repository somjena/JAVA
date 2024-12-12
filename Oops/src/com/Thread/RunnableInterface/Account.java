package com.Thread.RunnableInterface;

public class Account {
	private int balance=1000;
	
	
	
	void deposit(int amt) {
		balance+=amt;
	}
	
	
    void display() {
    	System.out.println(balance);
    }
}
