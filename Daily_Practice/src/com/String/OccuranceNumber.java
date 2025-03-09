package com.String;

public class OccuranceNumber {
	public static void main(String[] args) {
		String s = "helloworld";
		StringBuilder sb = new StringBuilder();
		int[] freq = new int[256];

		// Count the frequency of each character
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)]++;
		}

		// Append character along with their frequency in the same order of occurrence
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i)] != 0) {
				sb.append(s.charAt(i));
				sb.append(freq[s.charAt(i)]);
				freq[s.charAt(i)] = 0; // Avoid processing the same character again
			}
		}

		System.out.println(sb.toString());
	}
}
