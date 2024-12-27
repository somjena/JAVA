package com.generic.ArrayDequeue.Emp;

import com.generic.ArrayDequeue.Integer.ArrayDequeue;

public class StoreEmp {
	public static void main(String[] args) {
		ArrayDequeue<Emp> e = new ArrayDequeue<Emp>();
		e.add(new Emp("Rintu",1 , 22, 20900.23));
		e.add(new Emp("Rintu",1 , 22, 20900.23));
		e.add(new Emp("Rintu",1 , 22, 20900.23));
		e.add(new Emp("Rintu",1 , 22, 20900.23));
		e.add(new Emp("Rintu",1 , 22, 20900.23));
		e.display();
		e.poplast();
		System.out.println("---------------------");
		e.display();
	}

}
