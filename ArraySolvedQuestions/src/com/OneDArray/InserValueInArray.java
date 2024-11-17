package com.OneDArray;
//Q14
import java.util.Arrays;
import java.util.Scanner;

public class InserValueInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size You Want");
		int Size =sc.nextInt();
		int []a=new int[Size];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter The Values");
			int Values =sc.nextInt();
			a[i]=Values;
		}
		System.out.println(Arrays.toString(a));

	}

}
