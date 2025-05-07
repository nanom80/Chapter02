package com.javaex.ex20;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p = new Point(4,4);
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		
		p.showInfo();
		System.out.println(p.toString());
		cp1.showInfo();
		System.out.println(cp1.toString());
		cp2.showInfo();
		System.out.println(cp2.toString());
	}

}

