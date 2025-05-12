package com.javaex.ex23;

//abstract > 독단적으로 사용하지 말고 상속해서 쓰도록
public abstract class Shape {
	
	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드 gs
	public String getFillColor() {
		return fillColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public String getLineColor() {
		return lineColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	/*
	public void draw() {//이 함수는 오버라이딩되어 함수 내 코드가 실행 안됨
		System.out.println("shape draw()");
	}
	*/
	//abstract > 오버라이딩 용 메소드 작성, 내부 코드는 없음
	//abstract를 사용한 메소드는 자식이 꼭 구현해야 한다
	public abstract void draw();
	
	public abstract void area();
	
}
