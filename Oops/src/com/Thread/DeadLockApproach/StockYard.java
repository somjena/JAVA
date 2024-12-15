package com.Thread.DeadLockApproach;

public class StockYard {
	private int items;
	private static StockYard obj=null;
	
	private StockYard() {
		
	}
	public static StockYard getinstance() {
		if(obj==null)obj=new StockYard();
		return obj;
		
		
	}
	
	synchronized public void update(int items) {
		this.items+=items;
		System.out.println("items Updated to "+items);
		notify(); // notify Method Implements When the update complete it will notify the wait state method
		
		
	}
	
	
	
	synchronized public void consume(int items) {
		System.out.println("Required Items"+items);
		while(this.items<items) {
			System.out.println("Less Stock ! Waiting for Update ");
			try{Thread.sleep(500);}catch(Exception e) {}
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.items-=items;
		
		System.out.println("items Consumed "+ items);
	}
	
	
	
	
	

}
