package com.javaex.ex12;

public class MathApp {

	public static void main(String[] args) {
		
		//메소드 오버로딩
		
		Math p01 = new Math();
		p01.setX(1);
		p01.setY(2);
		p01.draw();
		
		Math p02 = new Math(10,20);
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
