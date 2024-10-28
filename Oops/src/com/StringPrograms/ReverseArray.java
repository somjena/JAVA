package com.StringPrograms;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.println(rev("Soumitra"));
		
	}
	static String rev(String s) {
		char [] a = s.toCharArray();
		int i=0; int j =a.length-1;
		while(i<j) {
			char temp =a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}

}
