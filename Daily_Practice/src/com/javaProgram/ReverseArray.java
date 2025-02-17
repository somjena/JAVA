package com.javaProgram;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9};
		System.out.println("Before Reverse"+Arrays.toString(arr));
		System.out.println("After Reverse"+Arrays.toString(reverseArray(arr)));

	}
      public static int[] reverseArray(int[]a) {
    	  int[]temp=new int[a.length];
    	  int j =0;
    	  for(int i=a.length-1;i>=0;i--) {
    		 temp[j++]=a[i];
    	  }
		return temp;
    	  
	
		
	}

}
