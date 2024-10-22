package com.initializer.Multiline;

public class MultiLine {
         static int i ;
         int j ;
         static {
 			System.out.println("Static Initialization Start");
         	i = 20;
 		}
         {
        	 System.out.println("Non Static Initialization Start");
        	 j=30;
         }
	public static void main(String[] args) {
	        System.out.println("Static Var Using Multiline "+i);
	        MultiLine m1 = new MultiLine();
	        System.out.println("Non-Static Var Using Multiline inirializing" + m1.j);

	}

}
