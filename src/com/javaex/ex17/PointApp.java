package com.javaex.ex17;

public class PointApp {
	
	public static void main(String[] args) {
		
		//배열 3칸을 메모리에 올린다
		Point[] pArr = new Point[3];
		
		//메모리에 올린다
		Point p01 = new Point(5, 5);
		Point p02 = new Point(10, 10);
		Point p03 = new Point();
		p03.setX(20);
		p03.setY(20);
		
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println(p03.toString());
		System.out.println();
		
		//배열에 주소를 대입한다
		pArr[0] = p01;
		pArr[1] = p02;
		pArr[2] = p03;
		
		System.out.println(pArr[0].toString());
		System.out.println(pArr[1].toString());
		System.out.println(pArr[2].toString());
		System.out.println();
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].toString());
			pArr[i].draw();
		}
		
	}

}

