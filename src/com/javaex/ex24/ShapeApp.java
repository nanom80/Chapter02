package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Shape[] sArr = new Shape[4];
		
		Drawable[] dArr = new Drawable[4];
		
		Drawable dp = new Point(5,10);
		
		/*
		dp.draw();
		((Point)dp).getX();
		((Point)dp).getY();
		*/
		
		//삼각형을 메모리에 올리고 
		Drawable dt = new Triangle("빨강","빨강",10,20);
		/*
		dt.draw();
		((Triangle)dt).getFillColor();
		((Triangle)dt).getHeight();
		*/
		Drawable dr = new Rectangle("초록","초록",20,200);
		/*
		dt.draw();
		((Rectangle)dr).getFillColor();
		((Rectangle)dr).getHeight();
		*/
		Drawable dc = new Circle("파랑","파랑",30);
		/*
		dc.draw();
		((Circle)dc).getFillColor();
		((Circle)dc).getLineColor();
		*/
		dArr[0] = dt;
		dArr[1] = dr;
		dArr[2] = dc;
		dArr[3] = dp;
		
		for(int i=0; i<dArr.length; i++) {
			dArr[i].draw();
		}
		
		//dp가 Drawable 출신인가?
		System.out.println(dp instanceof Drawable);
		
		System.out.println(dp instanceof Point);
		
		System.out.println(dp instanceof Shape);
		
		System.out.println(dt instanceof Shape);
		
		
		for(int i=0; i<dArr.length; i++) {
			if(dArr[i] instanceof Shape) {
				((Shape)dArr[i]).area();
			}
		}
		
		
	}

}
