package com.javaex.ex23;

public class Point extends Shape {
	
	//부모의 fillColor, lineColor 없어야된다. Shape를 상속할 필요없다
	//같은 배열에 들어가야 해서 Shape을 상속받았다
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
	
	public void draw() {
		System.out.println("======Point======");
		System.out.println("x:"+this.x);
		System.out.println("y:"+this.y);
		System.out.println("==================");
	}
	
	public void area() {
		System.out.println("포인트는 면적을 구할 수 없다");
	}
	
}
