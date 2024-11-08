package com.ArrayPrograms;

public class SecondHighest {
	public static void main(String[] args) {
		int []a= {3,9,6,7,8,9};
		int highest=a[0];
		int sechighest=a[0];
		
		
		for(int i =1;i<a.length;i++) {
			if(a[i]==highest)continue;
			if(a[i]>highest) {
				
				sechighest=highest;
				highest=a[i];
				System.out.println("i - "+i + " if");
			}else if(a[i]>sechighest || highest==sechighest) {
				sechighest=a[i];
				System.out.println("i - "+i + " else if");
			}
		}
		System.out.println(sechighest);
	}

}
