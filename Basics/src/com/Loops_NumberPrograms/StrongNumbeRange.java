package com.Loops_NumberPrograms;
import java.util.*;                   // 145------->  5!+4!+1! = 145
public class StrongNumbeRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Starting Range");
		int st = sc.nextInt();
		System.out.println("Enter The Ending Range");
		int end = sc.nextInt();
		
		
		for(int i = st;i<=end;i++) {
			int originalNum = i;
			int Sum =0;
			
			while(i!=0) {
				int digit=i%10;
				int prod=1;
				
			for(int j=1;j<=digit;j++) {
				prod*=j;
			}	
			Sum+=prod;
			i/=10;
			}
			if(Sum==originalNum) {
					System.out.println(originalNum);
			}
			i=originalNum;
		}
	}

}
