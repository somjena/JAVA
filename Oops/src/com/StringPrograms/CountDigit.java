package com.StringPrograms;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The String");
		String name = sc.nextLine();
		int count=0;
		for(int i =0;i<=name.length()-1;i++) {
			char c=(name.charAt(i));
			if(c>'0'&&c<'9') {
				count++;
		}
			}
		System.out.println(count);

	}

	 static boolean countnum(char c) {
		return c == '0'||c == '1' ||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'|| c=='7'|| c=='8'|| c=='9'; 
	}

	

}
