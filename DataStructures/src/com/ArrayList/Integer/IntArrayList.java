package com.ArrayList.Integer;

public class IntArrayList {
	private int[]a;
	private int pos;
	
	
	public IntArrayList(){
		a=new int [5];
		pos=0;
	}
	public boolean Add(int n) {
		if (pos>=a.length)increase();
		a[pos]=n;
		pos++;
		return true;
	}
	public void increase() {
		int[]temp = new int [a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}
	
	public boolean isEmpty() {
		return pos==0;
	}
	
	public int Size() {
		return pos;
	}
	
	public int get(int index) {
		if(index<=-1|| index>=pos) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return a[index];
	}

}
