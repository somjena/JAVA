package com.Thread.Type;

public class Main {
	public static void main(String[] args) {
		 Thread t1 = new Thread(new Alpha());
		//t1.setDaemon(false);// if We make it false then it will be deamon thread
		 t1.setDaemon(true); //if we make the argues as true it become nondeamon thread
		 t1.start();
		 
		 for(char c='A';c<='Z';c++) {
			 System.out.println(c);
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}

}
