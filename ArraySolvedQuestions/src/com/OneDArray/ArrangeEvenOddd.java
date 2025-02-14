package com.OneDArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrangeEvenOddd {

	public static void main(String[] args) {
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		int []a= {1,3,4,5,6,7,2,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				even.add(a[i]);
			}
			else {
				odd.add(a[i]);
			}
		}
		System.out.println(even);
		System.out.println(odd);
		even.addAll(odd);
		System.out.println(even);
	}

}
