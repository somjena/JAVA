package com.ArrayBasics;

import java.util.Arrays;

public class SeparateOddEvenArray {
	public static void main(String[] args) {
		int []a= {4,8,15,16,23,42};
		int odd=0;
		int even=0;
		int j=0;
		int k=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				odd++;
			}else {
				even++;
			}
		}
		int []evenar=new int[even];
		int []oddar=new int [odd];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				oddar[j++]=a[i];
			}else {
				evenar[k++]=a[i];
			}
		}
		System.out.println(Arrays.toString(oddar)); 
		System.out.println(Arrays.toString(evenar)); 
	}

}
