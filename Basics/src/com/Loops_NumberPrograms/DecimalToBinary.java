package com.Loops_NumberPrograms;
import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		String s = "";
		while(n!=0) {
			int res = n%2;
			s=res+s;
			n/=2;
		}
		System.out.println(s);
	}
	

}
