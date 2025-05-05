package com.Dsa.ArrayList;

public class PossibleSubArray {
	public static void main(String[] args) {
		int []nums = {1,3,2,3,3};
		int src=2;
		int init = nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>init) {
				init=nums[i];
			}
		}
		System.out.println(init);
	}

}
