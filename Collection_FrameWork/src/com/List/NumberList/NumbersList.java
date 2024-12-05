package com.List.NumberList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NumbersList {

	public static void main(String[] args) {
		List <Integer>l = new LinkedList<Integer>();
		l.add(20);
		l.add(60);
		l.add(10);
		l.add(50);
		l.add(30);
		l.add(40);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println("Before Sort-->");
		System.out.println(l);
		Collections.sort(l);
		System.out.println("After Sort-->");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	}

}
