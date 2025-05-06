package com.HackerRank;
public class PaliPrint {
	public static void main(String[] args) {
		String s = "madam rintu rintu madam";
		String []words = s.split(" ");
		for(String name:words) {
			if(checkPali(name)) {
				System.out.println(name);
			}
		}
		
		//System.out.println(Arrays.toString(words));	
	}
	
	public static boolean checkPali(String s) {
		char[]a=s.toCharArray();
		int j=a.length-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[j]) {
				return false;
			}
			j--;
		}
		return true;
	}
	
	
	}



