package com.Stack.ArrayList;

import java.util.EmptyStackException;

public class Stack {
	private Object []a;
	private int pos;
	
    public Stack() {
    	a=new Object[5];
    	pos=0;
    }
    
    
    public void push(Object o) {
    	if(pos>=a.length) increase();
    	a[pos]=o;
    	pos++;
    	
    }
    public int size() {
    	return pos;
    }


	public void increase() {
		Object [] temp =new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}
	public Object peek() {
		if(pos==0) {
			throw new EmptyStackException();
		}
		return a[size()-1];
	}

}
