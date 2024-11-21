package com.Queue.ArrayList;

public class Queue {
	 private Object []a;
	 private int pos;
	 
	 
	 // constructor to initialize the ArraySize
	 public Queue() {
		 a=new Object[5];
		 pos =0;
	 }
	 
	 
	 // The Add Method When Array Is Full
	 public void Add(Object ele) {
		 if(pos>=a.length) increase();
		 a[pos]=ele;
		 pos++;
	 }
	 // Method to Increase the Array Size When The Array is Full
	public void increase() {
		Object[] temp = new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}
	// Method to Count the Number of Element
	public int Size() {
		return pos;
	}
	//Method to Peek Which Element Inserted in the Array First
	public Object peek() {
		if(pos==0) {
			return null;
		}
		return a[0];
	}
	
	public Object poll() {
		if(pos==0) {
			return null;
		}
		Object temp =a[0];
		for(int i=0;i<Size();i++) {
			a[i]=a[i+1];
		}
		a[--pos]=null;
		return temp;
		
	}
	
	public void get() {
		for(int i=0;i<Size();i++) {
			System.out.println(a[i]);
		}
	}
}























