package com.Thread.RunnableInterface;

class R implements Runnable{
	@Override
	public void run() {
		for(char i ='A';i<='Z';i++) {
			System.out.println(i);
		}
		
	}
	
}
public class PrintAlpha {
	public static void main(String[] args) {
		Thread t1 = new Thread(new R());
		t1.start();
		
	}
}
