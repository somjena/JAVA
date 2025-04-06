package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class CheckifAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l = Arrays.asList(1,2,3,4,5);
		boolean check = l.stream().anyMatch(i->i<0);
		System.out.println(check);

	}

}
