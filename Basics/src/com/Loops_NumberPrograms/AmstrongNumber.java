package com.Loops_NumberPrograms;
import java.util.*;
public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int OriginalNum = n;
		int digit=0;
		int Sum=0;
		
		int temp =n;
		while(temp!=0) {
			temp/=10;
			digit++;
		}
		
		
		temp = n;
		while(temp!=0) {
			int digits=temp%10;
			int prod = 1;
			for(int i=1;i<=digit;i++) {
				prod*=digits;	
			}

			Sum+=prod;
			temp/=10;
		}
		
		if(Sum==OriginalNum) {
			System.out.println(OriginalNum+ " is a AmStrong Number");
		}else {
			System.out.println(OriginalNum+ " Is Not a Amstrong Number");
		}
		
	}

}
