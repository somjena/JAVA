package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class CountOdd {
	public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8);
	long oddcount =l.stream().filter(i->i%2==0).count();
	System.out.println(oddcount);
	}

}
