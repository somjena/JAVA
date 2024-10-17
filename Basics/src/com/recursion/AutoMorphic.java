package com.recursion;
import java.util.*;
public class AutoMorphic {    // 25*25 = 625 last 2 digit same

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int Sqr = n*n;
		if((AutoMorphic(n,Sqr))) {
			System.out.println(n + " is A AutoMorphic Number");
		}else {
			System.out.println(n + "is Not a AutoMorphic Number");
		}
		

	}

private static boolean AutoMorphic(int n, int sqr) {
	if(n==0)return true;
	if(n%10!=sqr%10)return false;
	return AutoMorphic(n/=10,sqr/=10);
	
	
	
}

}
