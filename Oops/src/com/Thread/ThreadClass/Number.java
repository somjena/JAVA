package com.Thread.ThreadClass;

class Number extends Thread{
	@Override
	public void run() {
		System.out.println("Number Thread initialized");
		for(char i = 'A';i<='Z';i++) {
			System.out.println(i);
			
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		System.out.println("Number thread End");
	}
	
}