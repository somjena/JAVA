package com.T2DArray;


public class Spiral {

	public static void main(String[] args) {
		int[][] a = spiral(7);
		
		for(int[] temp:a) {
			for(int n:temp) {
				System.out.print(n+"\t");
			}
			System.out.println();
			System.out.println();
		}

	}
	
	static int[][] spiral(int size)
	{
		int[][] a=new int[size][size];
		
		int r=0, c=-1;
		char dir='r';
		for(int i=1; i<=size*size; i++) {
			
			switch(dir) {
			case 'r': 	c++;
						a[r][c]=i;
						if(c==size-1 || a[r][c+1]!=0) dir='d';
						break;
						
			case 'd':	r++;
						a[r][c]=i;
						if(r==size-1 || a[r+1][c]!=0) dir='l';
						break;
						
			case 'l':	c--;
						a[r][c]=i;
						if(c==0 || a[r][c-1]!=0) dir='u';
						break;
						
			case 'u': 	r--;
						a[r][c]=i;
						if(a[r-1][c]!=0) dir='r';
						break;
								
			}
		}
		return a;
	}

}
