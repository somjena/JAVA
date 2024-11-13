package com.T2DArray;

public class Sumofallelement {
	
		public static void main(String[] args) {
			int Sum=0;
			int [][]a= {

					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					Sum+=a[i][j];
				}
			}
			System.out.println(Sum);

		}

	}
