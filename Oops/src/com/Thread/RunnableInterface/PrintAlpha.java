package com.Thread.RunnableInterface;

class R implements Runnable{
	
	@Override
	public void run() {
		for(char i ='A';i<='Z';i++) {
			System.out.println(i);
			try{Thread.sleep(500);}catch(Exception e) {}
		}
		
	}
	
}
public class PrintAlpha {
	public static void main(String[] args) {
		 new Thread(new R()).start();;
		
		
	}
}
