package com.Loops_NumberPrograms;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The 1st Number");
		int n1= sc.nextInt();
		System.out.println("Enter The Second Number");
		int n2=sc.nextInt();
		int lcm =(n1>n2)?n1:n2;
		while(true) {
			if(lcm%n1==0 && lcm%n2==0) {
				System.out.println(" Lcm is "+ lcm);
				break;
			}
			lcm++;
		}
		

	}

}
