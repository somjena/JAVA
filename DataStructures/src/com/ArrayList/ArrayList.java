package com.ArrayList;

public class ArrayList {
	 private Object []a;
	 private int pos;
	
	public ArrayList() {
		a=new Object[5];
		pos =0;
	}
	
	public String Add(Object o) {
		if(pos>=a.length) increase();
		a[pos++]=o;
		
		return "Added Successfully " + o +" "+pos;
	}
	public void increase() {
		Object temp[]= new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
	     a=temp;
		
	}
}
