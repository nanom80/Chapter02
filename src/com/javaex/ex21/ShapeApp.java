package com.javaex.ex21;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle("red","blue",4,4);
		Circle c = new Circle("red","blue",6);
		Rectangle r = new Rectangle("red","blue",5,5);
		
		System.out.println(t.toString());
		t.draw();
		System.out.println();
		System.out.println(c.toString());
		c.draw();
		System.out.println();
		System.out.println(r.toString());
		r.draw();
		
	}

}
