package com.ArrayPrograms;

public class FindSmallNumber {

	public static void main(String[] args) {
		/*[5,8,7,6,5,3,5]---------------->expected Output:-3*/
		int []n= {5,8,7,6,5,3,5};
		int smallnum=n[0];
		for(int i=1;i<n.length;i++) {
			if(n[i]<smallnum) {
				smallnum=n[i];
			}
		}
		System.out.println(smallnum);

	}

}
