package com.StringPrograms;

public class Encoding {

	public static void main(String[] args) {
		String s = "jsp";
		String endcodedstr = encode(s,15);
		System.out.println(endcodedstr);
		// TODO Auto-generated method stub

	}
	static String encode(String s,int l) {
		char[]arr=s.toCharArray();
		char[]letter="abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			char c =arr[i];
			 arr[i] = (char) (((c - 'a' - l) % 26) + 'a');
		}
		return new String(arr);
	}

}
