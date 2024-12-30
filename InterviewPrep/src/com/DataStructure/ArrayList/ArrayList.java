package com.DataStructure.ArrayList;

public class ArrayList <E>{
	private Object[] a;
	private int pos;
	
	
	public ArrayList() {
		a=new Object [10];
		pos=0;
	}
	
	
	
	//add Method
	public boolean add(E ele) {
		if(pos>=a.length)increase();
		a[pos++]=ele;
		return true;
	}


  
}
