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
	//peek method
	public Object peek() {
		if(pos==0)return null;
		return a[0];
	}
	//poll method
	public Object poll() {
		if(pos==0)return null;
		Object temp = a[0];
		Object []cons = new Object[a.length-1];
		System.arraycopy(a, 1, cons, 0, a.length-1);
		a=cons;
		pos--;
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
