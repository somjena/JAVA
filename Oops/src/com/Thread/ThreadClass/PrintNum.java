package com.Thread.ThreadClass;

class PrintNum extends Thread{
	public void run() {
		System.out.println("Created new Thread");
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			try{Thread.sleep(500);} catch(Exception e) {};//Thread Class Sleep Method
		}
		System.out.println();
	}
}
