package com.Loops_Patterns;
import java.util.*;
public class CrossPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Lines");
		int n = sc.nextInt();
		
		
		for(int i =1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i==j || i+j ==n+1) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	

	}

}
