package com.javaex.ex12;

public class Math {
	
	//메소드 오버로딩
	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Math() {
		System.out.println("Point()");
	}
	
	public Math(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}
	
	//메서드 gs
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	
	//메서드 일반
	public void draw() {
		System.out.println("x="+x+" y="+y);
		System.out.println("============");
	}
	
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("x="+x+" y="+y+" 그렸습니다.");
			System.out.println("============");
		}else {
			System.out.println("x="+x+" y="+y+" 지웠습니다.");
			System.out.println("============");
		}
	}
	
	public void remove() {
		System.out.println("x="+x+" y="+y+" 삭재했습니다.");
		System.out.println("============");
		
	}
	
}
