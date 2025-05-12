package com.javaex.ex25;

import java.util.Scanner;

public class Ex01 {
	//필드
	//생성자
	//메소드gs
	
	//메소드일반
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int result = 0;
		
		try {
			result = 100/num;
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없다");
		}finally {
			System.out.println("finally 영역은 예외발생 여부와 상관없이 무조건 실행됨");
		}
		
		System.out.println(result);
		
		sc.close();
		
		
		
	}
}
