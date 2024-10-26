package com.StringPrograms;

public class UpcastedReference {

	public static void main(String[] args) {
		Object o1=new String("Soumitra");
		String s1 = "Soumitra";
		System.out.println(o1.equals(s1));
		System.out.println(o1==s1);
		String s2 =(String)o1;
		System.out.println(s2.equalsIgnoreCase(s2));

	}

}
