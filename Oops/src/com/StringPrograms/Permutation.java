package com.StringPrograms;

public class Permutation {

	public static void main(String[] args) {
		String s= "abc";
		int endindex = s.length()-1;
		permutation(s,0,endindex);	
	}
	static void permutation(String s,int st,int end) {
		if(st>=end) {
			System.out.println(s);
			return;
		}
		for(int i =st;i<=end;i++) {
			String s1 = Swap(s,st,i);
			permutation(s1, st+1, end);
		}
	}
	public static String Swap(String s,int i,int j) {
		char[]arr=s.toCharArray();
		char temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return new String(arr);
	}

}
