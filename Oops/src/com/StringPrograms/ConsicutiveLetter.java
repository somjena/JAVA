package com.StringPrograms;
import java.util.*;
public class ConsicutiveLetter {          //success---->cc  >ss

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String s= sc.nextLine();
		StringBuilder add = new StringBuilder();
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				add.append(s.charAt(i)).append(s.charAt(i+1)).append(" ");
				i++;
				}
			}
		if(add.length()>0) {
			System.out.println(add.toString());
		}
		
		

	}

}
