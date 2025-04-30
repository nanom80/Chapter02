package com.javaex.ex09;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//메모리에 올린다
		System.out.println("Point() 생성자 작동");
	}
	
	public Point(int x, int y) {
		//메모리에 올린다
		System.out.println("Point("+x+","+y+") 생성자 작동");
		this.x = x;
		this.y = y;
	}
	
	//메소드 gs
	//x대입
	public void setX(int x) {
		this.x = x;
	}
	
	//x읽기
	public int getX() {
		return x;
	}
	
	//y대입
	public void setY(int y) {
		this.y = y;
	}
	
	//y읽기
	public int getY() {
		return y;
	}
	
	//메소드 일반
	public void drow() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
	
}
