package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s = new Shape("빨강","검정");
		System.out.println(s.toString());
		System.out.println();
		
		Circle c = new Circle("검정","초록",10);
		System.out.println(c.toString());
		c.draw();
		System.out.println();
		
		Rectangle r = new Rectangle("빨강","주황",20,5);
		System.out.println(r.toString());
		r.draw();
		System.out.println();
		
		Triangle t = new Triangle("빨강","보라",10,10);
		System.out.println(t.toString());
		t.draw();
		
		System.out.println();
		System.out.println();
		System.out.println("오버라이딩");
		
		Shape st = new Triangle("초록","초록",100,100);
		st.getFillColor();
		
		Shape sc = new Circle("빨강","빨강",50);
		sc.getLineColor();
		
		Shape sr = new Rectangle("노랑","노랑",33,33);
		
		Shape[] sArr = new Shape[3];
		sArr[0] = st;
		sArr[1] = sr;
		sArr[2] = sc;
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw();
		}
		
	}

}
