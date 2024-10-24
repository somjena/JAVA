package com.recursion;
import java.util.*;;
public class StrongNumberUsingrecursion {           //1!+4!+5!=145

	public static int fact(int n) {
		if(n==1 || n==0)return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Range");
		int st= sc.nextInt();
		int end=sc.nextInt();
		
		
		for(int i =st;i<=end;i++) {
			int n =i;
			int Sum=0;
			
			while(n!=0) {
				int digit=n%10;
				Sum+=fact(digit);
				n/=10;
			}
			if(Sum==i) {
				System.out.println(i);
			}
		}
		

	}

}
