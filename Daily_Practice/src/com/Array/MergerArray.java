package com.Array;

import java.util.Arrays;

public class MergerArray {
    public static void main(String[] args) {
        int[] a = {4, 6, 7, 8};
        int[] b = {9, 3, 5, 2};
        int[] arr = new int[a.length + b.length];
        System.arraycopy(a, 0, arr, 0, a.length);
        System.arraycopy(b, 0, arr, a.length, b.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int even=0;
        int odd=0;
       
       
        for(int i =0;i<arr.length;i++) {
        	if(arr[i]%2==0) {
        		even++;
        	}else {
        		odd++;
        	}
        	
        }
        int[] evenarr = new int[even];
        int[] oddarr = new int[odd];

        // Populate evenarr and oddarr
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenarr[evenIndex++] = arr[i]; // Use separate indices for evenarr
            } else {
                oddarr[oddIndex++] = arr[i]; // Use separate indices for oddarr
            }
        }
        System.out.println(Arrays.toString(evenarr));
        System.out.println(Arrays.toString(oddarr));

    }
}