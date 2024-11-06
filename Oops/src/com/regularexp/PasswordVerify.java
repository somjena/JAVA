package com.regularexp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordVerify {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter Your Password");
		String pass = sc.nextLine();
		if(isValidate(pass)) {
			System.out.println("Validate Success - "+pass);
		}else {
			System.out.println("Invalid Format Follow -->"+"\n"+"1.Should Have Atleast One UpperCase"+"\n"+"2.Should Have Atleast One LowerCase"
					+"\n"+"2.Should Have Atleast One Number"+"\n"+"2.Should Have Atleast One Special character "+"\n"+"Suggest pass :-Soumitra@1234");
		}
		

	}
	public static boolean isValidate(String s) {
		String exp = "(?=.*[!@#$%^&*_+])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,15}";
		if(Pattern.matches(exp, s)) {
			return true;
		}
		return false;
	}

}
