package com.OneDArray;
//Q.24
public class ConvertAccording {
	public static void main(String[] args) {
		int []a= {0,2,-1,0,2,-1,3};//Declare Array
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0){
				a[i]=-1;
				}
			else if(a[i]==-1) {
				a[i]=0;
			}
				
		}
		for(int n:a) {
			System.out.println(n);
		}


	}

}
