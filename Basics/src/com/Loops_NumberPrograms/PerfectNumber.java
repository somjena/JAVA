package com.Loops_NumberPrograms;
import java.util.*;
public class PerfectNumber {               //1+2+3 = 6

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int Sum=0;
		
		for(int i =1;i<=n/2;i++) {
			if(n%i==0)
			Sum+=i;
		}
		if(Sum==n) {
			System.out.println(n +" is a Perfect Number");
		}else {
			System.out.println(n + " is not a Perfect Number");
		}
		
	}

}
