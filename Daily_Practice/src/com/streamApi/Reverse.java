package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class Reverse {
	public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,4,5,6);
	l.stream().sorted((a,b)->b-a).forEach(i->System.out.print(i));
	}

}
