package com.Array;

public class ArrayList {
	private Object []a;
	private int pos;
	
	public ArrayList() {
		a=new Object[6];
		pos=0;
	}
	
	//add Method
	public boolean add(Object ele) {
		if(pos>=a.length)increase();
		a[pos++]=ele;
		return true;
	}
	
	//Increase Method
	public void increase() {
		Object []temp = new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	
	//size method
	public int size() {
		return pos;
	}
	
	//Remove Method 
	public boolean remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		pos--;
		return true;
	}
	public boolean add(Object ele,int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(pos>=a.length)increase();
		for(int i=size()+1;i<=index;i--) {
			a[i+1]=a[i];
		}
		a[pos--]=ele;
		return true;
		
	}
	public void display() {
		for(int i=0;i<size();i++) {
			System.out.println(a[i]);
		}
	}
}
