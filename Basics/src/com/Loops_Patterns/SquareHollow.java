package com.Loops_Patterns;
import java.util.*;
public class SquareHollow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Num");
		int n = sc.nextInt();
		
		
		for(int i =1;i<=n;i++) {
			
			for(int j =1;j<=n;j++) {
				if(i==1 || j==1 || i==n || j==n) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
