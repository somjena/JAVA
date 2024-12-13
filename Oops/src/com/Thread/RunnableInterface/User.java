package com.Thread.RunnableInterface;

public class User {

	public static void main(String[] args) {
		Account a1 = new Account();
		new DepositThread(a1,1000);
		new DepositThread(a1,1000);
		
		
		try {Thread.sleep(2000);}catch(Exception e) {}
		a1.display();

	}

}




class DepositThread implements Runnable{

	Account acc;
	int amt;
	DepositThread(Account acc,int amt){
		this.acc=acc;
		this.amt=amt;
		new Thread(this).start();
	}
	
	
	
	@Override
	public void run() {
		acc.deposit(amt);
	}
	
}