package com.OneDArray;

public class OddIndexValue {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		for(int i =0;i<a.length;i++) {//it will run till the array index
			if(i%2!=0)
				System.out.print(a[i]+" ");// Only Print the odd Value 
		}

	}

}
