package com.Loops_Patterns;
import java.util.*;
public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number Of Lines");
		int n = sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
			System.out.println();
		}

	}

}
