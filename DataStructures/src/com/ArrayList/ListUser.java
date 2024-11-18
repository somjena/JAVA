package com.ArrayList;

public class ListUser {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		System.out.println(a.Add("Soumitra Jena"));
		System.out.println(a.Add("Amit Jena"));
		System.out.println(a.Add("Ramakanta Jena"));
		System.out.println(a.Add("Laxmipriya jena"));
		
		for(int i=0;i<a.Size();i++) {
			System.out.println(a.get(i));
		}
		
		
		System.out.println(a.AddPlace(0, "Shrabana Rout"));
		System.out.println("-----------------------------------------");
		
		
		for(int i=0;i<a.Size();i++) {
			System.out.println(a.get(i));
		}
		
		
		



	}

}
