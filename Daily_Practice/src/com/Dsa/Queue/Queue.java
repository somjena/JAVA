package com.Dsa.Queue;

public class Queue {
	private Object[]a;
	private int pos;
	
	public Queue() {
		a=new Object[5];
		pos=0;
	}
	//add Method
	public boolean add(Object ele) {
		if(pos>=a.length)increase();
		a[pos++]=ele;
		return true;
	}
	//increase method
	private void increase() {
		Object []temp = new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	//size method
	public int size() {
		return pos;
	}
	
}
