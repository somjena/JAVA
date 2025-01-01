package com.OneDArray;
//Q7
public class SumofEven_Odd {

	public static void main(String[] args) {
		int eSum=0;//int Variable Which store the Sum of even element
		int oSum=0;//int Variable which stire the sum of odd Number
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
