package com.javaex.ex09;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(20);
		p01.drow();
		
		Point p02 = new Point(99,45);
		p02.drow();
	}
	
}
