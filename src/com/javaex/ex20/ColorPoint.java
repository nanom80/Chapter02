package com.javaex.ex20;

public class ColorPoint extends Point {
	
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}
	
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); //이렇게 하거나 아래처럼 하거나
		//super.setX(x);
		//super.setY(y);
		this.color = color;
		System.out.println("ColorPoint(3)");
	}
	
	//메소드 gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "ColorPoint [x="+super.getX()+"] [y="+super.getY()+"] [color=" + color + "]";
	}
	
	public void showInfo() {
		System.out.println("====================");
		System.out.println("X: "+super.getX());
		System.out.println("Y: "+super.getY());
		System.out.println("C: "+this.color);
		System.out.println("====================");
		
	}
	
}

