package com.ArrayPrograms;

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius=radius;
		
	}
	@Override
	public String toString() {
		return "Circle[radius= "+radius+"]";
	}
}
public class CircleDefiner {

	public static void main(String[] args) {
		Circle[]c=new Circle[4];
		c[0]=new Circle(40);
		c[1]=new Circle(50);
		c[2]=new Circle(60);
		c[3]=new Circle(70);
		for(Circle n:c) {
			System.out.println(n);
		}
		
		

	}

}
