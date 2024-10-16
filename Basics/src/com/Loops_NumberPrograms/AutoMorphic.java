package com.Loops_NumberPrograms;
import java.util.*;
public class AutoMorphic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		boolean flag = true;
		int sqr = n*n;
		int temp = n;
		while(n>0) {
			if(n%10!=sqr%10) {
				flag = false;
			}
		n/=10;
		sqr/=10;
		
		}
		if(flag) {
			System.out.println(temp + " Is a AutoMorphic Number");
		}else {
			System.out.println(temp + " is Not a AutoMorphic Number");
			
		}
	}

}
