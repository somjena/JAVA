package com.HackerRank;

public class NumPair {
	public static void main(String[] args) {
		int []a = {2,5,4,9,6,2};
		//n =2   //pair mode if(i && j = same ) || (pair mode a*j=n)
		System.out.println(check(a, 2));
		
		
	}
	
	public static int check(int []a, int n) {
		int start = 0;
		int move = 1;
		int count=0;
		for(int i=start;i<a.length;i++) {
			for(int j=move;j<a.length;j++) {
				if(a[i]==a[j]||a[i]*a[j]==n) {
					System.out.println(a[i] +" "+a[j]);
					count++;
				}
			}
			
		}
		return count;
	}

}
