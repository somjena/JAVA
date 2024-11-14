package com.T2DArray;

public class TransPoseMatrix {

	public static void main(String[] args) {
		int [][]a= {
				{2,3,5},
				{7,1,0},
				{6,9,5}
				
		};
		int b[][]= new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=a[j][i];
			}
			
			}
		for(int[]n:b) {
			for(int temp:n) {
				System.out.print(temp+" ");
			}
			System.out.println();
			
		}
		

	}

}
