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

	 //Increase Method
		private void increase() {
			Object[]temp = new Object[a.length/2];
			System.arraycopy(a, 0, temp, 0, a.length);
			a=temp;
			
		}
		

  
}
