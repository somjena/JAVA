package com.Dsa.Stack;

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
	public void increase() {
		
	}
}
