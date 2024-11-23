package com.Exception;

public class AccountDriver {

	public static void main(String[] args) {
		Account a = new Account(1000);
		try {
			a.withdraw(1000);
		} catch (InsufficientBalException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
