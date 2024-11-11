package com.ArrayPrograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Element You Want to Serch");
		int e = sc.nextInt();
		
		int []a={2,5,4,5,3,7,8,9};
		System.out.println(LinearSearch(a, e));

	}

	public static int LinearSearch(int[] a, int e) {
		
		for(int i =0;i<=a.length;i++) {
			if(a[i]==e) return i;
			
			}
		return -1;
		}
	}
	


