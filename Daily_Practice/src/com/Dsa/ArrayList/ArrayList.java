package com.Dsa.ArrayList;

public class ArrayList <E>{
	private Object []a;
	private int pos;
	
	
	public ArrayList() {
		a=new Object [10];
		pos=0;
	}  
	
	public boolean add(E ele) {
		if(pos>=a.length)increase();
		a[pos++]=ele;
		return true;
		
	}
	
	
	public boolean add(int index,E ele) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		if(pos>=a.length)increase();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=ele;
		pos++;
		return true;
		
	}
	
	
	private void increase() {
		Object temp []=new Object[a.length+4];
		System.arraycopy(a, 0, temp, 0,a.length);
		a=temp;
		
	}
	
	
	public int size() {
		return pos;
	}
	
	
	public boolean isEmpty() {
		return pos==0;
	}
	
	
	public void traverse() {
		for(int i=0;i<size();i++) {
			System.out.println(a[i]);
		}
	}
	
	public boolean Remove(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		pos--;
		return false;
		
	}
	public E get(int index) {
		if(index<=-1||index>=size()) {
			throw new IndexOutOfBoundsException();
		}
		return (E) a[index];
	}

}
