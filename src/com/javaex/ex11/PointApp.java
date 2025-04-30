package com.javaex.ex11;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point();
		p01.setX(1);
		p01.setY(2);
		p01.draw();
		
		Point p02 = new Point(10,20);
		p02.draw();
		
		p01.remove();
		
		System.out.println();
		System.out.println("*********************");
		System.out.println();
		p01.draw();
		p01.draw(true);
		p01.draw(false);
		
	}
	
}
