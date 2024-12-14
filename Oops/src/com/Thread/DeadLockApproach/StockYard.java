package com.Thread.DeadLockApproach;

public class StockYard {
	int items;
	
	private StockYard() {
		
	}
	
	public void update(int items) {
		this.items+=items;
		System.out.println("items Updated to "+items);
		
	}
	
	
	
	public void consume(int items) {
		System.out.println("Required Items"+items);
		while(this.items<items) {
			System.out.println("Waiting for Update");
		}
		
		this.items-=items;
		
		System.out.println("items Consumed "+ items);
	}
	
	
	
	
	

}
