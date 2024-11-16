package com.OneDArray;
//Q7
public class SumofEven_Odd {

	public static void main(String[] args) {
		int eSum=0;
		int oSum=0;
		int []num= {1,2,3,4,5,6};
		
		for(int i =0;i<num.length;i++) {
			if(num[i]%2==0)eSum+=num[i];
			else
			oSum+=num[i];
		}
		System.out.println("Even Sum-"+eSum);
		System.out.println("Odd Sum-"+oSum);

	}

}
