package com.generic.ArrayDequeue.Integer;

public class ArrayDequeue <E>{
	private Object[] a;
	private int pos;
	
	
	public ArrayDequeue() {
		a=new Object[11];
		pos=0;
	}
	
	
	public boolean add(E ele) {
		if(pos>=a.length)increase();
		a[pos++]=ele;
		return true;
	}

	//Resizeable Array
	private void increase() {
		Object []temp=new Object[a.length+5];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}
	
	//Size Method
	public int Size() {
		return pos;
	}
	//isEmpty Method
	
	public boolean isEmpty() {
		return pos==0;
	}
	
	

}
