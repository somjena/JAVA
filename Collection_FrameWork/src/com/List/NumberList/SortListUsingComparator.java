package com.List.NumberList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortListUsingComparator {

	public static void main(String[] args) {
		List <Integer>l = new LinkedList<Integer>();
		l.add(40);
		l.add(30);
		l.add(50);
		l.add(20);
		l.add(10);
		System.out.println("Before sorting");
		System.out.println(l);
		Collections.sort(l , new DescComparator());
		System.out.println("After Sorting");
		System.out.println(l);
		

	}

}
class DescComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2-i1;
	}
	
}
