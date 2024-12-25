package com.generic.ArrayDequeue.Integer;

public class ArrayDequeue {
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

}
