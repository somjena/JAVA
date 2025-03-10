package com.String;

public class Reverse {
	public static void main(String[] args) {
		String s ="easy very is java";
		String[] sh=s.split(" ");
		
		for(int i=sh.length-1;i>0;i--) {
			System.out.print(sh[i]+" ");
		}
	}

	
}
