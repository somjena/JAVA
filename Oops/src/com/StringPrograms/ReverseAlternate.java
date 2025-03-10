package com.StringPrograms;



public class ReverseAlternate {
	public static void main(String[] args) {
		String s = "java is very easy";
		String []ar = s.split(" ");
			
		for(int i=0;i<ar.length;i++) {
			System.out.print(rev(ar[i])+" ");
		}
	}
	public static String rev(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			sb.append(s.charAt(i));
		}
		return new String(sb);
	}

}
