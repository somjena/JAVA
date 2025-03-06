package com.String;

public class MaxCharcountinString {

	public static void main(String[] args) {
		String s = "Ramana";
		int []freq = new int [256];
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			freq[c]++;
		}
			int maxcount = 0;
			char maxchar =' ';
			for(int j=0;j<freq.length;j++) {
				if(freq[j]>maxcount) {
					maxchar=(char)j;
					maxcount=freq[j];
				
			}
		}
		System.out.println(maxchar+" : "+maxcount);

	}

}
