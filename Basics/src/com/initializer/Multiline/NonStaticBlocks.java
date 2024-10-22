package com.initializer.Multiline;

public class NonStaticBlocks {
	static {
		System.out.println("Static Block Execution Start  1");
		NonStaticBlocks n1 = new NonStaticBlocks();
		
	}
	{
		System.out.println("Non Static 1");
	}
	static {
		System.out.println("Static 2");
	}

	public static void main(String[] args) {
	
	}

}
