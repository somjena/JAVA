package com.javaProgram;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int []a = {3,3};
		System.out.println(Arrays.toString(sum(a, 6)));
		
		
	}
	public static int[] sum(int []nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]==target-nums[i]) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {};
		
	}

}
