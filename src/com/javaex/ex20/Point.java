package com.javaex.ex20;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		System.out.println("Point()");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}
	
	//메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void showInfo() {
		System.out.println("====================");
		System.out.println("X: "+this.x);
		System.out.println("Y: "+this.y);
		System.out.println("====================");
		
	}
	
}
