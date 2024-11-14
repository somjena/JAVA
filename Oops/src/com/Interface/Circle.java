package com.Interface;

public class Circle implements Comparable{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public String toString() {
		return "Radius = "+radius;
	}

	@Override
	public int compareTo(Object o) {
		return radius-((Circle)o).radius;
	}

}
