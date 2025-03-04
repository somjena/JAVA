package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class EvenCount {
	public static void main(String[] args) {
	List<Integer> l =Arrays.asList(1,2,3,4,5,6);
	l.stream()
	.filter(i->i%2==0)
	.forEachOrdered(i->System.out.print(i+" \t"));
	
	}

}
