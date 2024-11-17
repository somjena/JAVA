package com.OneDArray;
//Q15
public class IndexValueOfGivenElement {

	public static void main(String[] args) {
		int []a = {1,2,9,3,9,4,9,6,7,8};
		int target=9;
		int lastindex=-1;
		
		for(int i =0;i<a.length;i++) {
			if(a[i]==target)
				lastindex=i;
			
			
		}
		System.out.println(lastindex);

	}

}
