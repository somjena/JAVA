package com.Loops_NumberPrograms;
import java.util.*;
public class SpyNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number You Want To Check");
		int n= sc.nextInt();
		int temp = n;
		int Sum = 0;
		int Prod = 1;
		while(n!=0) {
			int Digit = n%10;
			Sum+=Digit;
			Prod*=Digit;
			n/=10;
		}
		if (Sum==Prod) {
			System.out.println(temp + " Is A SpyNumber");
		}else {
			System.out.println(temp + " Is Not A SpyNumber");
		}
		
	}

}
