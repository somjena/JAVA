package com.Thread.DeadLockApproach;

public class ConsumerThread implements Runnable{

	int items;
	public ConsumerThread(int items) {
		this.items=items;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("Consumer Thread Started");
		StockYard.getinstance().consume(items);
		
	}

}
