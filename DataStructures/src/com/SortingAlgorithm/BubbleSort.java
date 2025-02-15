package com.SortingAlgorithm;
import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int a[]={9,3,1,4,8,7};
	System.out.println("Before sorting;"+Arrays.toString(a));
	sort(a);
	System.out.println("After sorting:"+Arrays.toString(a));
}

public static void sort(int[]a){
	for(int i=0;i<a.length-1;i++ ) {
		for (int j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
					System.out.println(temp);
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
	}
}
}