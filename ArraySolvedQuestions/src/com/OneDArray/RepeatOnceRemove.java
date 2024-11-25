package com.OneDArray;
//Q.26
public class RepeatOnceRemove {

	public static void main(String[] args) {
		int []a= {1,2,1,3,2,4};
		//int res[]=new int [a.length];
		for(int i=0;i<a.length-1;i++) {
			for(int j =1;j<a.length-1;j++) {
				if(a[i]==a[j]) {
					break;
				}
			}
		}

	}

}
