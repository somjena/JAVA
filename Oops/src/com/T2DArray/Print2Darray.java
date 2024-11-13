package com.T2DArray;

public class Print2Darray {

	public static void main(String[] args) {
		int [][]a= {

				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for(int []temp:a) {
			for(int n:temp) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
}