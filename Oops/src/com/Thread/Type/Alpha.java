package com.Thread.Type;

public class Alpha implements Runnable{

	@Override
	public void run() {
		int i =1;
		while(true) {
			System.out.println(i);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		
	}

}
