package com.Loops_Patterns;
import java.util.*;
public class Diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Lines");
		int n = sc.nextInt();
		int Star =1;
		int Space = n/2;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=Space;j++) {
				System.out.print(" ");
			}
			for(int k =1;k<=Star;k++) {
				System.out.print("X");
			}
			System.out.println();
			if (i<=n/2)
			{
				Space--;
				Star+=2;
			}else{
				Space++;  
				Star-=2;
			}
			
		}
		
	}

}
