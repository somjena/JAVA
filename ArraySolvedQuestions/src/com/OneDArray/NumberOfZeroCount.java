package com.OneDArray;
//Q13
public class NumberOfZeroCount {

	public static void main(String[] args) {
		int []a= {1,0,3,0,5,6,0};
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0)
				count++;
			
		}
		System.out.println("Total Zero Present in Array Is :- "+count);

	}

}
