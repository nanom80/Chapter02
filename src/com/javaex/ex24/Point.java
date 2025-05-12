package com.javaex.ex24;

public class Point implements Drawable {
	
	private int x;
	private int y;
	
	public Point() {};
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
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
	
	//Drawable 인터페이스 구현
	public void draw() {
		System.out.println("======Point======");
		System.out.println("x:"+this.x);
		System.out.println("y:"+this.y);
		System.out.println("==================");
	}
	
}
