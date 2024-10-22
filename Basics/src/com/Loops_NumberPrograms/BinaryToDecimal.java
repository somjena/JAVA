package com.Loops_NumberPrograms;
import java.util.*;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Binary Number");
		int Binary = sc.nextInt();
		int n =0;
		int Decimal = 0;
		while(Binary!=0) {
			int temp = Binary%10;
			Decimal+=temp*Math.pow(2, n);
			Binary/=10;
			n++;
		}
		System.out.println(Decimal);
	}

}
