package com.generic.ArrayDequeue.Integer;

public class ArrayDequeue <E>{
	private Object[] a;
	private int pos;
	
	
	public ArrayDequeue() {
		a=new Object[11];
		pos=0;
	}
	
	//add Method
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
	//removefirst Method
	public boolean removefirst() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=0;i<pos-1;i++) {
			a[i]=a[i+1];
		}
		a[pos--]=null;
		return true;
		
	}
	public E peekfirst() {
		return (E) a[0];
	}
	
	
}
