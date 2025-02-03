package com.StreamApi;

import java.util.Arrays;

public class RemoveDiplicate {
	public static void main(String[] args) {
		int []a = {1,2,3,1,2,2,1,3};
		int []arr=Arrays.stream(a).distinct().toArray();
		System.out.print(Arrays.toString(arr));
	}

}
