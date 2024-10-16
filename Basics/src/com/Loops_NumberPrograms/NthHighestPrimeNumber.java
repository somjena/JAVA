package com.Loops_NumberPrograms;
import java.util.*;
public class NthHighestPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Starting Range");
		int st =sc.nextInt();
		System.out.println("Enter The Ending Range");
		int end = sc.nextInt();
		int count =0;
		for(int i =st;i<=end;i++) {
			if(i==1)continue;
			boolean flag = true;
		
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				count++;
				//System.out.println(i);
				if(count==3) {
				System.out.println(i);
				break;
				}
			}
		
			
		}

	}

}
