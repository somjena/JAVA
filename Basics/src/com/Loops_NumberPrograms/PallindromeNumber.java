package com.Loops_NumberPrograms;
import java.util.*;
public class PallindromeNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num :");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        
        while(num!=0){
        	int digit=num%10;
        	rev= rev*10+digit;
        	num/=10;
        }
        if(rev==temp) {
        	System.out.println(temp + " is a Pallindrome Number");
        }else {
        	System.out.println(temp + " is not a Pallindrome Number");
        }
        

	}

}
