package com.generic.ArrayDequeue.Integer;

public class ArrayDequeue <E>{
	Object[] a;
	int pos;
	
	
	public ArrayDequeue() {
		a=new Object[11];
		pos=0;
	}
	
	public int Size() {
		return pos;
	}
	public boolean isEmpty() {
		return pos==0;
	}
	
	public boolean add(E ele) {
		if(pos>=a.length)increase();
		a[pos++]=ele;
		return true;
	}

	private void increase() {
		Object []temp=new Object[a.length+5];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}

}
