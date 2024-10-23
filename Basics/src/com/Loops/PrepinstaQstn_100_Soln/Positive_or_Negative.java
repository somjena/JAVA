package com.Loops.PrepinstaQstn_100_Soln;
import java.util.*;
public class Positive_or_Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : - ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println(num + " is A Negative Number");
		}else if (num==0) {
			System.out.println(num + " is Zero");
		}else {
			System.out.println(num + " is A Positive Number");
		}
		
	}

}
