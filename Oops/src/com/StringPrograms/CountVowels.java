package com.StringPrograms;
import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String You Want to Check");
		String Check = sc.nextLine();
		int count=0;
		for(int i =0;i<=Check.length()-1;i++) {
			char ch=(Check.charAt(i));
			if(CheckVowel(ch)) {
				count++;
			}
		}
		System.out.println(count);
		

	}
	static boolean CheckVowel(char ch) {
		return ch == 'a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch == 'A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U'; 
		
	}

}
