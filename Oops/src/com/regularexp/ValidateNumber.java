package com.regularexp;

import java.util.regex.Pattern;

public class ValidateNumber {

	public static void main(String[] args) {
		System.out.println(isValidate("6371326214"));
	}
	public static boolean isValidate(String s) {
		String exp ="[6-9][0-9]{9}";
		if(Pattern.matches(exp, s)){
			return true;
		}else {
			return false;
		}
	}

}
