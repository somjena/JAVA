package com.OneDArray;

import java.util.Arrays;

//Q22
public class SecondLargestElement {

	public static void main(String[] args) {
		int []a= {1,2,1,3,2,4,4};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {	
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int SecondLargest =a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			if(a[i]<SecondLargest) {
			SecondLargest=a[i];
			break;
			}
			
		}
		if(SecondLargest!=-1) {
			System.out.println(SecondLargest);
		}

	}

}
