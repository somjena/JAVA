package com.streamApi;

import java.util.Arrays;
import java.util.List;


public class SumofAllNumberinList {
static int sum=0;
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		 list.stream().forEach(i->sum+=i);
		 System.out.println(sum);
	}

}
