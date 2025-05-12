package com.javaex.ex25;

import java.util.Scanner;

public class Ex02 {
	//필드
	//생성자
	//메소드gs
	
	//메소드일반
	public static void main(String[] args) {
		
		int[] intArr = new int[] {3,6,9};
		
		try {
			System.out.println(intArr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다");
			System.out.println(e.toString());
		}
		
	}
}
