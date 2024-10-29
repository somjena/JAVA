package com.StringPrograms;

public class Split_Method {

	public static void main(String[] args) {
		String s = "Som is Very Good Boy";
		String []arr=s.split(" ");
		String str = "";
		for(int i =arr.length-1;i>=0;i--) {
			str+=arr[i];
			str+=" ";
		}
		System.out.println(str);

	}

}
