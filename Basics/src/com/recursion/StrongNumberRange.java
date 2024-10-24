package com.recursion;
import java.util.*;
public class StrongNumberRange { 
	static int prod=1;
	
	//145 ---- 1!+4+!+5! = 145
	
	
	
	public static int Fact(int n) {
		if(n==0 ||n==1) return 1;
		return n*Fact(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n  = sc.nextInt();
		int temp =n;
		int Sum=0;
		
		while(n!=0){
			int digit = n%10;
			Sum+=Fact(digit);
			
			n/=10;
			
		}
		if(Sum==temp) {
			System.out.println(temp + " is a Strong Number");
		}else {
			System.out.println(temp + " is not a Strong Number");
		}
		
		

	}

}
