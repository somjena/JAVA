package com.Array;

import java.util.HashSet;

import java.util.Set;
public class CommonElement {
	public static void main(String[] args) {
		
		int[] a= {3,5,6,2,8};
		int[] b= {9,2,5,7,6,3,2};
		
		Set<Integer> s = new HashSet<>();
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) 
					s.add(a[i]);
				
			}
			
		}
		System.out.println(s);
		
	}

}
