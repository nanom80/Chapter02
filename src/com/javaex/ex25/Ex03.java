package com.javaex.ex25;

import java.util.Scanner;

public class Ex03 {
	//필드
	//생성자
	//메소드gs
	
	//메소드일반
	public static void main(String[] args) {
		
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(10);
		
		System.out.println(p01.toString());
		
		Point p02 = null;
		
		try {
			p02.setX(100);
		}catch (NullPointerException e) {
			System.out.println(e.toString());
		}
		
	}
}
