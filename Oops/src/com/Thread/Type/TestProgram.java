package com.Thread.Type;

public class TestProgram extends Thread{
	@Override
	 public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
