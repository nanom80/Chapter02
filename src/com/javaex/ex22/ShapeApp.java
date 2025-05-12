package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
		//abstract 키워드로 차단
		//Shape s = new Shape("빨강","검정");
		//System.out.println(s.toString());
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
		
		/*
		부모만
		Shape s = new Shape("빨강", "빨강");
		*가로세로(삼각형, 사각형) 반지름(원) --> 모든 도형을 고려할수 없다 

		자식만(+부모)
		Triangle t = new Triangle("빨강", "빨강", 5, 5);
		Circle = new Circle("빨강", "빨강", 100);

		섞어쓰기
		Shape st = new Triangle("빨강", "빨강", 5, 5);
		Shape sc = new Circle("빨강", "빨강", 100);
		
		하나의 배열로 관리할수있다->자식쪽의 기능은 사용할수 없다->오버라이딩으로 해결
		부모와 자식의 메소드 형식이 같으면 자식쪽의 메소드가 부모를 덮어버린다

		#
		1.사각형, 삼각형, 원 클래스 만들기
		2.각각의 도형을 메모리에 올리고 draw()로 각각 그려본다
		3.한개의 배열에서 관리한다
		-->안된다
		  
		*사각형배열, 삼각형배열, 원 배열로는 관리가능하다
		-->도형이 늘어날때마다 배열을 새로 만들어야 한다
		
		# 최종 목표 -> 하나의 배열에 모든 도형을 관리한다
		1.부모 Shape을 만든다
		2.부모를 상속받아 사각형, 삼각형, 원을 따로 만든다
		->부모의 기능을 중복으로 만들 필요가 없고, 수정할때도 부모의 코드만 수정하면 모두 적용된다.

		*하나의 배열에 모든 도형을 관리하기 위해서
		3.!!섞어쓰기!!를 해서 메모리에 올린다.
		4.Shape[] 배열에 담는다 -> 한개의 배열로 관리가능 확인
		   
		*그러나 각각의 도형에 있는 draw()를 사용하지 못한다

		5.메소드 오버라이딩 이용해서 해결
		  ->부모 자식간의 같은 메소드가 있으면 자식의 기능이 부모의 기능을 덮어쓴다

		6. 부모쪽에 draw()을 만들어서 오버라이딩 되독록 한다
		   부모쪽의 draw()는 실제 기능은 없고 오버라이딩 용으로 만들어진 것이다
		*/
		
		System.out.println();
		System.out.println();
		System.out.println("오버라이딩");
		
		Shape st = new Triangle("초록","초록",100,100);
		st.getFillColor();
		
		Shape sc = new Circle("빨강","빨강",50);
		sc.getLineColor();
		
		Shape sr = new Rectangle("노랑","노랑",33,33);
		
		Shape[] sArr = new Shape[3];
		
		//sArr[0] = t; 업캐스팅
		sArr[0] = st;
		sArr[1] = sr;
		sArr[2] = sc;
		
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw();
		}
				
		System.out.println();
		System.out.println("다운캐스팅");
		
		//((Triangle)sArr[0]).getWidth() -> 괄호로 감싸줘야 함
		System.out.println(((Triangle)sArr[0]).getHeight());
		
		System.out.println(((Rectangle)sArr[1]).getWidth());
		
		System.out.println(((Circle)sArr[2]).getRadius());
		
		
		//Shape ss = new Shape("빨간색","빨간색"); abstract 키워드로 차단 가능
		//ss.draw();
	}

}
