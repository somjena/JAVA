package com.Loops_Patterns;
import java.util.*;
public class Z_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Lines");
		int line = sc.nextInt();
		for(int i=1;i<=line;i++) {
			
			for(int j=1;j<=line;j++) {
				if(i==1 || i==line || i+j==line+1) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		

	}

}
