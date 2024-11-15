package com.Predefined_InterFace;

import java.util.Arrays;

public class CircleStore {

	public static void main(String[] args) {
		Circle []c = {
				new Circle(40),
				new Circle(20),
				new Circle(50),
				new Circle(70)
		};
		
		Arrays.sort(c);
		
		System.out.println(Arrays.toString(c));
	}

}
