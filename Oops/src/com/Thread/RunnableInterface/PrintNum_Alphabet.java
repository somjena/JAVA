package com.Thread.RunnableInterface;


class AlphaBet implements Runnable{

	@Override
	public void run() {
		for(char i ='A';i<='Z';i++) {
			System.out.println(i);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
	
}

class Num implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=26;i++) {
			System.out.println(i);
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		
	}
	
}

public class PrintNum_Alphabet {

	public static void main(String[] args) {
			System.out.println("Main Thread Start");
		new Thread(new AlphaBet()).start();
		new Thread(new Num()).start();
		    System.out.println("Main Thread End");
		

	}

}
