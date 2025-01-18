package com.Thread.ThreadClass;

class Alphabet extends Thread{
	@Override
	public void run() {
		System.out.println("Alphabet Thread initialized");
		for(int i = 1;i<=26;i++) {
			System.out.println(i);
			
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		System.out.println("Alphabet Thread End");
	}
}