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
	//isEmpty Method 
		public boolean isEmpty() {
			return pos==0;
		}
	//size method 
		public int size() {
			return pos;
		}
	//remove Method
		public boolean Remove(int index) {
			if(index<=-1||index>=size()) {
				throw new IndexOutOfBoundsException();
			}
			for(int i =index+1;i<size();i++) {
				a[i-1]=a[i];
			}
			pos--;
			a[pos]=null;
			return true;
			
		}

}
