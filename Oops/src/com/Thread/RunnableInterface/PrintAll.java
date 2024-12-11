package com.Thread.RunnableInterface;

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
public class PrintAll {

	public static void main(String[] args) {
		System.out.println("Main Thread Start");
		Thread t1 = new Alphabet();
		t1.start();
		Thread t2 = new Number();
		t2.start();
		System.out.println("Main Thread Ends");

	}

}
