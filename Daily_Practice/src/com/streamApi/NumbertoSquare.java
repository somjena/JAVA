package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class NumbertoSquare {

	public static void main(String[] args) {
		
		List <Integer> l =Arrays.asList(2,3,4,5,6,7,8);
		l.stream().map(i->i*i).forEach(i->System.out.println(i));

	}

}
