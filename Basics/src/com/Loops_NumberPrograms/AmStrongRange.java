package com.Loops_NumberPrograms;
import java.util.*;
public class AmStrongRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Starting Number");
		int st = sc.nextInt();
		System.out.println("Enter The Ending Range");
		int end = sc.nextInt();
		
		
		for(int i = st;i<=end;i++) {
			int Originalnum = i;
			int Sum=0;
			int digits=0;
			
			
			int temp = i;
			while(temp!=0) {
				temp/=10;
				digits++;
			}
			
			temp =i;
			while(temp!=0) {
				int digit =temp%10;
				int prod = 1;
				
				
				for(int j=1;j<=digits;j++) {
					prod*=digit;
				}
				Sum+=prod;
				temp/=10;
				
			}
			if(Sum==Originalnum) {
				System.out.println(Originalnum);
			}
			
			
			
		}
	}

}
