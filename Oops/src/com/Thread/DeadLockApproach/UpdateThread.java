package com.Thread.DeadLockApproach;

public class UpdateThread implements Runnable{

	int items;
	public UpdateThread(int items) {
		this.items=items;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println("Update thread Starts");
		StockYard.getinstance().update(items);
		
	}

}
