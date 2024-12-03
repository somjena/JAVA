package com.ArrayList.ObjectType;

public class ArrayList {
	 private Object []a;
	 private int pos;
	
	public ArrayList() {
		a=new Object[5];
		pos =0;
	}
	
	public boolean Add(Object o) {
		if(pos>=a.length) increase();
		a[pos++]=o;
		return true;
	}
	public void increase() {
		Object temp[]= new Object[a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
	     a=temp;
		
	}
	public int Size() {
		return pos;
	}
	public Object get(int index) {
		if(index<=-1||index>=Size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public boolean Remove(int index) {
		if(index<=-1||index>=Size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i =index+1;i<Size();i++) {
			a[i-1]=a[i];
		}
		pos--;
		a[pos]=null;
		return true;
		
	}
	public Object  Add(int index,Object o) {
		if(index<=-1||index>=Size()) {
			throw new IndexOutOfBoundsException();
		}
		if(pos>=a.length)increase();
		for(int i=Size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=o;
		pos++;
		return "SuccessFully Entered "+o+" in index :-"+index;
	}
	
	
}
