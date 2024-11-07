package com.ArrayPrograms;

import java.util.Arrays;

public class CopyArraySystem {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(a));
		
		System.arraycopy(a, 0, a, 2, 3);
		System.out.println("a = "+Arrays.toString(a) );

	}

}
