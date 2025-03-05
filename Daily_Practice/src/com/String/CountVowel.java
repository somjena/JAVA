package com.String;

public class CountVowel {
	public static void main(String[] args) {
		String s = "Aeiou";
		s=s.toLowerCase();
		int count =0;
		
		for(int j=0;j<s.length();j++) {
			if(check(s.charAt(j))) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean check(char s) {
		char vowel[]= {'a','e','i','o','u'};
		for(int i=0;i<vowel.length;i++) {
			if(vowel[i]==s) 
				return true;
			}
		return false;
		}
	


	}

