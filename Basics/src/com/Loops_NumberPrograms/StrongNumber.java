package com.Loops_NumberPrograms;
import java.util.*;    //145   1! + 4! + 5! = 145 True
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n= sc.nextInt();
		int temp = n;
		int Sum= 0;
		
		
		while(n!=0) {
			int digit = n%10;
			int prod= 1;
		for(int i = 1;i<=digit;i++) {
			prod*=i;
		}	
		Sum+=prod;
		n/=10;
			
		}
		if(Sum==temp) {
			System.out.println(temp + " Is A Strong Number");
		}else {
			System.out.println(temp + " is Not A Strong Number");
		}
	}
	

}
