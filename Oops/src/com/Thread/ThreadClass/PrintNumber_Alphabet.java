package com.Thread.ThreadClass;


	
public class PrintNumber_Alphabet {

	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		Thread t1 = new PrintNum();
		t1.start();
		System.out.println("Main Thread Ends");

	}

}


class PrintNum extends Thread{
	public void run() {
		System.out.println("Created new Thread");
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			try{Thread.sleep(500);} catch(Exception e) {};
		}
		System.out.println("Ended Created Threat");
	}
}


