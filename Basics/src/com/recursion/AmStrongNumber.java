package com.recursion;
import java.util.*;
public class AmStrongNumber {
	static int count;
	
	public static int AmStrong(int n) {
		if(n==0)return 0;
		return (int)Math.pow(n%10, count)+AmStrong(n/10);//recursive Call to Amstrong();
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num =sc.nextInt();
		int Temp = num;
		int RealNum = num;
		while(num!=0) {
			num/=10;
			count++;
		}
		
		int res = AmStrong(RealNum);// Return the Values After the Recursive Call 
		if(res==Temp) {
			System.out.println(Temp + " Is A AmStrong Number");
		}else {
			System.out.println(Temp + " Is Not A Amstrong Number");
		}
	}

}
