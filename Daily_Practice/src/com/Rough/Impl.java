package com.Rough;
//stack Last  in Fastout
public class Impl {

	public static void main(String[] args) {
		LinedList l= new LinedList();
		l.push(10);
		l.push(20);
		l.push(30);
		l.push(50);
		l.Display();
		System.out.println();
		System.out.println("peek "+l.peek());
		System.out.println("pop "+l.pop());
		l.Display();
		System.out.println();
		System.out.println(l.size());
		System.out.println("peek "+l.peek());
		System.out.println("pop "+l.pop());
		l.Display();
		

	}

}
