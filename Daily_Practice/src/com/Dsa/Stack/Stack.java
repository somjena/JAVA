package com.Dsa.Stack;

import java.util.EmptyStackException;

public class Stack {
	private Object []a;
	private int pos;
	
	public Stack() {
		a=new Object[5];
		pos=0;
	}
	
	//Add Method
	public boolean push (Object ele) {
		if(pos>=a.length)increase();
		a[pos++]=ele;
		return true;
	}
	//increase method
	private void increase() {
		Object temp[]= new Object[a.length+3];
		System.arraycopy(a,0,temp,0,a.length);
		a=temp;
		
	}
	//size Method 
	public int size() {
		return pos;
	}
	//peek method
	public Object peek() {
		if(pos==0) {
			throw new EmptyStackException();
		}
		return a[size()-1];
	}
	//pop Method
	public Object pop() {
		if(pos==0) {
			throw new EmptyStackException();
		}
		Object temp = a[size()-1];
		Object cons[]=new Object[a.length-1];
		System.arraycopy(a, 0, cons, 0, a.length-1);
		a=cons;
		pos--;
		return temp;
	}
}
