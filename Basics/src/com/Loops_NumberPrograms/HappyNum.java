package com.Loops_NumberPrograms;
import java.util.Scanner;
public class HappyNum {         // 23 3^2+2^2 = 13 ---> 1^2 + 3^2=10-----1^2+0^2=1 it is a HappyNum

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int temp = n;
		int Sum = 0;
		
		do {
			while(n>0) {
				int digit=n%10;
				Sum+=digit*digit;
				n/=10;
			}
			n=Sum;
			Sum=0;
			
		} while (n!=1 && n!=4);
		if(n==1) {
			System.out.println(temp+" Is a Happy Number");
		}else {
			System.out.println(temp + " Is not a Happy Number");
		}
		

	}

}
