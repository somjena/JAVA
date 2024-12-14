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
		
	}
	
	
	
	synchronized public void consume(int items) {
		System.out.println("Required Items"+items);
		while(this.items<items) {
			System.out.println("Waiting for Update");
			try{Thread.sleep(500);}catch(Exception e) {}
			
		}
		
		this.items-=items;
		
		System.out.println("items Consumed "+ items);
	}
	
	
	
	
	

}
