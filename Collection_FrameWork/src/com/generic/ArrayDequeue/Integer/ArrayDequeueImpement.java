package com.generic.ArrayDequeue.Integer;

public class ArrayDequeueImpement {

	public static void main(String[] args) {
		ArrayDequeue<Integer> ad = new ArrayDequeue<Integer>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(60);
		ad.add(70);
		ad.add(80);
		ad.add(90);
		ad.add(100);
		ad.add(110);
		ad.add(220);
		ad.add(130);
		ad.add(140);
		System.out.println(ad.isEmpty());
		System.out.println(ad.Size());
		System.out.println(ad.removefirst());
		
	}

}
