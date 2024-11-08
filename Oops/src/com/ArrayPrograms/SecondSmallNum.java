package com.ArrayPrograms;

public class SecondSmallNum {

	public static void main(String[] args) {
		
		int[]a= {5,9,8,7,3,5};              /*{5,2,3,4,6,4,5}----------->expected output :-4*/
		
		int small=a[0];
		int secondsmall=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]==small)continue;
			if(a[i]<small) {
				
				secondsmall=small;
				small=a[i];
				
				
			}else if(a[i]<secondsmall ||small==secondsmall) {
				secondsmall=a[i];
				
			}
		
			
		}
		System.out.println( "Second Small Number :-"+secondsmall);

	}

}
