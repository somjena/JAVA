package com.Thread.DeadLockApproach;

public class SalesBranch1 {

	public static void main(String[] args) {
		
		
		new ConsumerThread(30);
		try{Thread.sleep(500);}catch(Exception e) {}
		new UpdateThread(50);

	}

}
