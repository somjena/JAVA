package com.recursion;
import java.util.Scanner;
public class FiboNacci {
	
	public static void fibo(int a,int b,int count) {
		if(count==0) return ;
		System.out.println(a);
		fibo(b,a+b,count-1);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Start Number");
		int st = sc.nextInt();
		System.out.println("Enter The Second Number");
		int scnd = sc.nextInt();
		System.out.println("Enter The Pos");
		int pos = sc.nextInt();
		
		fibo(st,scnd,pos);

	}

}
