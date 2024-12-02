package com.ArrayList.ImpementationWithGeneric;

public class ArrayList<E> {
	private Object []a;
	private int pos;
	
	
	public ArrayList() {
		a=new Object[5];
		pos=0;
	}
	
	
	public boolean add(E e) {
		if (pos>=a.length)increase();
		a[pos]=e;
		pos++;
		return true;
	}

	public void increase() {
		Object []temp=new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}
	public int size() {
		return pos;
	}
	public boolean isEmpty() {
		return pos==0;
	}
	public E get(int index) {
		if(pos==0) {
			throw new IndexOutOfBoundsException();
		}
		return (E)a[index];
	}
	

}
