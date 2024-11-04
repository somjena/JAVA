package com.StringPrograms;

public class MissingVowel {

	public static void main(String[] args) {
		String s = "amaran";
		String vowels = "aeiou";
		s= s.toLowerCase();
		System.out.println("Missing Vowels");
		for(char vowel:vowels.toCharArray()) {
			if(!s.contains(String.valueOf(vowel))) {
				System.out.print(vowel+ " ");
			}
		}
		
		

	}
	

}
