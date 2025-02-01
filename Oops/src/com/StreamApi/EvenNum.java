package com.StreamApi;

import java.util.Arrays;
import java.util.List;

public class EvenNum {

	public static void main(String[] args) {
	List <Integer> l =	Arrays.asList(1,2,3,4,5,6);
	System.out.println("Even Numbers Are :");
	l.stream().filter(i->i%2==0).forEach(i->System.out.println(i));

	}

}
