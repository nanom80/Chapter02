package com.javaex.ex23;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArr = new Shape[4];
		
		Shape t = new Triangle("빨강","빨강",5,3);
		Shape r = new Rectangle("노랑","노랑",10,10);
		Shape c = new Circle("파랑","파랑",5);
		
		sArr[0] = t;
		sArr[1] = r;
		sArr[2] = c;
		
		//포인트
		Shape p = new Point(5,5);
		sArr[3] = p;
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw();
		}
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].area();
		}
		
		//포인트에는 색깔이 없는데도 넣는 문법이 가능함>다음 프로그램에서 해결
		sArr[3].setFillColor("빨강");
		
		
	}

}
