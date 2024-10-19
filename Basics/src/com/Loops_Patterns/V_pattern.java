package com.Loops_Patterns;
import java.util.*;
public class V_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbr of Lines");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			
			for(int j=1;j<=n*2-1;j++) {
				if(i==j || i+j==2*n) {
	     	System.out.print("X");
			
			}else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}


	}

}
