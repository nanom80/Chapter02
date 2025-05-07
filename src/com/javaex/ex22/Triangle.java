package com.javaex.ex22;

public class Triangle extends Shape {
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super.setFillColor(fillColor);
		super.setLineColor(lineColor);
		this.width = width;
		this.height = height;
	}
	
	//메소드 gs
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Triangle [fillColor=" + super.getFillColor() + ", lineColor=" + super.getLineColor() + ", width=" + width + ", height="
				+ height + "]";
	}
	
	public void draw() {
		System.out.println("====Triangle=====");
		System.out.println("면색:"+super.getFillColor());
		System.out.println("선색:"+super.getLineColor());
		System.out.println("밑변:"+this.width);
		System.out.println("높이:"+this.height);
		System.out.println("==================");
	}

}
